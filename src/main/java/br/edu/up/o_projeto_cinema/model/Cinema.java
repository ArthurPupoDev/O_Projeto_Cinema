package br.edu.up.o_projeto_cinema.model;
import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private String cinema;
    private List<Sala> salaList;
    private List<Filme> filmeList;

    public String getCinema() {
        return cinema;
    }

    public void setCinema(String cinema) {
        this.cinema = cinema;
    }

    public List<Sala> getSalaList() {
        return salaList;
    }

    public void setSalaList(List<Sala> salaList) {
        this.salaList = salaList;
    }

    public List<Filme> getFilmeList() {
        return filmeList;
    }

    public void setFilmeList(List<Filme> filmeList) {
        this.filmeList = filmeList;
    }

}
