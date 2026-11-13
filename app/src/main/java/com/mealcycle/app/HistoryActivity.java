
package com.mealcycle.app;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HistoryActivity extends AppCompatActivity {

    Button btnBackToDashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        btnBackToDashboard = findViewById(R.id.btnBackToDashboard);

        btnBackToDashboard.setOnClickListener(v -> finish());
    }
}
