package com.example.myapplication;

import android.app.DownloadManager;
import android.app.VoiceInteractor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListRestaurantAdapter extends RecyclerView.Adapter<ListRestaurantAdapter.ListViewHolder> {
    private ArrayList<Restourant> listRestournat;
    
    public ListRestaurantAdapter(ArrayList<Restourant> list) {
        this.listRestournat = list;
    }
    
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_food, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Restourant restourant = listRestournat.get(position);
        Glade.with(holder.itemView.getContext())
                .load.with(restourant.getPhoto());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public ListViewHolder(View view) {
            super(view);
        }
    }
}
