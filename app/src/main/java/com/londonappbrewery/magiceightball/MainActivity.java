package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisp = findViewById(R.id.img_Cha);
        Button clicker = findViewById(R.id.ask_Btn);
        final int[] ballAr =
                {
                        R.drawable.ball1,
                        R.drawable.ball2,
                        R.drawable.ball3,
                        R.drawable.ball4,
                        R.drawable.ball5
                };
        clicker.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Random randomGenerator= new Random();
                int anum = randomGenerator.nextInt(5);
                ballDisp.setImageResource(ballAr[anum]);
            }
        });
    }
}
