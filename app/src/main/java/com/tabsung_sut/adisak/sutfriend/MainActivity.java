package com.tabsung_sut.adisak.sutfriend;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   // Main Method

    //Get Event From Click Buttom
    public void clickSingUpMain(View view){
        startActivity(new);
    }

}   //Main Class นี่คือ คลาสหลัก
