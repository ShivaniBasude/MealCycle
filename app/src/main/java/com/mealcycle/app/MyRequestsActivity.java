
package com.mealcycle.app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MyRequestsActivity extends AppCompatActivity {

    Button btnBackToReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_requests);

        btnBackToReceiver = findViewById(R.id.btnBackToReceiver);

        btnBackToReceiver.setOnClickListener(v -> finish());
    }
}

