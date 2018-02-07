package com.example.webdevion.timtour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the restaurants category
        TextView restaurants = (TextView) findViewById(R.id.restaurants_list);

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the restaurants View is clicked on.
            @Override
            public void onClick(View v) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        // Find the View that shows the museums category
        TextView museums = (TextView) findViewById(R.id.museums_list);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the museums View is clicked on.
            @Override
            public void onClick(View v) {
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the parks category
        TextView parks = (TextView) findViewById(R.id.parks_list);

        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the parks View is clicked on.
            @Override
            public void onClick(View v) {
                Intent parksIntent = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(parksIntent);
            }
        });

        // Find the View that shows the places of interest category
        TextView placesOfInterest = (TextView) findViewById(R.id.places_list);

        // Set a click listener on that View
        placesOfInterest.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the places of interest View is clicked on.
            @Override
            public void onClick(View v) {
                Intent placesOfInterestIntent = new Intent(MainActivity.this, PlacesOfInterestActivity.class);
                startActivity(placesOfInterestIntent);
            }
        });
    }
}
