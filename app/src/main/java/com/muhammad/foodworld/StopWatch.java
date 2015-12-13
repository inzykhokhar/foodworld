package com.muhammad.foodworld;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Handler;


/**
 * Created by Muhammad on 13/12/2015.
 */
public class StopWatch extends AppCompatActivity {

    // record the number of seconds pass
    private int seconds = 0;
    private boolean running;
    private boolean wasRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stopwatch);

        if(savedInstanceState !=null){
            // retrieve the value of seconds and running from libraries
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("runnig");
            // pass the running vairable state
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        //Start the stopwatch method when activity is created
        runTimer();
    }
    public void onClickStart ( View view) {
        // start the stop watch
        running = true;
    }
    public void onClickStop (View view) {
        // stop the running stopwatch
        running = false;
    }

    public void onClickReset( View view) {
        // stop the running watch and reset to 0;
        running = false;
        seconds = 0;
    }


    private void runTimer() {
        // get the reference to timeview by ID
        final TextView timeView = (TextView) findViewById(R.id.time_view);
        // Define Handler which will be used to schedule
        final Handler handler = new Handler();

        // Runnable objects defines a run() function

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/ 3600;
                int minutes = (seconds  % 3600/ 60);
                int secs = seconds % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeView.setText(time);
                if (running){
                    seconds ++;
                }

                handler.postDelayed(this,1000);

            }
        });


    }
    @Override

    public void onSaveInstanceState (Bundle savedInstanceState){
        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.getBoolean("running", running);
        savedInstanceState.getBoolean("wasRunning", wasRunning);
    }



    }
