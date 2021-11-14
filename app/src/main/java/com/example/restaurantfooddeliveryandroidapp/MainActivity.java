package com.example.restaurantfooddeliveryandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.restaurantfooddeliveryandroidapp.adapter.BestForYouAdapter;
import com.example.restaurantfooddeliveryandroidapp.adapter.NearbyAdapter;
import com.example.restaurantfooddeliveryandroidapp.model.BestForYouData;
import com.example.restaurantfooddeliveryandroidapp.model.NearbyData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView bestForYourRecycler, nearbyRecycler;
    BestForYouAdapter bestForYouAdapter;
    NearbyAdapter nearbyAdapter;

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

        List<NearbyData> nearbyDataList = new ArrayList<>();
        nearbyDataList.add(new NearbyData("Sagar Ratna","35 min", R.drawable.nearby));
        nearbyDataList.add(new NearbyData("Haldi Ram","45 min", R.drawable.nearby));
        nearbyDataList.add(new NearbyData("KFC","55 min", R.drawable.nearby));
        nearbyDataList.add(new NearbyData("China Town","30 min", R.drawable.nearby));

        setNearbyRecycler(nearbyDataList);

    }

    private  void setBestForYouRecycler(List<BestForYouData> bestForYouList){

        bestForYourRecycler = findViewById(R.id.best_for_you_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        bestForYourRecycler.setLayoutManager(layoutManager);
        bestForYouAdapter = new BestForYouAdapter(this, bestForYouList);
        bestForYourRecycler.setAdapter(bestForYouAdapter);

    }

    private  void setNearbyRecycler(List<NearbyData> nearbyDataList){

        nearbyRecycler = findViewById(R.id.nearby_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        nearbyRecycler.setLayoutManager(layoutManager);
        nearbyAdapter = new NearbyAdapter(this, nearbyDataList);
        nearbyRecycler.setAdapter(nearbyAdapter);

    }

}