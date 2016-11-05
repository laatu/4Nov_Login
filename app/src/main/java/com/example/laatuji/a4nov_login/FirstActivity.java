package com.example.laatuji.a4nov_login;

/**
 * Created by laatuji on 11/4/16.
 */


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.AppCompatImageButton;

import com.example.laatuji.a4nov_login.LoginActivity;

public class FirstActivity extends AppCompatActivity {
// AppCompactImage
//   Button b1,b2;
    AppCompatImageButton b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        b1=  (AppCompatImageButton) findViewById(R.id.ib1);
        b2 = (AppCompatImageButton) findViewById(R.id.ib2);

//        Erronious

//        b1= (Button) findViewById(R.id.ib1);
//        b2 = (Button) findViewById(R.id.ib2);

    }
    public void adminClicked(View view){
        Intent i =new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);

    }
    public void userClicked(View view){
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}
