package com.lp2;

public class Sala {
    private int cadeiras;
    private int janelas;

    private int quantSalas;

    //Construtor de Sala
    public Sala()
    {
        this.cadeiras = 0;
        this.janelas = 0;
        this.quantSalas = 0;

    }

    public Sala(int _cadeiras, int _janelas, int _quantSalas)
    {
        this.cadeiras = _cadeiras;
        this.janelas = _janelas;
        this.quantSalas = _quantSalas;
    }


    public void setCadeiras(int _cadeiras)
    {
        this.cadeiras = _cadeiras;
    }

    public int getCadeiras()
    {
        return this.cadeiras;
    }


    public void setJanelas(int _janelas)
    {
        this.janelas = _janelas;
    }

    public int getJanelas()
    {
        return this.janelas;
    }


    public void setQuantSalas(int _quantSalas)
    {
        this.quantSalas = _quantSalas;
    }

    public int getQuantSalas()
    {
        return quantSalas;
    }
}
