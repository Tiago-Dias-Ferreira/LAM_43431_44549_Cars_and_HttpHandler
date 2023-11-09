package com.example.lam_43431_44549_cars_and_models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapterModels extends RecyclerView.Adapter<MyViewHolder>{

    Context context;
    List<Model> models;

    public MyAdapterModels(Context context, List<Model> models){
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;
        view = LayoutInflater.from(context).inflate(R.layout.layout_line, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.textView.setText(models.get(position).getName());
        holder.imageView.setImageResource(models.get(position).getImage());
        holder.imageView.setTag(models.get(position).getImage());
    }

    @Override
    public int getItemCount(){
        return models.size();
    }

}
