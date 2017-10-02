package com.kikebmx.myaudiolibrob;

import android.content.Context;

import java.util.Vector;

/**
 * Created by quiqu on 13/09/2017.
 */

public class InfoGlobal
{
    private Vector<Libro> vectorLibros;

    public Vector<Libro> getVectorLibros() {
        return vectorLibros;
    }

    public AdaptadorLibros getAdaptador() {
        return adaptador;
    }

    private AdaptadorLibros adaptador;

    private static InfoGlobal INSTANCIA = new InfoGlobal();
    private InfoGlobal () {}

    public static InfoGlobal getInstancia(){
        return INSTANCIA;
    }

    public void inicializa(Context contexto){
        vectorLibros = Libro.ejemploLibros();
        adaptador = new AdaptadorLibros(contexto, vectorLibros);
    }


}
