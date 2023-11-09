package com.example.lam_43431_44549_cars_and_models;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.HashMap;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;
    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView2);
    }


}
