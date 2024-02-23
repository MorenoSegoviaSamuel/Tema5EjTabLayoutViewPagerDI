package com.example.viewpager2tabs;

import android.view.View;

import androidx.viewpager2.widget.ViewPager2;

/**
 * Clase para aplicar una transformación de página personalizada a un ViewPager2.
 * Esta clase implementa la interfaz ViewPager2.PageTransformer.
 * La transformación consiste en rotar las páginas en un ángulo de 90 grados en función de su posición.
 * Requiere la implementación del método transformPage.
 * Esta clase se utiliza en conjunto con MainActivity y ViewPager2 para aplicar la transformación de página.
 *
 * @author Samuel
 * @version 1.1.0
 * @see MainActivity
 * @see ViewPager2
 */
public class TransitionPageTransformer implements ViewPager2.PageTransformer {

    /**
     * Método para aplicar la transformación de página a una vista en el ViewPager2.
     *
     * @param page      La vista de la página que se está transformando.
     * @param position  La posición relativa de la página en el ViewPager2.
     */
    @Override
    public void transformPage(View page, float position) {
        // Limitar la posición entre -1 y 1
        position = Math.max(-1f, Math.min(1f, position));

        // Calcular el ángulo de rotación basado en la posición
        float rotation = position * 90;

        // Establecer el pivote de rotación en función de la dirección de la página
        page.setPivotX(position < 0 ? page.getWidth() : 0);
        page.setPivotY(page.getHeight() * 0.5f);

        // Aplicar la rotación en el eje Y
        page.setRotationY(rotation);
    }
}
