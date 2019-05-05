package com.guessnumber.furrki.guessnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText numberInput;
    Button tryButton;
    TextView resultText;

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game = new Game();

        numberInput = findViewById(R.id.numberInput);
        tryButton = findViewById(R.id.tryButton);
        resultText = findViewById(R.id.resultText);

        tryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int guessNumber =Integer.parseInt(	 numberInput.getText().toString());

                String hitOutput = game.hit(guessNumber);
                resultText.setText(hitOutput);
            }
        });
    }
}
