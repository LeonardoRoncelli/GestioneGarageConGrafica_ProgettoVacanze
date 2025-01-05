package com.example.gestionegaragecongrafica_progettovacanze;

public class Auto extends Veicolo{
    private String tipologia;
    public Auto(String targa,String marca,String modello,double prezzoBox,String tipologia){
        super(targa,marca,modello,prezzoBox);
        this.tipologia=tipologia;
    }
    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public String toString(){
        return "Targa dell'auto: "+getTarga()+"\n"+
                "Marca dell'auto: "+getMarca()+"\n"+
                "Modello dell'auto: "+getModello()+"\n"+
                "Tipologia dell'auto (es.: suv, station wagon...): "+getTipologia()+"\n"+
                "Prezzo del box: "+getPrezzoBox()+" €";
    }
}
