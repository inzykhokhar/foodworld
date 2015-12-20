package com.muhammad.foodworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ReceiveMessage extends AppCompatActivity {

    // to be used for intent.putEXTRA function as target varaiable
    public static final String EXTRA_MESSAGE = "Something";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        // adding required libraries
        Intent intent = getIntent();
        //retrieve the message from the intent view using StringExtra
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        // get reference to TextView
        TextView messageView = (TextView)findViewById(R.id.message);
        //set Text of TextView
        messageView.setText(messageText);


    }

}