package com.example.coloractivity1;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinner = (Spinner) findViewById(R.id.color_spinner);

        final String[] viewcolors = {"yellow","green","red","white","blue","gray","darkGray","lightGray","magenta","cyan"};

       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, viewcolors );

       // adapter.setDropDownView(R.layout.activity_main;

        //set adapter to spinner


        myAdapter colorAdapter = new myAdapter(this,R.layout.spinner_layout,viewcolors );

        spinner.setAdapter(colorAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                ConstraintLayout canvas = findViewById(R.id.layoutback);
                canvas.setBackgroundColor(Color.parseColor(viewcolors[position]));

                ConstraintLayout base = findViewById(R.id.base_color);
                base.setBackgroundColor(Color.WHITE);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }
}
