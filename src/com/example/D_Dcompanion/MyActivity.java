package com.example.D_Dcompanion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//public class MyActivity extends Activity {
//    /**
//     * Called when the activity is first created.
//     */
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.main);
//    }
//}

public class MyActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button) findViewById(R.id.button);

        //listening to button event

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View arg0){
                //starting new intent
                Intent nextScreen = new Intent(getApplicationContext(), Dice.class);

                startActivity(nextScreen);
            }
        });
    }
}