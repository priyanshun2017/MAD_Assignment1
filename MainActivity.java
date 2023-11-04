package com.example.dualactivity21cs1034;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
public class MainActivity extends AppCompatActivity implements Components{

    TextView name;
    TextView password;
    Button proceed;

    //String name_user;
    //int password_user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.text_view_name);
        password = findViewById(R.id.text_view_password);
        proceed = findViewById(R.id.button_next_page);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name_user = getname();
                password_user = getpassword();

                // Now you can use name_user and password_user for further processing or navigation.
                // For example, you can start a new activity using an Intent.
                Intent intent = new Intent(MainActivity.this, PresentationActivity.class);
                // You can also pass data to the next activity if needed.
                intent.putExtra("name", name_user);
                intent.putExtra("password", password_user);
                startActivity(intent);
            }
        });
    }

    private int getpassword() {
        // Implement this method to retrieve the password from the password TextView.
        // You'll need to convert it from a String to an integer if necessary.
        String passwordText = password.getText().toString();
        int password = Integer.parseInt(passwordText);
        return password;
    }

    private String getname() {
        // Implement this method to retrieve the name from the name TextView.
        return name.getText().toString();
    }
}
*/
public class MainActivity extends AppCompatActivity {

    TextView name;
    TextView password;
    Button proceed;
    Components userComponents = new Components(); // Create an instance of Components


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.text_view_name);
        password = findViewById(R.id.text_view_password);
        proceed = findViewById(R.id.button_next_page);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userComponents.name_user = getname();
                userComponents.password_user = getpassword();

                // Now you can use userComponents.name_user and userComponents.password_user for further processing or navigation.
                // For example, you can start a new activity using an Intent.
                Intent intent = new Intent(MainActivity.this, PresentationActivity.class);
                intent.putExtra("name", userComponents.name_user);
                intent.putExtra("password", userComponents.password_user);
                startActivity(intent);
            }
        });
    }

    private int getpassword() {
        String passwordText = password.getText().toString();
        int password = Integer.parseInt(passwordText);
        return password;
    }

    private String getname() {
        return name.getText().toString();
    }
}
