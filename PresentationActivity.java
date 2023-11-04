package com.example.dualactivity21cs1034;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PresentationActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_presentation);

            // Get the name from the intent extras sent from MainActivity
            Intent intent = getIntent();
            if (intent != null) {
                String name = intent.getStringExtra("name");
                int password = intent.getIntExtra("password", 0); // Default value in case password is not provided

                // Display the name and password (if needed) in TextViews
                TextView nameTextView = findViewById(R.id.text_view_name);
                TextView passwordTextView = findViewById(R.id.text_view_password);

                nameTextView.setText(name); // Set the name in the TextView
                passwordTextView.setText(String.valueOf(password)); // Set the password as a string
            }
        }

    }
