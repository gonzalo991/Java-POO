package org.example.aluracursos.modelos;

public class Serie extends Pelicula {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getDuracionEnMinutos(){
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }
    public int getTemporadas(){
        return temporadas;
    }
    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }
    public int getEpidodiosPorTemporada(){
        return episodiosPorTemporada;
    }
    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }
    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}