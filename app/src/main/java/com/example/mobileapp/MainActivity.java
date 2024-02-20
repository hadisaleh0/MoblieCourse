package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button displayButton;

    EditText nameEditText;

    TextView displayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initlayoutComponents();
        initButtonDisplay();
    }

    private void initlayoutComponents(){

        displayButton = findViewById(R.id.Button);
        nameEditText  = findViewById(R.id.editTextName);
        displayText   = findViewById(R.id.textViewDisplay);

    }

    private void initButtonDisplay(){
        displayButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String nametoDisplay = nameEditText.getText().toString();
                displayText.setText("Hello "+ nametoDisplay);
                Log.d("MainActivity", "This is a log message");
            }
        });

    }

}