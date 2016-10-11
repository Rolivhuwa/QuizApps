package com.example.codetribe.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class WindowsActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radioGroup11;
    RadioGroup radioGroup12;
    RadioGroup radioGroup13;
    RadioGroup radioGroup14;
    RadioGroup radioGroup15;
    String name = "";
    int points = 0;
    int score = 0;

    RadioButton radioButton11;
    RadioButton radioButton12;
    RadioButton radioButton13;
    RadioButton radioButton14;
    RadioButton radioButton15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_windows);
        radioGroup11= (RadioGroup)findViewById(R.id.radioEleven);
        radioGroup12 = (RadioGroup)findViewById(R.id.radioTwelve);
        radioGroup13 = (RadioGroup)findViewById(R.id.radioTTeen);
        radioGroup14 = (RadioGroup)findViewById(R.id.radioFourteen);
        radioGroup15 = (RadioGroup)findViewById(R.id.radioFiften);

        radioGroup11.setOnCheckedChangeListener(this);
        radioGroup12.setOnCheckedChangeListener(this);
        radioGroup13.setOnCheckedChangeListener(this);
        radioGroup14.setOnCheckedChangeListener(this);
        radioGroup15.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioButton11= (RadioButton) findViewById(i);
        name = radioButton11.getText().toString();

        radioButton12 = (RadioButton) findViewById(i);
        name = radioButton12.getText().toString();

        radioButton13 = (RadioButton)findViewById(i);
        name = radioButton13.getText().toString();


        radioButton14 = (RadioButton) findViewById(i);
        name = radioButton14.getText().toString();

        radioButton15 = (RadioButton)findViewById(i);
        name = radioButton15.getText().toString();
    }
    public void onRadioEleven(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.windows10:
                if (checked)
                points ++;
                break;
            case R.id.windowserver:
                if (checked)
                    points = points + score;
                break;
            case R.id.allWindows:
                if (checked)
                    points = points + score;
                break;
            case R.id.noneWindows:
                if (checked)
                    points =points+score;
                break;

        }
    }
    public void onRadioTwelve(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.notepad:
                if (checked)
                    points++;
                break;
            case R.id.wordpad:
                if (checked)
                    points = points + score;
                break;
            case R.id.adobe:
                if (checked)
                    points = points + score;
                break;
            case R.id.paint:
                if (checked)
                    points = points + score;
                break;
        }
    }

    public void onRadioTTeen(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.truewt:
                if (checked)
                    points++;
                break;
            case R.id.falsewt:
                if (checked)
                    points=points+score;
                break;
        }
    }
    public void onRadioFourteen(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.truefour:
                if (checked)
                    points++;
                break;
            case R.id.falsefour:
                points = points+score;
                break;
        }
    }
    public void onRadioFiften(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.cyclebin:
                if (checked)
                    points=points+score;;
                break;
            case R.id.recyclebin:
                if (checked)
                   points++;
                break;
            case R.id.allabove:
                if (checked)
                    points=points+score;
                break;
            case R.id.dustbin:
                if (checked)
                    points=points+score;
        }
    }
    public void displaywindow(View view){
        Toast.makeText(this,"score: " + points,Toast.LENGTH_LONG).show();
        points = 0;
    }
    public void back3(View view){
        Intent roli = new Intent(WindowsActivity.this,MainActivity.class);
        startActivity(roli);
    }
}
