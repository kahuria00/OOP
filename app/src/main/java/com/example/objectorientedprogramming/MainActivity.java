package com.example.objectorientedprogramming;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Car toyota=new Car("White","Toyota",4,100);
        Car jeep=new Car("grey","Jeep",4,120);
        Car subaru=new Car("Black","Subaru",4,115);
        Car nissan= new Car("blue", "Nissan",4,80);
        Car benz=new Car("white","Mercedez",4,150);


        toyota.hoot();
        subaru.carryGoods();
        toyota.accelerate(100);
        Log.d("Car","Speed demon"+toyota.getSpeed() );
        Log.d("Car ", benz.getColor());

        Taxi taxify = new Taxi("yellow","peugoet",4,80);
        taxify.hoot ();
        taxify.stop();
        Log.d("Taxi","The Taxi Stopped at  "+ taxify.stop());


        SportsCar masserati= new SportsCar("Red","Masserati",4,180);
        masserati.accelerate(150);
        masserati.getSpeed();
        Log.d("SportsCar","Current speed is "+ masserati.getSpeed());
        masserati.hoot();
        masserati.hoot("BUYAKASHAAAAAAAAAAAAAA");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
