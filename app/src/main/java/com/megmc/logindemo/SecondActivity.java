package com.megmc.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sendOn (View view) {
        Intent intent = new Intent(this, PhotoBoard.class );
        startActivity(intent);
    }

    public void loginhome (View view) {
        Intent intent = new Intent(this, MainActivity.class );
        startActivity(intent);
    }

    public void signuphome (View view) {
        Intent intent = new Intent(this, RegistrationActivity.class );
        startActivity(intent);
    }


}
