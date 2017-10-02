package com.kikebmx.myaudiolibrob;

import android.app.Application;

import java.util.Vector;

/**
 * Created by quiqu on 11/09/2017.
 */

public class Aplicacion extends Application
{
    private Vector<Libro> vectorLibros;
    private AdaptadorLibros adaptador;
    @Override
    public void onCreate() {
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibros (this, vectorLibros);
    }
    public AdaptadorLibros getAdaptador() {
        return adaptador;
    }
    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }
}

