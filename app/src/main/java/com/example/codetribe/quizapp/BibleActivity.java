package com.example.codetribe.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class BibleActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup radioGroup6;
    RadioGroup radioGroup7;
    RadioGroup radioGroup8;
    RadioGroup radioGroup9;
    RadioGroup radioGroup10;

    String name = "";
    int points = 0;
    int score = 0;

    RadioButton radioButton6;
    RadioButton radioButton7;
    RadioButton radioButton8;
    RadioButton radioButton9;
    RadioButton radioButton10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bible);


        radioGroup6 = (RadioGroup)findViewById(R.id.radioSix);
        radioGroup7 = (RadioGroup)findViewById(R.id.radioSeven);
        radioGroup8 = (RadioGroup)findViewById(R.id.radioEight);
        radioGroup9 = (RadioGroup)findViewById(R.id.radioNine);
        radioGroup10 = (RadioGroup)findViewById(R.id.radioTen);

        radioGroup6.setOnCheckedChangeListener(this);
        radioGroup7.setOnCheckedChangeListener(this);
        radioGroup8.setOnCheckedChangeListener(this);
        radioGroup9.setOnCheckedChangeListener(this);
        radioGroup10.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioButton6 = (RadioButton)findViewById(i);
        name = radioButton6.getText().toString();

        radioButton7 = (RadioButton)findViewById(i);
        name = radioButton7.getText().toString();

        radioButton8 = (RadioButton)findViewById(i);
        name = radioButton8.getText().toString();

        radioButton9 = (RadioButton)findViewById(i);
        name = radioButton9.getText().toString();

        radioButton10 = (RadioButton)findViewById(i);
        name = radioButton10.getText().toString();

    }

    public void onRadioSix(View view) {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.truebs:
                if (checked)
                    points++;
                    // trues are the best
                    break;
            case R.id.falsebs:
                if (checked)
                    points =points + score;
                    // Ninjas rule
                    break;
        }
    }

    public void onRadioSeven(View view){
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked
        switch (view.getId()){
            case R.id.truebb:
                if (checked)
                    points++;
                break;
            case R.id.falsebb:
                if (checked)
                    points =points + score;
                break;
        }
    }
    public void onRadioEight(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){
            case R.id.book1:
                if (checked)
                    points =points + score;
                break;
            case R.id.book2:
                if (checked)
                    points++;
                break;
            case R.id.book3:
                if (checked)
                    points =points + score;
                break;
            case R.id.book4:
                if (checked)
                    points =points + score;
                break;
        }
    }
    public void onRadioNine(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.benjamin:
                if (checked)
                    points =points + score;
                break;
            case R.id.joseph:
                if (checked)
                    points =points + score;
                break;
            case R.id.lot:
                if (checked)
                    points++;
                break;
            case R.id.rueben:
                if (checked)
                    points =points + score;
        }
    }

    public void onRadioTen(View view){
        boolean checked = ((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.john:
                if (checked)
                    points =points + score;
                break;
            case R.id.simeon:
                if (checked)
                    points++;
                break;
            case R.id.peter:
                if (checked)
                    points =points + score;
                break;
            case R.id.priest:
                if (checked)
                    points =points + score;
        }
    }
    public void displaybible(View view){
        Toast.makeText(this,"Score: "+points,Toast.LENGTH_LONG).show();
        points = 0;
    }
    public void back2(View view){
        Intent roli = new Intent(BibleActivity.this,MainActivity.class);
        startActivity(roli);
    }
}
