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
import android.widget.TextView;

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
       TextView tv3 = (TextView) findViewById(R.id.tv2);
        TextView tv10 = (TextView) findViewById(R.id.tv10);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);


            }
        });

//        Erronious

//        b1= (Button) findViewById(R.id.ib1);
//        b2 = (Button) findViewById(R.id.ib2);

    }

//    *****This code also works

    //    public void adminClicked(View view){
//        Intent i =new Intent(getApplicationContext(), LoginActivity.class);
//        startActivity(i);
//
//    }
    public void userClicked(View view){
        Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }

    public void SecondClick (View view){
        Intent intent=new Intent(getApplicationContext(),FirstActivity_Second.class);
        startActivity(intent);
    }

    public void Click_10 (View view){
        Intent intent=new Intent(getApplicationContext(),Shortcut1.class);
        startActivity(intent);
    }
}
