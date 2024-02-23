package com.example.viewpager2tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


public class FragmentPrincipal extends Fragment {
    public FragmentPrincipal() {
    }

    List<Imagen> imagenes = List.of(
            new Imagen("Mariposa", R.drawable.mariposa),
            new Imagen("Pato", R.drawable.pato),
            new Imagen("Ardilla", R.drawable.ardilla),
            new Imagen("Gato",R.drawable.gato),
            new Imagen("Rana", R.drawable.rana));

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_principal, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        ImagenAdapter adapter = new ImagenAdapter(imagenes);

        recyclerView.setAdapter(adapter);

        return view;
    }
}