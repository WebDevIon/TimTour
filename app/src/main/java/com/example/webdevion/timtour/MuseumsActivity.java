package com.example.webdevion.timtour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.art_museum_name), getString(R.string.art_museum_program), getString(R.string.art_museum_address), R.drawable.muzeul_de_arta));
        places.add(new Place(getString(R.string.banat_museum_name), getString(R.string.banat_museum_program), getString(R.string.banat_museum_address), R.drawable.muzeul_satului));
        places.add(new Place(getString(R.string.cathedral_museum_name), getString(R.string.cathedral_museum_program), getString(R.string.cathedral_museum_address), R.drawable.muzeul_catedralei));
        places.add(new Place(getString(R.string.comunist_consumer_museum_name), getString(R.string.comunist_consumer_museum_program), getString(R.string.comunist_consumer_museum_address), R.drawable.muzeul_consumatorului_comunist));
        places.add(new Place(getString(R.string.kindlein_museum_name), getString(R.string.kindlein_museum_program), getString(R.string.kindlein_museum_address), R.drawable.muzeul_kindlein));

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
