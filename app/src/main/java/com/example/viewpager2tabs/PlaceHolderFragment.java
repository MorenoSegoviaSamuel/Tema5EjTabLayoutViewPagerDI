package com.example.viewpager2tabs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Fragmento de marcador de posición para el ViewPager2.
 * Este fragmento muestra un marcador de posición con un número de sección.
 * Puede recibir el número de sección como argumento y mostrarlo en un TextView.
 * Requiere el layout 'fragment_main.xml' para su visualización.
 * Requiere el uso de un TextView con el id 'section_label' en el layout.
 * Este fragmento se utiliza en conjunto con SectionsPagerAdapter.
 *
 * @author Samuel
 * @version 1.1.0
 * @see SectionsPagerAdapter
 */
public class PlaceHolderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Constructor público requerido por Fragment.
     */
    public PlaceHolderFragment() {
        // Constructor vacío requerido por Fragment
    }

    /**
     * Método estático para crear una nueva instancia de PlaceHolderFragment con el número de sección especificado.
     *
     * @param sectionNumber El número de sección.
     * @return Una nueva instancia de PlaceHolderFragment.
     */
    public static PlaceHolderFragment newInstance(int sectionNumber) {
        PlaceHolderFragment fragment = new PlaceHolderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        // Inflar el diseño de fragment_main
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    /**
     * Método llamado cuando la vista ha sido creada y puede ser manipulada.
     * Aquí se asigna el número de sección al TextView si está disponible.
     *
     * @param view               La vista inflada en onCreateView.
     * @param savedInstanceState La instancia de Bundle que contiene el estado previamente guardado del fragmento.
     */
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null && getArguments().containsKey(ARG_SECTION_NUMBER)) {
            int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
            TextView textView = view.findViewById(R.id.section_label);
            textView.setText("FRAGMENT " + String.valueOf(sectionNumber));
        }
    }
}