package com.example.restaurantfooddeliveryandroidapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restaurantfooddeliveryandroidapp.R;
import com.example.restaurantfooddeliveryandroidapp.model.NearbyData;

import java.util.List;

public class NearbyAdapter extends RecyclerView.Adapter<NearbyAdapter.NearbyViewHolderViewHolder> {

    Context context;
    List<NearbyData> nearbyList;

    public NearbyAdapter(Context context, List<NearbyData> nearbyList) {
        this.context = context;
        this.nearbyList = nearbyList;
    }

    @NonNull
    @Override
    public NearbyViewHolderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.nearby_row_item, parent, false);

        return new NearbyViewHolderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NearbyViewHolderViewHolder holder, int position) {

        holder.placeImage.setImageResource(nearbyList.get(position).getImageUrl());
        holder.placeName.setText(nearbyList.get(position).getName());
        holder.placeTime.setText(nearbyList.get(position).getTime());

    }

    @Override
    public int getItemCount() {
        return nearbyList.size();
    }


    public static final class NearbyViewHolderViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView placeName, placeTime;

        public NearbyViewHolderViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            placeName = itemView.findViewById(R.id.place_name);
            placeTime = itemView.findViewById(R.id.place_time);

        }
    }
}
