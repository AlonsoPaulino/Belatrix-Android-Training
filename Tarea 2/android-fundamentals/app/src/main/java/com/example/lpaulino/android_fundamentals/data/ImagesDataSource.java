package com.example.lpaulino.android_fundamentals.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lpaulino on 18/01/17.
 */

public class ImagesDataSource {

    private static ImagesDataSource INSTANCE = null;

    private List<String> mImages;

    private ImagesDataSource() {}

    public static synchronized ImagesDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ImagesDataSource();
        }
        return INSTANCE;
    }

    public List<String> getChristmasImages() {
        if (mImages == null) {
            mImages = new ArrayList<>();
            mImages.add("https://i.ytimg.com/vi/-wybmi7sRKI/maxresdefault.jpg");
            mImages.add("http://imagenesparanavidad.com/wp-content/uploads/2016/11/feliz-navidad-2016-pascuero.jpg");
            mImages.add("http://www.ajemadrid.es/wp-content/uploads/navidad2011.jpg");
            mImages.add("http://www.nutriemocion.net/wp-content/uploads/2016/12/descargar-gratis-fondos-de-pantalla-de-navidad.jpeg");
            mImages.add("http://restablecidos.com/wp-content/uploads/2015/12/navidad.jpg");
            mImages.add("http://imagenesyfondos.org/wp-content/uploads/2015/11/imagenes-de-navidad.jpg");
            mImages.add("http://www.fechascivicasdeperu.com/wp-content/uploads/2015/11/Navidad.jpg");
            mImages.add("http://3.bp.blogspot.com/-84NB-vK6isM/TyKt3yasPUI/AAAAAAAACbs/H79Y_NY3fns/s1600/munecodenieve.jpg");
            mImages.add("https://elmundoderaga.files.wordpress.com/2014/12/feliznavidad-imagenesdenavidad.jpg");
            mImages.add("http://frasesnavidad.com/wp-content/uploads/pictures/arbol-navidad.jpg");
        }
        return mImages;
    }
}
