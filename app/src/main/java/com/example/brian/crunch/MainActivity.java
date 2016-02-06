package com.example.brian.crunch;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.TextView;

import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText userInput = (EditText)findViewById(R.id.input);
                double number = Double.valueOf(userInput.getText().toString());
                EditText userInput1 = (EditText)findViewById(R.id.input2);
                Double weight = Double.valueOf(userInput1.getText().toString());
                Spinner mySpinner = (Spinner) findViewById(R.id.spinner);
                String excerise = mySpinner.getSelectedItem().toString();

                double calc = calconvert(number, weight, excerise);


                TextView pushuprep = (TextView)findViewById(R.id.ex1);
                TextView situprep = (TextView)findViewById(R.id.ex2);
                TextView squatsrep = (TextView)findViewById(R.id.ex3);
                TextView legliftrep = (TextView)findViewById(R.id.ex4);
                TextView plankrep = (TextView)findViewById(R.id.ex5);
                TextView jumpingjackrep = (TextView)findViewById(R.id.ex6);
                TextView pullingrep = (TextView)findViewById(R.id.ex7);
                TextView cyclingrep = (TextView)findViewById(R.id.ex8);
                TextView walkingrep = (TextView)findViewById(R.id.ex9);
                TextView joggingrep = (TextView)findViewById(R.id.ex10);
                TextView swimmingrep = (TextView)findViewById(R.id.ex11);
                TextView stairclimbingrep = (TextView)findViewById(R.id.ex12);
                TextView calc1 = (TextView)findViewById(R.id.Calories);

                calc1.setText(String.valueOf(calc));

                pushuprep.setText(String.valueOf(Math.ceil(calc / weight/.0019)) + " PUSH UPS");
                situprep.setText(String.valueOf(Math.ceil(calc/weight/.0033))+ " SIT UPS");
                squatsrep.setText(String.valueOf(Math.ceil(calc/weight/.0030)) + " SQUATS");
                legliftrep.setText(String.valueOf(Math.ceil(calc/weight/.0906))+ " MINS LEG LIFTS");
                plankrep.setText(String.valueOf(Math.ceil(calc/weight/.0906))+ " MINS PLANKS");
                jumpingjackrep.setText(String.valueOf(Math.ceil(calc/weight/.0667))+ " MINS JUMPING JACKS");
                pullingrep.setText(String.valueOf(Math.ceil(calc/weight/.0067))+ " PULL UPS");
                cyclingrep.setText(String.valueOf(Math.ceil(calc/weight/.0067))+ " MINS CYCLING");
                walkingrep.setText(String.valueOf(Math.ceil(calc/weight/.0333))+ " MINS WALKING");
                joggingrep.setText(String.valueOf(Math.ceil(calc/weight/.0556))+ " MINS JOGGING");
                swimmingrep.setText(String.valueOf(Math.ceil(calc/weight/.0513))+ " MINS SWIMMING");
                stairclimbingrep.setText(String.valueOf(Math.ceil(calc/weight/.0444))+ " MINS STAIR CLIMBING");




            }
        });
    }



    public double calconvert(double input, double weight, String excerise) {
        double calc = 0.0;
        if (excerise.equals("PUSH UP")) {
            calc = input * weight * .0019;
        }
        if (excerise.equals("SIT UP")) {
            calc = input * weight * .0033;
        }
        if (excerise.equals("SQUATS")) {
            calc = input * weight * .0030;
        }
        if (excerise.equals("LEG LIFT")){
            calc = input * weight * .0906;
        }
        if (excerise.equals("PLANK")){
            calc = input * weight * .0906;
        }
        if (excerise.equals("JUMPING JACK")){
            calc = input * weight * .0667;
        }
        if (excerise.equals("PULL UP")){
            calc = input * weight * .0067;
        }
        if (excerise.equals("CYCLING")){
            calc = input * weight * .0556;
        }
        if (excerise.equals("WALKING")){
            calc = input * weight * .0333;
        }
        if (excerise.equals("JOGGING")){
            calc = input * weight * .0556;
        }
        if (excerise.equals("SWIMMING")){
            calc = input * weight * .0513;
        }
        if (excerise.equals("STAIR CLIMBING")){
            calc = input * weight * .0444;
        }
        return calc;

    }
}
