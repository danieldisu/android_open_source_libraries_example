package com.danieldisu.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends Activity {

    @InjectView(R.id.firstEditText)
    EditText firstEditText;

    @InjectView(R.id.secondEditText)
    EditText secondEditText;

    @InjectView(R.id.thirdEditText)
    EditText thirdEditText;

    @InjectView(R.id.fourthEditText)
    EditText fourthEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.thatButton)
    public void doSomethingWithTheButton() {
        Toast.makeText(this, firstEditText.getText().toString(), Toast.LENGTH_LONG).show();
    }

}
