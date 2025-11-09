package com.example.Calma;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import com.example.Calma.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Référence au bouton "Get Started"
        Button btnGetStarted = findViewById(R.id.btnExplore);

        // Référence au bouton "Explore"
        Button btnExplore;

        // Redirection vers LoginActivity
        btnGetStarted.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });

    }
}

