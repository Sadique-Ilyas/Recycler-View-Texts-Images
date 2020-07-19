package com.example.recyclerview_texts_images;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>
{
    int images[];
    String names[];

    public RecyclerAdapter(int[] images, String[] names) {
        this.images = images;
        this.names = names;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position)
    {
        int image_id = images[position];
        String names_id = names[position];
        holder.images.setImageResource(image_id);
        holder.names.setText(names_id);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView images;
        TextView names;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            images = itemView.findViewById(R.id.image);
            names = itemView.findViewById(R.id.name);
        }
    }
}
