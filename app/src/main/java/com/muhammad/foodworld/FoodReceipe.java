package com.muhammad.foodworld;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Muhammad on 18/12/2015.
 */
public class FoodReceipe extends Activity implements FoodListFragment.FoodListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodreceipe);
        //FoodDetailFragment frag = (FoodDetailFragment)
        //getFragmentManager(). findFragmentById(R.id.detail_frag);
        //frag.setFood(0);


    }

    @Override
    public void itemClicked(long id){
        FoodDetailFragment details = new FoodDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        details.setFood(id);
        ft.replace(R.id.fragment_container, details);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
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

