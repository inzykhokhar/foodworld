package com.muhammad.foodworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class Share extends AppCompatActivity {

    private boolean messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

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


// on Send message funtion
    public void onSendMessage(View view) {
        /*get reference from edit text and retrives the message string
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString()
        // function to do something with Receieve Message class
        Intent intent = new Intent(this, ReceiveMessage.class);
        // adding text to the intent, giving it s name to EXTRA MESSAGE
        intent.putExtra(ReceiveMessage.EXTRA_MESSAGE, messageText);*/
        // creating an intent uses a send action

        Intent intent = new Intent (Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        startActivity(intent);


    }
}
