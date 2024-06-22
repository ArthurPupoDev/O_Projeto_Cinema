package br.edu.up.o_projeto_cinema.model;

public class Funcionario extends Pessoa{

    private Float salario;

    public Funcionario(String nome, String cpf, String dataNascimento, Float salario){
        super(nome, cpf, dataNascimento);
        this.salario = salario;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
}
