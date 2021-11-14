package com.example.restaurantfooddeliveryandroidapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantfooddeliveryandroidapp.R;
import com.example.restaurantfooddeliveryandroidapp.model.BestForYouData;

import java.util.List;

public class BestForYouAdapter extends RecyclerView.Adapter<BestForYouAdapter.BestForYouViewHolder> {

    Context context;
    List<BestForYouData> bestForYouList;

    public BestForYouAdapter(Context context, List<BestForYouData> bestForYouList) {
        this.context = context;
        this.bestForYouList = bestForYouList;
    }

    @NonNull
    @Override
    public BestForYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.best_for_you_row_item, parent, false);

        return new BestForYouViewHolder(view);
    }

    @Override
    public void onBindViewHolder( BestForYouViewHolder holder, int position) {

        holder.itemImage.setImageResource(bestForYouList.get(position).getImageUrl());
        holder.itemName.setText(bestForYouList.get(position).getName());
        holder.itemTime.setText(bestForYouList.get(position).getTime());
        holder.itemPrice.setText(bestForYouList.get(position).getPrice());
        holder.itemRating.setRating(Float.parseFloat(bestForYouList.get(position).getRating()));

    }

    @Override
    public int getItemCount() {
        return bestForYouList.size();
    }


    public static final class BestForYouViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
        TextView itemName, itemTime, itemPrice;
        RatingBar itemRating;

        public BestForYouViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.item_image);
            itemName = itemView.findViewById(R.id.item_name);
            itemTime = itemView.findViewById(R.id.item_time);
            itemPrice = itemView.findViewById(R.id.item_price);
            itemRating = itemView.findViewById(R.id.ratingBar);

        }
    }
}
