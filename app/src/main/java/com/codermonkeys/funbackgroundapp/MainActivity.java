package com.codermonkeys.funbackgroundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relLayout;
    private ImageButton imgButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relLayout = (RelativeLayout) findViewById(R.id.rootLayout);
        imgButton = (ImageButton) findViewById(R.id.buttonImage);

        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random =  new Random();
                int randColor = Color.argb(255,random.nextInt(256), random.nextInt(256), random.nextInt(256));
                relLayout.setBackgroundColor(randColor);
            }
        });
    }
}
