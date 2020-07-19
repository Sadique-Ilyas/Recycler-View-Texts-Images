package com.example.recyclerview_texts_images;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerAdapter recyclerAdapter;

    int []images = {R.drawable.anupam,R.drawable.effat,R.drawable.iqra,R.drawable.maggu,
                    R.drawable.maitry,R.drawable.mrinal,R.drawable.raja,R.drawable.rana,
                    R.drawable.sadique,R.drawable.shadab,R.drawable.siddharth,R.drawable.sifat,
                    R.drawable.subhasis,R.drawable.suyash,R.drawable.swati,R.drawable.uncle,R.drawable.vaibhav};

    String []names = {"Anupam","Effat","Iqra","Maggu","Maitry","Mrinal","Raja","Rana",
                        "Sadique","Shadab","Siddharth","Sifat","Subhasis","Suyash",
                        "Swati","Badhe Uncle","Vaibhav"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerAdapter = new RecyclerAdapter(images,names);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
