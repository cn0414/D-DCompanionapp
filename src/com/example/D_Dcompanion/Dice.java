package com.example.D_Dcompanion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by Christian on 8/24/2014.
 */

public class Dice extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dicescreenalt);

        Button button8 = (Button) findViewById(R.id.button8);

        //listening to button event
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //starting new intent
                Intent nextScreen = new Intent(getApplicationContext(), MyActivity.class);

                startActivity(nextScreen);
            }
        });


        Button button = (Button) findViewById(R.id.button);
        final TextView textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d4 = rndNumbers.nextInt(4) +1;
                String txtd4 = Integer.toString(d4);
                textView.setText(txtd4);

            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        final TextView textView2 = (TextView) findViewById(R.id.textView2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d6 = rndNumbers.nextInt(6) +1;
                String txtd6 = Integer.toString(d6);
                textView2.setText(txtd6);
            }
        });

        Button button3 = (Button) findViewById(R.id.button3);
        final TextView textView3 = (TextView) findViewById(R.id.textView3);
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d8 = rndNumbers.nextInt(8) +1;
                String txtd8 = Integer.toString(d8);
                textView3.setText(txtd8);
            }
        });

        Button button4 = (Button) findViewById(R.id.button4);
        final TextView textView4 = (TextView) findViewById(R.id.textView4);
        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d10 = rndNumbers.nextInt(10) +1;
                String txtd10 = Integer.toString(d10);
                textView4.setText(txtd10);
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        final TextView textView5 = (TextView) findViewById(R.id.textView5);
        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d100 = rndNumbers.nextInt(100) +1;
                String txtd100 = Integer.toString(d100);
                textView5.setText(txtd100);
            }
        });

        Button button6 = (Button) findViewById(R.id.button6);
        final TextView textView6 = (TextView) findViewById(R.id.textView6);
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d12 = rndNumbers.nextInt(12) +1;
                String txtd12 = Integer.toString(d12);
                textView6.setText(txtd12);
            }
        });

        Button button7 = (Button) findViewById(R.id.button7);
        final TextView textView7 = (TextView) findViewById(R.id.textView7);
        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                Random rndNumbers = new Random();
                int d20 = rndNumbers.nextInt(20) +1;
                String txtd20 = Integer.toString(d20);
                textView7.setText(txtd20);
            }
        });
    }
}
