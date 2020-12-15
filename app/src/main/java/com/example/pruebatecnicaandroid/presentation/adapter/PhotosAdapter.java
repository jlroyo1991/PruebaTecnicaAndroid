package com.example.pruebatecnicaandroid.presentation.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pruebatecnicaandroid.R;
import com.example.pruebatecnicaandroid.domain.entities.collection.Photo;
import com.example.pruebatecnicaandroid.utils.FormatterUtils;

import java.util.ArrayList;

import javax.inject.Inject;

import dagger.hilt.android.qualifiers.ActivityContext;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder>  {

    private ArrayList<Photo> photos;
    private Context context;
    private int position;
    private ListItemClickListener listItemClickListener;

    @Inject
    public PhotosAdapter(@ActivityContext Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PhotosAdapter.PhotosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.photo_item, parent, false);
        return new PhotosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotosAdapter.PhotosViewHolder holder, int position) {
        this.position = position;
        holder.title.setText(photos.get(position).getTitle());
        holder.autor.setText(photos.get(position).getOwner());
        String url = FormatterUtils.formatUrl(photos.get(position).getFarm(), photos.get(position).getServer(), photos.get(position).getId(),  photos.get(position).getSecret());
        Glide.with(context).load(url).centerCrop().into(holder.image);
    }

    @Override
    public int getItemCount() {
        return photos.size();
    }

    public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public void setListItemClickListener(ListItemClickListener listItemClickListener){
        this.listItemClickListener = listItemClickListener;
    }

    public Photo getSelectedPhoto(){
        return photos.get(position);
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
            itemView.setOnClickListener(view -> listItemClickListener.onListItemClick(getSelectedPhoto().getId(), getSelectedPhoto().getSecret()));
        }
    }
}