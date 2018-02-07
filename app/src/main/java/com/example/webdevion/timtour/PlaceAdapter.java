package com.example.webdevion.timtour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Place} objects.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    /** Resource ID for the background color for this list of places */
    private int mColorResourceId;

    /**
     * Create a new {@link PlaceAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param places is the list of {@link Place}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for the specified category
     */
    public PlaceAdapter(Context context, ArrayList<Place> places, int colorResourceId) {
        super(context, 0, places);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        Place currentPlace = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID name_text_view.
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the name of the place from the currentPlace object and set this text on
        // the Name Text View.
        nameTextView.setText(currentPlace.getNameOfPlace());

        // Find the TextView in the list_item.xml layout with the ID working_hours_text_view.
        TextView workingHoursTextView = (TextView) listItemView.findViewById(R.id.working_hours_text_view);

        // Check if working hours are provided for this place or not
        if (currentPlace.hasWorkingHours()) {
            // If working hours are available, display the provided working hours and set this text on
            // the working hours TextView
            workingHoursTextView.setText(currentPlace.getWorkingHours());
            // Make sure the view is visible
            workingHoursTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            workingHoursTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        // Get the address from the currentPlace object and set this text on
        // the address TextView.
        addressTextView.setText(currentPlace.getAddress());

        // Find the TextView in the list_item.xml layout with the ID rating_text_view.
        TextView ratingTextView = (TextView) listItemView.findViewById(R.id.rating_text_view);

        // Check if an rating is provided for this place or not
        if (currentPlace.hasRating()) {
            // If an rating is available, display the provided rating and set this text on
            // the rating TextView
            ratingTextView.setText(currentPlace.getRating());
            // Make sure the view is visible
            ratingTextView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the TextView (set visibility to GONE)
            ratingTextView.setVisibility(View.GONE);
        }

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_image);

        // Get the image resource ID from the currentPlace object and display the image.
        imageView.setImageResource(currentPlace.getImageResourceId());

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 4 TextViews and 1 image) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
