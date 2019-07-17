package com.example.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button aboutBtn;
    private Button myProfileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Go to ALC website
        aboutBtn = (Button)findViewById(R.id.aboutAlc);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alc = "https://andela.com/alc";
                Uri webAddress = Uri.parse(alc);

                Intent gotoAlc = new Intent(Intent.ACTION_VIEW, webAddress);
                if (gotoAlc.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoAlc);
                }
            }
        });

        //Go to view My Profile
        myProfileBtn =(Button) findViewById(R.id.myProfile);
        myProfileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutAlc();
            }

            private void openAboutAlc() {
                Intent intent = new Intent(MainActivity.this, MyProfile.class);
                startActivity(intent);
            }
        });
    }
}
