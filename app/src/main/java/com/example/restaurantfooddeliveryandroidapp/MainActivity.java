package com.example.restaurantfooddeliveryandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantfooddeliveryandroidapp.adapter.BestForYouAdapter;
import com.example.restaurantfooddeliveryandroidapp.model.BestForYouData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView bestForYourRecycler;
    BestForYouAdapter bestForYouAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<BestForYouData> bestForYouDataList = new ArrayList<>();
        bestForYouDataList.add(new BestForYouData("Pasta","30 min","$10", "3.2", R.drawable.bestforyou1));
        bestForYouDataList.add(new BestForYouData("Biryani","40 min","$30", "4.2", R.drawable.bestforyou2));
        bestForYouDataList.add(new BestForYouData("Singapore Rice","55 min","$50", "4.5", R.drawable.bestforyou3));
        bestForYouDataList.add(new BestForYouData("Pasta","30 min","$10", "3.2", R.drawable.bestforyou1));
        bestForYouDataList.add(new BestForYouData("Biryani","40 min","$30", "4.2", R.drawable.bestforyou2));
        bestForYouDataList.add(new BestForYouData("Singapore Rice","55 min","$50", "4.5", R.drawable.bestforyou3));

        setBestForYouRecycler(bestForYouDataList);

    }

    private  void setBestForYouRecycler(List<BestForYouData> bestForYouList){

        bestForYourRecycler = findViewById(R.id.best_for_you_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        bestForYourRecycler.setLayoutManager(layoutManager);
        bestForYouAdapter = new BestForYouAdapter(this, bestForYouList);
        bestForYourRecycler.setAdapter(bestForYouAdapter);

    }

}