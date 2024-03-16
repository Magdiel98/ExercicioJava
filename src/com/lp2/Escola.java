package com.lp2;

public class Escola {
    private int funcionarios;
    private int estudantes;
    private String nome; //Nome da escola
    private Sala sala;

    //Construtor de Escola
    public Escola()
    {
        this.funcionarios = 0;
        this.estudantes = 0;
        this.nome = " ";
        this.sala = new Sala();
    }


    public void setFuncionarios(int _funcionarios)
    {
        this.funcionarios = _funcionarios;
    }

    public int getFuncionarios()
    {
        return this.funcionarios;
    }


    public void setEstudantes(int _estudantes)
    {
        this.estudantes = _estudantes;
    }

    public int getEstudantes()
    {
        return estudantes;
    }


    public void setNome(String _nome)
    {
        this.nome = _nome;
    }

    public String getNome()
    {
        return this.nome;
    }


    public Sala getSala()
    {
        return this.sala; //Conseguir acessar os métodos de sala através de Escola
    }

    public double lucro(double entrada, double saida)
    {
        double lucro;
        return lucro = entrada - saida;
    }

}
