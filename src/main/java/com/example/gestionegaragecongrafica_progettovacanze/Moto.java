package com.example.gestionegaragecongrafica_progettovacanze;

public class Moto extends Veicolo{
    private int cilindrata;
    private String tipologia;
    public Moto(String targa,String marca,String modello,double prezzoBox,int cilindrata,String tipologia){
        super(targa, marca, modello,prezzoBox);
        this.cilindrata=cilindrata;
        this.tipologia=tipologia;
    }
    public int getCilindrata() {
        return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public String getTipologia() {
        return tipologia;
    }
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
    public String toString(){
        return "Targa della moto: "+getTarga()+"\n"+
                "Marca della moto: "+getMarca()+"\n"+
                "Modello della moto: "+getModello()+"\n"+
                "Cilindrata della moto: "+cilindrata+"\n"+
                "Tipologia della moto: "+tipologia+"\n"+
                "Prezzo del box: "+getPrezzoBox()+" €";
    }
}
