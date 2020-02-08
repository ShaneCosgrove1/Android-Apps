package com.shanecosgrove.rollthedice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice; // stores the value of the imageView
    private Random rng = new Random(); // calls a random value
    private EditText roll_outcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice  = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() { //listens for a click
            @Override
            public void onClick(View v) { // every time we click on the image view(dice image) it will call roll dice method
                rollDice();
            }
        });
        roll_outcome = findViewById(R.id.roll_outcome);
        roll_outcome.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) { // every time we click on the image view(dice image) it will call roll dice method
                rollDice();
            }
        });

        };


    private void rollDice(){
        int randomNumber = rng.nextInt(6)+1; // bound 6 will return a number between 0-5 so need to add +1 to get 1-6

        switch(randomNumber){ // switch statement will check the value of randomNumber and change the image based on the value.
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                roll_outcome.setText("You rolled a : One");

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                roll_outcome.setText("You rolled a : Two");
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                roll_outcome.setText("You rolled a : Three");
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                roll_outcome.setText("You rolled a : Four");
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                roll_outcome.setText("You rolled a : Five");
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                roll_outcome.setText("You rolled a : Six");
                break;
            default:

        }

    }
    private void diceOutCome(int randomNumber){


        switch(randomNumber){ // switch statement will check the value of randomNumber and change the image based on the value.
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);

                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
            default:

        }

    }
}
