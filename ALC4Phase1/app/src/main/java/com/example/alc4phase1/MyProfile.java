package com.example.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        EditText edittext = findViewById(R.id.name);
        TextView name = findViewById(R.id.track);
        TextView country = findViewById(R.id.country);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);
        TextView username = findViewById(R.id.username);
    }
}
