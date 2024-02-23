package com.example.viewpager2tabs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

/**
 * Actividad principal que contiene un ViewPager2 con pestañas (TabLayout).
 * Utiliza un SectionsPagerAdapter para gestionar los fragmentos dentro del ViewPager2.
 * Requiere el layout 'activity_main.xml' para su visualización.
 * Requiere el uso de un ViewPager2 con el id 'pager' y un TabLayout con el id 'tabs' en el layout.
 * Utiliza una instancia de TransitionPageTransformer para aplicar transiciones a las páginas del ViewPager2.
 * Las etiquetas de las pestañas del TabLayout se generan dinámicamente utilizando un TabLayoutMediator.
 *
 * @author Samuel
 * @version 1.1.0
 * @see TabLayout
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Método llamado cuando se crea la actividad.
     *
     * @param savedInstanceState La instancia de Bundle que contiene el estado previamente guardado de la actividad.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.pager);
        TabLayout tabs = findViewById(R.id.tabs);

        // Aplicar una transición a las páginas del ViewPager2
        TransitionPageTransformer transitionPageTransformer = new TransitionPageTransformer();
        viewPager.setPageTransformer(transitionPageTransformer);

        // Configurar el adaptador del ViewPager2
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager(),
                getLifecycle());
        viewPager.setAdapter(sectionsPagerAdapter);

        // Vincular el TabLayout con el ViewPager2 y configurar las etiquetas de las pestañas
        new TabLayoutMediator(tabs, viewPager, (tab, position) -> {
            tab.setText("TAB " + (position + 1));
        }).attach();
    }
}