package org.example.calculos;

public class FiltroRecomendacion {
    public void filtro(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Mejor evaluado en el momento");
        } else if(clasificacion.getClasificacion()>= 2){
            System.out.println("popular en el momento");
        } else {
            System.out.println("Colocalo en tu lista para verlo después");
        }
    }
}