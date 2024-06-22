package br.edu.up.o_projeto_cinema.model;

public class Filme {
    private String titulo;
    private String genero;
    private String clasIndicativa;
    private int duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasIndicativa() {
        return clasIndicativa;
    }

    public void setClasIndicativa(String clasIndicativa) {
        this.clasIndicativa = clasIndicativa;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
