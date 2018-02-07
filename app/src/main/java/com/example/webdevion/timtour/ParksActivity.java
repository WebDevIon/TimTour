package com.example.webdevion.timtour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.central_park_name), getString(R.string.central_park_address), R.drawable.parcul_central));
        places.add(new Place(getString(R.string.botanic_park_name), getString(R.string.botanic_park_address), R.drawable.parcul_botanic));
        places.add(new Place(getString(R.string.roses_park_name), getString(R.string.roses_park_address), R.drawable.parcul_rozelor));
        places.add(new Place(getString(R.string.childrens_park_name), getString(R.string.childrens_park_address), R.drawable.parcul_copiilor));
        places.add(new Place(getString(R.string.justice_park_name), getString(R.string.justice_park_address), R.drawable.parcul_justitiei));
        places.add(new Place(getString(R.string.queen_mary_park_name), getString(R.string.queen_mary_park_address), R.drawable.parcul_regina_maria));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.items_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

    }
}
