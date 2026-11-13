
package com.mealcycle.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DonorDashboardActivity extends AppCompatActivity {

    Button btnAddFood, btnMyListings, btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_dashboard);

        btnAddFood = findViewById(R.id.btnAddFood);
        btnMyListings = findViewById(R.id.btnMyListings);
        btnProfile = findViewById(R.id.btnProfile);

        btnAddFood.setOnClickListener(v -> {
            startActivity(new Intent(DonorDashboardActivity.this,
                    AddFoodActivity.class));
        });

        btnMyListings.setOnClickListener(v -> {
            startActivity(new Intent(DonorDashboardActivity.this,
                    MyListingsActivity.class));
        });

        btnProfile.setOnClickListener(v -> {
            startActivity(new Intent(DonorDashboardActivity.this,
                    ProfileActivity.class));
        });
    }
}
