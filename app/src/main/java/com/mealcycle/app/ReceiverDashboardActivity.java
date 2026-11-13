package com.mealcycle.app;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiverDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_dashboard);

        Button btnBrowseFood = findViewById(R.id.btnBrowseFood);
        Button btnMyRequests = findViewById(R.id.btnMyRequests);
        Button btnHistory = findViewById(R.id.btnHistory);
        Button btnProfile = findViewById(R.id.btnProfile);

        btnBrowseFood.setOnClickListener(v -> {
            Intent intent = new Intent(
                    ReceiverDashboardActivity.this,
                    BrowseFoodActivity.class
            );
            startActivity(intent);
        });

        btnMyRequests.setOnClickListener(v -> {
            Intent intent = new Intent(
                    ReceiverDashboardActivity.this,
                    MyRequestsActivity.class
            );
            startActivity(intent);
        });

        btnHistory.setOnClickListener(v -> {
            Intent intent = new Intent(
                    ReceiverDashboardActivity.this,
                    HistoryActivity.class
            );
            startActivity(intent);
        });

        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(
                    ReceiverDashboardActivity.this,
                    ProfileActivity.class
            );
            startActivity(intent);
        });
    }
}
