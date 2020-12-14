package com.example.pruebatecnicaandroid.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.domain.entities.collection.Photo;

import java.util.ArrayList;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder> {

    private final ArrayList<Photo> photos;
    Context context;

    public PhotosAdapter(Context context, ArrayList<Photo> articles) {
        this.context = context;
        this.photos = articles;
    }

    @NonNull
    @Override
    public PhotosAdapter.PhotosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.photo_item, parent, false);
        return new  PhotosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotosAdapter.PhotosViewHolder holder, int position) {
        holder.title.setText(photos.get(position).getTitle());
        holder.autor.setText(photos.get(position).getOwner());

        String url = "https://farm" + photos.get(position).getFarm() + ".staticflickr.com/" + photos.get(position).getServer() + '/' + photos.get(position).getId() + '_' + photos.get(position).getSecret() + ".jpg\n";

        Glide.with(context)
                .load(url)
                .centerCrop()
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public class PhotosViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView autor;
        ImageView image;

        public PhotosViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            autor = itemView.findViewById(R.id.autor);
            image = itemView.findViewById(R.id.imageView);

        }
    }
}