package com.example.viewpager2tabs;

/**
 * Representa una imagen con su nombre y su identificador de imagen drawable.
 *
 * @author Samuel
 * @version 1.1.0
 */
public class Imagen {
    private String nombre;
    private int idDrawable;

    /**
     * Constructor de la clase Imagen.
     *
     * @param nombre     El nombre de la imagen.
     * @param idDrawable El identificador de la imagen drawable asociada.
     */
    public Imagen(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    /**
     * Obtiene el nombre de la imagen.
     *
     * @return El nombre de la imagen.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la imagen.
     *
     * @param nombre El nombre de la imagen.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador de la imagen drawable asociada.
     *
     * @return El identificador de la imagen drawable asociada.
     */
    public int getIdDrawable() {
        return idDrawable;
    }

    /**
     * Establece el identificador de la imagen drawable asociada.
     *
     * @param idDrawable El identificador de la imagen drawable asociada.
     */
    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }
}
