package com.example.wt_rdit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    ArrayList<ChatRecord> records;
    public ChatAdapter(ArrayList<ChatRecord> list)
    {
        records = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvName.setText(records.get(position).getName());
        holder.tvMsg.setText(records.get(position).getMsg());
        holder.tvTime.setText(records.get(position).getTime());
        holder.tvUnreadMessages.setText(records.get(position).getUnreadMessages()+"");

        if(records.get(position).getProfile().equals("aish"))
        {
            holder.ivProfPic.setImageResource(R.drawable.aish);
        }
        else if(records.get(position).getProfile().equals("salman"))
        {
            holder.ivProfPic.setImageResource(R.drawable.salman);
        }
        else if(records.get(position).getProfile().equals("ranbir"))
        {
            holder.ivProfPic.setImageResource(R.drawable.ranbir);
        }
        else if(records.get(position).getProfile().equals("pariyanka"))
        {
            holder.ivProfPic.setImageResource(R.drawable.priyanka);
        }
        else if(records.get(position).getProfile().equals("katrina"))
        {
            holder.ivProfPic.setImageResource(R.drawable.katrina);
        }
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ivProfPic;
        TextView tvName, tvMsg, tvTime, tvUnreadMessages;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivProfPic = itemView.findViewById(R.id.ivProfPic);
            tvMsg = itemView.findViewById(R.id.tvMsg);
            tvName = itemView.findViewById(R.id.tvName);
            tvTime = itemView.findViewById(R.id.tvTime);
            tvUnreadMessages = itemView.findViewById(R.id.tvNotification);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), "Clicked", Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

}
