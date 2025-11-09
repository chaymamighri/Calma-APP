package com.example.Calma;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    // Déclaration des vues
    private LinearLayout navAccueil, navProfile, navStatistiques;
    private ImageView iconLogout;
    private FrameLayout cardMeditation, cardBreathing, cardMood, cardArticles;
    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Références aux vues
        tvWelcome = findViewById(R.id.tvWelcome);

        navAccueil = findViewById(R.id.navAccueil);
        navProfile = findViewById(R.id.navProfile);
        navStatistiques = findViewById(R.id.navStatistiques);
        iconLogout = findViewById(R.id.iconLogout);

        cardMeditation = findViewById(R.id.cardMeditation);
        cardBreathing = findViewById(R.id.cardBreathing);
        cardMood = findViewById(R.id.cardMood);
        cardArticles = findViewById(R.id.cardArticles);

        // Exemple : afficher le nom de l'utilisateur
        String username = "Chayma"; // Remplace par le nom réel depuis login ou base de données
        tvWelcome.setText("Welcome, " + username + "!");

        // Navigation en haut
        navAccueil.setOnClickListener(v -> {
            // Déjà sur l'accueil
        });

        navProfile.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ProfileActivity.class);
            startActivity(intent);
        });

        navStatistiques.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, StatisticsActivity.class);
            startActivity(intent);
        });

        iconLogout.setOnClickListener(v -> {
            // Déconnexion : revenir à LoginActivity
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        });

        // Cartes principales
        cardMeditation.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MeditationActivity.class);
            startActivity(intent);
        });

        cardBreathing.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, BreathingActivity.class);
            startActivity(intent);
        });

        cardMood.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MoodActivity.class);
            startActivity(intent);
        });

        cardArticles.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ArticlesActivity.class);
            startActivity(intent);
        });
    }
}
