package com.example.gestionegaragecongrafica_progettovacanze;

public class Box {
    private double prezzo;
    public void setPrezzo(double prezzo){
        this.prezzo=prezzo;
    }
    public double getPrezzo(){
        return prezzo;
    }
    public Box(double prezzo){
        this.prezzo=prezzo;
    }
    public String toString(){
        return "Prezzo del box: "+prezzo;
    }
}