package com.ivan.exercise;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ivan.exercise.data.Accessory;

import java.util.List;

class AccessoriesAdapter extends RecyclerView.Adapter<AccessoryViewHolder> {
    private List<Accessory> data;

    public AccessoriesAdapter(List<Accessory> data) {
        this.data = data;
    }

    @Override
    public AccessoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_accessory, parent, false);
        AccessoryViewHolder viewHolder = new AccessoryViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(AccessoryViewHolder holder, int position) {
        Accessory item = data.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return this.data.size();
    }
}
