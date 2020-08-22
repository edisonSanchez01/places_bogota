package com.example.myplaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton imgBtnPlaceOne;
    private ImageButton imgBtnPlaceTwo;
    private ImageButton imgBtnPlaceThree;
    private ImageButton imgBtnPlaceFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBtnPlaceOne = findViewById(R.id.placeOne);
        imgBtnPlaceTwo = findViewById(R.id.placeTwo);
        imgBtnPlaceThree = findViewById(R.id.placeThree);
        imgBtnPlaceFour = findViewById(R.id.placeFour);

        imgBtnPlaceOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placeOne = new Intent(MainActivity.this, PlaceOneActivity.class);
                startActivity(placeOne);
            }
        });

        imgBtnPlaceTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placeTwo = new Intent(MainActivity.this, PlaceTwoActivity.class);
                startActivity(placeTwo);
            }
        });

        imgBtnPlaceThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placeThree = new Intent(MainActivity.this, PlaceThreeActivity.class);
                startActivity(placeThree);
            }
        });

        imgBtnPlaceFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent placeFour = new Intent(MainActivity.this, PlaceFourActivity.class);
                startActivity(placeFour);
            }
        });

    }
}