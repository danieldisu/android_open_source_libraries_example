package com.danieldisu.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        EditText firstEditText = (EditText) findViewById(R.id.firstEditText);
        EditText secondEditText = (EditText) findViewById(R.id.secondEditText);
        EditText thirdEditText = (EditText) findViewById(R.id.thirdEditText);
        EditText fourthEditText = (EditText) findViewById(R.id.fourthEditText);

        Button thatButton = (Button) findViewById(R.id.thatButton);

        thatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doSomethingWithTheButton();
            }
        });
    }

    private void doSomethingWithTheButton() {

    }


}
