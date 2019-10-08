package com.example.viewattributefun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button myButton = (Button) findViewById(R.id.button);
                String buttonText = myButton.getText().toString();
                String but = buttonText.toLowerCase();
                if((but.compareTo("on")) == 0) {
                    myButton.setText("off");
                } else {
                    myButton.setText("on");
                }
            }
        });
    }
}
