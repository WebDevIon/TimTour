package com.example.webdevion.timtour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PlacesOfInterestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.national_opera_name), getString(R.string.national_opera_address), R.drawable.opera));
        places.add(new Place(getString(R.string.cathedral_name), getString(R.string.cathedral_address), R.drawable.catedrala));
        places.add(new Place(getString(R.string.opera_square_name), getString(R.string.opera_square_address), R.drawable.piata_victoriei));
        places.add(new Place(getString(R.string.union_square_name), getString(R.string.union_square_address), R.drawable.piata_unirii));
        places.add(new Place(getString(R.string.freedom_square_name), getString(R.string.freedom_square_address), R.drawable.piata_libertatii));
        places.add(new Place(getString(R.string.square_700_name), getString(R.string.square_700_address), R.drawable.piata_700));
        places.add(new Place(getString(R.string.zoo_name), getString(R.string.zoo_address), R.drawable.zoo));
        places.add(new Place(getString(R.string.bega_name), getString(R.string.bega_address), R.drawable.bega));
        places.add(new Place(getString(R.string.green_forrest_name), getString(R.string.green_forrest_address), R.drawable.padurea_verde));


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
