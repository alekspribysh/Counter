package com.example.android.counter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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


    private  int scoreA;
    private  int scoreB;
    private  String vinner;

    public void tpointsA (View view) {

        scoreA = scoreA +3;
        displayScoreA(scoreA);
    }

    public void twpointsA (View view) {

        scoreA = scoreA +2;
        displayScoreA(scoreA);
    }

    public void fpointsA (View view) {

        scoreA = scoreA +1;
        displayScoreA(scoreA);
    }



    public void tpointsB (View view) {

        scoreB = scoreB +3;
        displayScoreB(scoreB);
    }

    public void twpointsB (View view) {

        scoreB = scoreB +2;
        displayScoreB(scoreB);
    }

    public void fpointsB (View view) {

        scoreB = scoreB +1;
        displayScoreB(scoreB);
    }

    public void displayViner(View v){
        if (scoreA > scoreB) {
            vinner = " Vinner Team A";
        }

        if (scoreA < scoreB) {
            vinner = " Vinner Team B";
        }

        if (scoreA == scoreB ){
           vinner = "DRAW";
        }

        displayVinner(vinner);
    }

    public void reset(View v){

        scoreA = 0;
        scoreB =0;
        vinner = "";
        displayVinner(vinner);
        displayScoreA(scoreA);
        displayScoreB(scoreB);
    }


    public void displayScoreA(int a){
        TextView scoreA = (TextView) findViewById(
                R.id.scoreA
        );
        scoreA.setText(String.valueOf(a));
    }

    public void displayScoreB(int a){
        TextView scoreB = (TextView) findViewById(
                R.id.scoreB
        );
        scoreB.setText(String.valueOf(a));
    }

    public void displayVinner(String str){

        TextView vinner = (TextView) findViewById(
                R.id.showVinner);
        vinner.setText(str);
    }


}
