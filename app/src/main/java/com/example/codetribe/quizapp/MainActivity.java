package com.example.codetribe.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void history(View view){
        Intent roli = new Intent(MainActivity.this,HistoryActivity.class);
        startActivity(roli);

    }
    public void bible(View view){
        Intent roli = new Intent(MainActivity.this,BibleActivity.class);
        startActivity(roli);
    }
    public void windows(View view){
        Intent roli = new Intent(MainActivity.this,WindowsActivity.class);
        startActivity(roli);
    }
}
