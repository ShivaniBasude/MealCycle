
package com.mealcycle.app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BrowseFoodActivity extends AppCompatActivity {

    Button btnRequestRice, btnRequestBread, btnRequestFruit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse_food);

        btnRequestRice = findViewById(R.id.btnRequestRice);
        btnRequestBread = findViewById(R.id.btnRequestBread);
        btnRequestFruit = findViewById(R.id.btnRequestFruit);

        btnRequestRice.setOnClickListener(v ->
                showRequestMessage("Vegetable Rice"));

        btnRequestBread.setOnClickListener(v ->
                showRequestMessage("Fresh Bread"));

        btnRequestFruit.setOnClickListener(v ->
                showRequestMessage("Fresh Fruits"));
    }

    private void showRequestMessage(String foodName) {
        Toast.makeText(this,
                "Request for " + foodName
                        + " is ready. Backend integration is pending.",
                Toast.LENGTH_LONG).show();
    }
}

