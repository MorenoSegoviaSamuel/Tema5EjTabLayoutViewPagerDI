package com.example.viewpager2tabs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ImagenAdapter extends RecyclerView.Adapter<ImagenAdapter.FotoViewHolder>{
    private List<Imagen> imagenes;

    public ImagenAdapter(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    @Override
    public FotoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_recycler, parent, false);
        return new FotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FotoViewHolder holder, int position) {
        holder.bind(imagenes.get(position));
    }

    @Override
    public int getItemCount() {
        return imagenes.size();
    }

    public static class FotoViewHolder extends RecyclerView.ViewHolder {
        protected ImageView imageView;

        public FotoViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
        }

        public void bind(Imagen imagen) {
            imageView.setImageResource(imagen.getIdDrawable());
        }
    }
}
