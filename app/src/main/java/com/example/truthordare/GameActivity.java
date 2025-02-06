package com.example.truthordare;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {
    private TextView questionText;
    private GameLogic gameLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        questionText = findViewById(R.id.questionText);
        Button truthButton = findViewById(R.id.truthButton);
        Button dareButton = findViewById(R.id.dareButton);

        gameLogic = new GameLogic();

        // When the Truth button is clicked, show a Truth question
        truthButton.setOnClickListener(v -> questionText.setText(gameLogic.getRandomTruth()));

        // When the Dare button is clicked, show a Dare challenge
        dareButton.setOnClickListener(v -> questionText.setText(gameLogic.getRandomDare()));
    }
}
