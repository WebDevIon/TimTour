package com.example.webdevion.timtour;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.places_list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.amphora_name), getString(R.string.amphora_program), getString(R.string.amphora_address), getString(R.string.amphora_rating), R.drawable.amphora));
        places.add(new Place(getString(R.string.biofresh_name), getString(R.string.biofresh_program), getString(R.string.biofresh_address), getString(R.string.biofresh_rating), R.drawable.biofresh));
        places.add(new Place(getString(R.string.casa_bunicii_name), getString(R.string.casa_bunicii_program), getString(R.string.casa_bunicii_address), getString(R.string.casa_bunicii_rating), R.drawable.casa_bunicii));
        places.add(new Place(getString(R.string.casa_cu_flori_name), getString(R.string.casa_cu_flori_program), getString(R.string.casa_cu_flori_address), getString(R.string.casa_cu_flori_rating), R.drawable.casa_cu_flori));
        places.add(new Place(getString(R.string.caruso_name), getString(R.string.caruso_program), getString(R.string.caruso_address), getString(R.string.caruso_rating), R.drawable.caruso));
        places.add(new Place(getString(R.string.jarvis_name), getString(R.string.jarvis_program), getString(R.string.jarvis_address), getString(R.string.jarvis_rating), R.drawable.jarvis));
        places.add(new Place(getString(R.string.little_hanoi_name), getString(R.string.little_hanoi_program), getString(R.string.little_hanoi_address), getString(R.string.little_hanoi_rating), R.drawable.little_hanoi));
        places.add(new Place(getString(R.string.locanda_del_corso_name), getString(R.string.locanda_del_corso_program), getString(R.string.locanda_del_corso_address), getString(R.string.locanda_del_corso_rating), R.drawable.locanda_del_corso));
        places.add(new Place(getString(R.string.misto_name), getString(R.string.misto_program), getString(R.string.misto_address), getString(R.string.misto_rating), R.drawable.misto));
        places.add(new Place(getString(R.string.sky_name), getString(R.string.sky_program), getString(R.string.sky_address), getString(R.string.sky_rating), R.drawable.sky_restaurant));

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
