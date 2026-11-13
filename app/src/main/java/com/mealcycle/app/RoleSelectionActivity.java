package com.mealcycle.app;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RoleSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);

        Button btnDonor = findViewById(R.id.btnDonor);
        Button btnReceiver = findViewById(R.id.btnReceiver);

        btnDonor.setOnClickListener(v -> {
            Intent intent = new Intent(
                    RoleSelectionActivity.this,
                    DonorDashboardActivity.class
            );
            startActivity(intent);
        });

        btnReceiver.setOnClickListener(v -> {
            Intent intent = new Intent(RoleSelectionActivity.this,
                    ReceiverDashboardActivity.class);
            startActivity(intent);
        });
    }
}
