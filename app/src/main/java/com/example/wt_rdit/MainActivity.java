package com.example.wt_rdit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    RecyclerView rvListHori;
    RecyclerView.LayoutManager manager;

    ArrayList<ChatRecord> chats;
    ChatAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rvListVer);
        rvListHori = findViewById(R.id.rvListHori);
        rvListHori.setHasFixedSize(true);
        rvListHori.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        rvList.setHasFixedSize(true);
        manager = new LinearLayoutManager(this);
        rvList.setLayoutManager(manager);
        chats = new ArrayList<>();

        chats.add(new ChatRecord("aish","Aishwariya Rai", "Hi, How are you?","11:49 AM", 1));
        chats.add(new ChatRecord("salman","Salman Khan", "Hello, My name is salman","3:49 PM", 3));
        chats.add(new ChatRecord("ranbir","Ranbir Kapoor", "Oh, Hello ","2:49 PM", 1));
        chats.add(new ChatRecord("pariyanka","Pariyanka Chopra", "OMG","1:49 AM", 2));
        chats.add(new ChatRecord("katrina","Katrina Kaif", "Yummy","12:49 PM", 5));
        chats.add(new ChatRecord("aish","Aishwariya Rai", "Hi, How are you?","11:49 AM", 1));
        chats.add(new ChatRecord("salman","Salman Khan", "Hello, My name is salman","3:49 PM", 3));
        chats.add(new ChatRecord("ranbir","Ranbir Kapoor", "Oh, Hello ","2:49 PM", 1));
        chats.add(new ChatRecord("pariyanka","Pariyanka Chopra", "OMG","1:49 AM", 2));
        chats.add(new ChatRecord("katrina","Katrina Kaif", "Yummy","12:49 PM", 5));


        myAdapter = new ChatAdapter(chats);
        rvList.setAdapter(myAdapter);

        rvListHori.setAdapter(new ProfileAdapter(chats));





    }
}