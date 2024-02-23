package com.example.viewpager2tabs;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
/**
 * Adaptador para manejar los fragmentos dentro de un ViewPager2.
 * Este adaptador proporciona los fragmentos a mostrar en el ViewPager2.
 * Los fragmentos se crean según la posición en el ViewPager2.
 * Este adaptador se utiliza en conjunto con MainActivity y ViewPager2.
 * Requiere la implementación de métodos abstractos createFragment y getItemCount.
 * Requiere el uso de FragmentStateAdapter para un ViewPager2.
 *
 * @author Samuel
 * @version 1.1.0
 * @see FragmentHome
 * @see FragmentPrincipal
 * @see FragmentSlidshow
 * @see MainActivity
 */
public class SectionsPagerAdapter extends FragmentStateAdapter {
    private final Context context;

    /**
     * Constructor del adaptador de fragmentos.
     *
     * @param context       El contexto de la aplicación.
     * @param fragmentManager El FragmentManager utilizado para administrar los fragmentos.
     * @param lifecycle     El Lifecycle asociado al componente que aloja los fragmentos.
     */
    public SectionsPagerAdapter(Context context, FragmentManager fragmentManager, Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        this.context = context;
    }

    /**
     * Método llamado para crear el fragmento en la posición especificada.
     *
     * @param position La posición del fragmento en el ViewPager2.
     * @return El fragmento creado para la posición especificada.
     */
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FragmentHome();
            case 1:
                return new FragmentPrincipal();
            case 2:
                return new FragmentSlidshow();
            default:
                return null;
        }
    }

    /**
     * Método llamado para obtener el número total de fragmentos en el ViewPager2.
     *
     * @return El número total de fragmentos en el ViewPager2.
     */
    @Override
    public int getItemCount() {
        return 3;
    }
}