package com.example.gestionegaragecongrafica_progettovacanze;

public class Furgone extends Veicolo{
    private int numeroAssi;
    private double altezzaMax;
    public Furgone(String targa,String marca,String modello,double prezzoBox,int numeroAssi,double altezzaMax){
        super(targa, marca, modello,prezzoBox);
        this.numeroAssi=numeroAssi;
        this.altezzaMax=altezzaMax;
    }
    public int getNumeroAssi() {
        return numeroAssi;
    }
    public void setNumeroAssi(int numeroAssi) {
        this.numeroAssi = numeroAssi;
    }
    public double getAltezzaMax() {
        return altezzaMax;
    }
    public void setAltezzaMax(double altezzaMax) {
        this.altezzaMax = altezzaMax;
    }
    public String toString(){
        return "Targa del furgone: "+getTarga()+"\n"+
                "Marca del furgone: "+getMarca()+"\n"+
                "Modello del furgone: "+getModello()+"\n"+
                "Numero di assi del furgone: "+numeroAssi+"\n"+
                "Altezza massima del furgone: "+altezzaMax+"\n"+
                "Prezzo del box: "+getPrezzoBox()+" €";
    }
}

