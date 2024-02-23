package com.example.viewpager2tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * Fragmento para la pantalla principal.
 * Este fragmento muestra una lista de imágenes en un RecyclerView.
 * Las imágenes se pasan a través de un ImagenAdapter.
 *
 * @author Samuel
 * @version 1.1.0
 * @see Imagen
 * @see ImagenAdapter
 */
public class FragmentPrincipal extends Fragment {
    private List<Imagen> imagenes = List.of(
            new Imagen("Mariposa", R.drawable.mariposa),
            new Imagen("Pato", R.drawable.pato),
            new Imagen("Ardilla", R.drawable.ardilla),
            new Imagen("Gato", R.drawable.gato),
            new Imagen("Rana", R.drawable.rana));

    /**
     * Constructor público requerido por Fragment.
     */
    public FragmentPrincipal() {
        // Constructor vacío requerido por Fragment
    }

    /**
     * Método llamado para crear y devolver la vista asociada con el fragmento.
     *
     * @param inflater           El LayoutInflater que se utilizará para inflar la vista.
     * @param container          El ViewGroup en el que se inflará la vista.
     * @param savedInstanceState La instancia de Bundle que contiene el estado previamente guardado del fragmento.
     * @return La vista inflada para este fragmento.
     */
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