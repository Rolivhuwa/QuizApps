package com.example.codetribe.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup radioGroup1;
    RadioGroup radioGroup2;
    RadioGroup radioGroup3;
    RadioGroup radioGroup4;
    RadioGroup radioGroup5;

    int points = 0;
    int score = 0;
    String name = "";

    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;
    RadioButton radioButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        radioGroup1 = (RadioGroup)findViewById(R.id.radioOne);
        radioGroup2 = (RadioGroup)findViewById(R.id.radioTwo);
        radioGroup3 = (RadioGroup)findViewById(R.id.radioThree);
        radioGroup4 = (RadioGroup)findViewById(R.id.radioFour);
        radioGroup5 = (RadioGroup)findViewById(R.id.radioFive);

        radioGroup1.setOnCheckedChangeListener(this);
        radioGroup2.setOnCheckedChangeListener(this);
        radioGroup3.setOnCheckedChangeListener(this);
        radioGroup4.setOnCheckedChangeListener(this);
        radioGroup5.setOnCheckedChangeListener(this);


        //TextView text = (TextView) findViewById(R.id.test);
        //text.setText("");



    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioButton1 = (RadioButton)findViewById(i);
        name = radioButton1.getText().toString();

        radioButton2 = (RadioButton)findViewById(i);
        name = radioButton2.getText().toString();

        radioButton3 = (RadioButton)findViewById(i);
        name=radioButton3.getText().toString();

        radioButton4 = (RadioButton)findViewById(i);
        name = radioButton3.getText().toString();

        radioButton5 = (RadioButton)findViewById(i);
        name = radioButton5.getText().toString();


        //if("1804".equals(name))
       // {

         //   points++;
          //  Toast.makeText(this,""+points,Toast.LENGTH_LONG).show();
       // }

    }
    public void onRadioOne(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.o1704:
                if (checked)
                    points=points+score;
                break;
            case R.id.o1910:
                if (checked)
                    points=points+score;
                break;
            case R.id.o1810:
                if (checked)
                    points=points+score;
                break;
            case R.id.o1804:
                if (checked)
                    points++;
                break;
        }
    }
    public void onRadioTwo(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.english:
                if (checked)
                    points=points+score;
                break;
            case R.id.french:
                if (checked)
                    points++;
                break;
            case R.id.portugues:
                if (checked)
                    points=points+score;
                break;
            case R.id.italiano:
                if (checked)
                    points=points+score;
                break;
        }
    }
    public void onRadioThree(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.trueht:
                if (checked)
                    points++;
                break;
            case R.id.falseht:
                if (checked)
                    points=points+score;
                break;
        }
    }
    public void onRadioFour(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.truehf:
                if (checked)
                    points++;
                break;
            case R.id.falsehf:
                if (checked)
                    points=points+score;
                break;
        }
    }
    public void onRadioFive(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()){
            case R.id.henry:
                if (checked)
                    points++;
                break;
            case R.id.richard:
                if (checked)
                    points=points+score;
                break;
            case R.id.sirfrancis:
                if (checked)
                    points = points+score;
                break;
            case R.id.thomas:
                if (checked)
                    points = points+score;
        }
    }
    public void displayhistory(View view){
        Toast.makeText(this,"Score: "+points,Toast.LENGTH_LONG).show();
        points = 0;
    }
    public void back(View view){
        Intent roli = new Intent(HistoryActivity.this,MainActivity.class);
        startActivity(roli);
    }
}
