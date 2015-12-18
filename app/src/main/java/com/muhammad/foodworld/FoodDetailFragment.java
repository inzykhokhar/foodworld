package com.muhammad.foodworld;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FoodDetailFragment extends Fragment {
    private long foodId;


    public FoodDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if(savedInstanceState != null){
            foodId = savedInstanceState.getLong("foodId");
        }
        return inflater.inflate(R.layout.fragment_food_detail, container, false);

    }

    @Override
    public void onStart(){
        super.onStart();
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Food food = Food.foods[(int) foodId];
            title.setText(food.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(food.getDescription());
        }
    }

    public void setFood (long id){
        this.foodId = id;
    }


    public interface FoodListListner {
        void itemClicked(long id);
    }
}
