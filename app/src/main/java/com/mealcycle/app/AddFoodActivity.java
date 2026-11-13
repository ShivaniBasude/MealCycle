package com.mealcycle.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddFoodActivity extends AppCompatActivity {

    EditText etFoodName, etCategory, etQuantity,
            etLocation, etDescription, etPickupDeadline;

    Button btnPublishFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        etFoodName = findViewById(R.id.etFoodName);
        etCategory = findViewById(R.id.etCategory);
        etQuantity = findViewById(R.id.etQuantity);
        etLocation = findViewById(R.id.etLocation);
        etDescription = findViewById(R.id.etDescription);
        etPickupDeadline = findViewById(R.id.etPickupDeadline);
        btnPublishFood = findViewById(R.id.btnPublishFood);

        btnPublishFood.setOnClickListener(v -> {

            String foodName = etFoodName.getText().toString().trim();
            String category = etCategory.getText().toString().trim();
            String quantity = etQuantity.getText().toString().trim();
            String location = etLocation.getText().toString().trim();
            String description = etDescription.getText().toString().trim();
            String deadline = etPickupDeadline.getText().toString().trim();

            if (foodName.isEmpty() || category.isEmpty()
                    || quantity.isEmpty() || location.isEmpty()
                    || deadline.isEmpty()) {

                Toast.makeText(this,
                        "Please fill in all required fields",
                        Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(this,
                        "Listing details are ready! Backend integration is pending.",
                        Toast.LENGTH_LONG).show();

                finish();
            }
        });
    }
}

