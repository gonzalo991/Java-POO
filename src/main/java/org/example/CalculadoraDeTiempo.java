package org.example;

import org.example.aluracursos.modelos.Pelicula;
import org.example.aluracursos.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Titulo titulo){
        tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public int getTiempoTotal(){
        return this.tiempoTotal;
    }
}
