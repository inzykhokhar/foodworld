package com.muhammad.foodworld;


import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class FoodListFragment extends ListFragment {


    public FoodListFragment() {
        // Required empty public constructor
    }

    static interface FoodListListener {
        void itemClicked(long id);

    }

    ;

    private FoodListListener listener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[Food.foods.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = Food.foods[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.listener = (FoodListListener) context;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        if (listener != null){
            listener.itemClicked(id);
        }
    }

}

