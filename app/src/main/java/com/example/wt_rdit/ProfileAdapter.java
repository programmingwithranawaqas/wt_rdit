package com.example.wt_rdit;

import android.app.Notification;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolder> {

    ArrayList<ChatRecord> records;
    public ProfileAdapter(ArrayList<ChatRecord> list)
    {
        records = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_pics, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(records.get(position).getProfile().equals("aish"))
        {
            holder.ivProfile.setImageResource(R.drawable.aish);
        }
        else if(records.get(position).getProfile().equals("salman"))
        {
            holder.ivProfile.setImageResource(R.drawable.salman);
        }
        else if(records.get(position).getProfile().equals("ranbir"))
        {
            holder.ivProfile.setImageResource(R.drawable.ranbir);
        }
        else if(records.get(position).getProfile().equals("pariyanka"))
        {
            holder.ivProfile.setImageResource(R.drawable.priyanka);
        }
        else if(records.get(position).getProfile().equals("katrina"))
        {
            holder.ivProfile.setImageResource(R.drawable.katrina);
        }
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivProfile;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfile = itemView.findViewById(R.id.ivProfile);
        }
    }
}
