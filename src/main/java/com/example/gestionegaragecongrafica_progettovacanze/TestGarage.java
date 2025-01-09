package com.example.gestionegaragecongrafica_progettovacanze;

import java.util.Scanner;
public class TestGarage {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Garage garage=new Garage();
        int scelta;
        do{
            System.out.println("Benvenuto, questo garage ha in totale 500 posti validi per auto, moto e furgoni. I box sono numerati da 0 a 499.\n"+
                    "1 - Parcheggia veicolo (verrà percheggiato nel primo box libero)\n"+
                    "2 - Libera box\n"+
                    "3 - Verifica stato di un box\n"+
                    "4 - Numero di box occupati\n"+
                    "5 - Numero di box liberi\n"+
                    "6 - Ricerca di un veicolo attraverso la targa\n"+
                    "7 - Visualizza tutti i veicoli parcheggiati\n"+
                    "8 - Parcheggia veicolo in un box specifico\n"+
                    "9 - Modifica i dati di un veicolo\n"+
                    "10 - Visualizza il ricavo totale\n"+
                    "0 - Esci");
            System.out.print("Scegli un'opzione: ");
            try {
                scelta = input.nextInt();
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Errore: Inserisci un numero valido!");
                input.nextLine();
                scelta = -1;
            }
            switch (scelta){
                case 1:{
                    String tipologia;
                    do {
                        System.out.print("Inserisci la tipologia del veicolo che si vuole parcheggiare (auto, moto o furgone): ");
                        tipologia= input.next();
                        switch (tipologia){
                            case "auto":{
                                String targa;
                                String marca;
                                String modello;
                                String tipologiaAgg;
                                double tempo;
                                System.out.print("Inserisci la targa dell'auto da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca dell'auto da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello dell'auto da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci la tipologia dell'auto da aggiungere (es.: suv, station wagon...): ");
                                tipologiaAgg= input.nextLine();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Auto autoAgg=new Auto(targa,marca,modello, garage.calcolaPrezzo(tempo), tipologiaAgg);
                                System.out.println(" ");
                                System.out.println("AUTO PARCHEGGIATA CON SUCCESSO NEL BOX NUMERO: "+garage.parcheggiaVeicolo(autoAgg));
                                System.out.println(" ");
                                break;
                            }
                            case "moto":{
                                String targa;
                                String marca;
                                String modello;
                                int cilindrata;
                                String tipologiaAgg;
                                double tempo;
                                System.out.print("Inserisci la targa della moto da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca della moto da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello della moto da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci la cilindrata della moto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                input.nextLine();
                                System.out.print("Inserisci la tipologia della moto da aggiungere (es.: sportiva, cross...): ");
                                tipologiaAgg= input.nextLine();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Moto motoAgg=new Moto(targa,marca,modello, garage.calcolaPrezzo(tempo), cilindrata,tipologiaAgg);
                                System.out.println(" ");
                                System.out.println("MOTO PARCHEGGIATA CON SUCCESSO NEL BOX NUMERO: "+garage.parcheggiaVeicolo(motoAgg));
                                System.out.println(" ");
                                break;
                            }
                            case "furgone":{
                                String targa;
                                String marca;
                                String modello;
                                int numeroAssi;
                                double altezzaMax;
                                double tempo;
                                System.out.print("Inserisci la targa del furgone da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca del furgone da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello del furgone da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci il numero di assi del furgone da parcheggiare: ");
                                numeroAssi= input.nextInt();
                                System.out.print("Inserisci l'altezza massima del furgone da parcheggiare: ");
                                altezzaMax= input.nextDouble();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Furgone furgoneAgg=new Furgone(targa,marca,modello, garage.calcolaPrezzo(tempo), numeroAssi,altezzaMax);
                                System.out.println(" ");
                                System.out.println("FURGONE PARCHEGGIATO CON SUCCESSO NEL BOX NUMERO: "+garage.parcheggiaVeicolo(furgoneAgg));
                                System.out.println(" ");
                                break;
                            }
                            default:System.out.println("TIPOLOGIA DEL VEICOLO INSERITA NON VALIDA!");
                        }
                    }while (!tipologia.equalsIgnoreCase("auto")&&!tipologia.equalsIgnoreCase("moto")&&!tipologia.equalsIgnoreCase("furgone"));
                    break;
                }
                case 7:{
                    System.out.println(" ");
                    System.out.println("Ecco la lista di tutti i veicoli parhceggiati: ");
                    System.out.println(" ");
                    garage.visualizzaTutti();
                    break;
                }
                case 4:{
                    System.out.println(" ");
                    System.out.print("Numero di box occupati: ");
                    System.out.println(garage.numBoxOccupati());
                    System.out.println(" ");
                    break;
                }
                case 5:{
                    System.out.println(" ");
                    System.out.print("Numero di box liberi: ");
                    System.out.println(garage.numBoxLiberi());
                    System.out.println(" ");
                    break;
                }
                case 6:{
                    String targa;
                    System.out.println(" ");
                    System.out.print("Inserisci la targa del veicolo da ricercare: ");
                    targa= input.nextLine();
                    garage.ricercaConTarga(targa);
                    System.out.println(" ");
                    break;
                }
                case 2:{
                    int numBox;
                    System.out.println(" ");
                    System.out.print("Inserisci il numero del box da liberare: ");
                    numBox= input.nextInt();
                    garage.liberaBox(numBox);
                    System.out.println(" ");
                    break;
                }
                case 3:{
                    int numBox;
                    System.out.println(" ");
                    System.out.print("Inserisci il numero del box da controllare: ");
                    numBox= input.nextInt();
                    garage.verificaStatoBox(numBox);
                    System.out.println(" ");
                    break;
                }
                case 8:{
                    int numBox;
                    String tipologia;
                    do {
                        System.out.print("Inserisci la tipologia del veicolo che si vuole parcheggiare (auto, moto o furgone): ");
                        tipologia= input.next();
                        switch (tipologia){
                            case "auto":{
                                String targa;
                                String marca;
                                String modello;
                                String tipologiaAgg;
                                double tempo;
                                System.out.print("Inserisci la targa dell'auto da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca dell'auto da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello dell'auto da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci la tipologia dell'auto da aggiungere (es.: suv, station wagon...): ");
                                tipologiaAgg= input.nextLine();
                                System.out.print("Inserisci il numero del box in cui vuoi parcheggiare il veicolo: ");
                                numBox=input.nextInt();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Auto autoAgg=new Auto(targa,marca,modello, garage.calcolaPrezzo(tempo), tipologiaAgg);
                                System.out.println(" ");
                                garage.parcheggiaBoxSpecifico(numBox,autoAgg);
                                System.out.println(" ");
                                break;
                            }
                            case "moto":{
                                String targa;
                                String marca;
                                String modello;
                                int cilindrata;
                                String tipologiaAgg;
                                double tempo;
                                System.out.print("Inserisci la targa della moto da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca della moto da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello della moto da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci la cilindrata della moto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                System.out.print("Inserisci la tipologia della moto da aggiungere (es.: sportiva, cross...): ");
                                tipologiaAgg= input.next();
                                input.nextLine();
                                System.out.print("Inserisci il numero del box in cui vuoi parcheggiare il veicolo: ");
                                numBox=input.nextInt();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Moto motoAgg=new Moto(targa,marca,modello, garage.calcolaPrezzo(tempo), cilindrata,tipologiaAgg);
                                System.out.println(" ");
                                garage.parcheggiaBoxSpecifico(numBox,motoAgg);
                                System.out.println(" ");
                                break;
                            }
                            case "furgone":{
                                String targa;
                                String marca;
                                String modello;
                                int numeroAssi;
                                double altezzaMax;
                                double tempo;
                                System.out.print("Inserisci la targa del furgone da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca del furgone da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello del furgone da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci il numero di assi del furgone da parcheggiare: ");
                                numeroAssi= input.nextInt();
                                System.out.print("Inserisci l'altezza massima del furgone da parcheggiare: ");
                                altezzaMax= input.nextDouble();
                                System.out.print("Inserisci il numero del box in cui vuoi parcheggiare il veicolo: ");
                                numBox= input.nextInt();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Furgone furgoneAgg=new Furgone(targa,marca,modello, garage.calcolaPrezzo(tempo), numeroAssi,altezzaMax);
                                System.out.println(" ");
                                garage.parcheggiaBoxSpecifico(numBox,furgoneAgg);
                                System.out.println(" ");
                                break;
                            }
                            default:System.out.println("TIPOLOGIA DEL VEICOLO INSERITA NON VALIDA!");
                        }
                    }while (!tipologia.equalsIgnoreCase("auto")&&!tipologia.equalsIgnoreCase("moto")&&!tipologia.equalsIgnoreCase("furgone"));
                    break;
                }
                case 9:{
                    int numBox;
                    String tipoVeicolo;
                    System.out.println(" ");
                    do{
                        System.out.print("Inserisci il numero del box in cui è parcheggiato il veicolo: ");
                        numBox=input.nextInt();
                        System.out.print("Inserisci la tipologia del veicolo (auto, moto o furgone): ");
                        tipoVeicolo= input.next();
                        switch (tipoVeicolo){
                            case "auto":{
                                String targa;
                                String marca;
                                String modello;
                                String tipologiaAgg;
                                double tempo;
                                System.out.println(" ");
                                System.out.println("Inserisci i nuovi dati");
                                System.out.println(" ");
                                System.out.print("Inserisci la targa dell'auto da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca dell'auto da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello dell'auto da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci la tipologia dell'auto da aggiungere (es.: suv, station wagon...): ");
                                tipologiaAgg= input.nextLine();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Auto autoAgg=new Auto(targa,marca,modello, garage.calcolaPrezzo(tempo), tipologiaAgg);
                                System.out.println(" ");
                                garage.modificaVeicolo(numBox,autoAgg);
                                System.out.println(" ");
                                break;
                            }
                            case "moto":{
                                String targa;
                                String marca;
                                String modello;
                                int cilindrata;
                                String tipologiaAgg;
                                double tempo;
                                System.out.println(" ");
                                System.out.println("Inserisci i nuovi dati");
                                System.out.println(" ");
                                System.out.print("Inserisci la targa della moto da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca della moto da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello della moto da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci la cilindrata della moto da parcheggiare: ");
                                cilindrata=input.nextInt();
                                System.out.print("Inserisci la tipologia della moto da aggiungere (es.: sportiva, cross...): ");
                                tipologiaAgg= input.next();
                                input.nextLine();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Moto motoAgg=new Moto(targa,marca,modello,tempo,cilindrata,tipologiaAgg);
                                System.out.println(" ");
                                garage.modificaVeicolo(numBox,motoAgg);
                                System.out.println(" ");
                                break;
                            }
                            case "furgone":{
                                String targa;
                                String marca;
                                String modello;
                                int numeroAssi;
                                double altezzaMax;
                                double tempo;
                                System.out.println(" ");
                                System.out.println("Inserisci i nuovi dati");
                                System.out.println(" ");
                                System.out.print("Inserisci la targa del furgone da parcheggiare: ");
                                targa= input.next();
                                input.nextLine();
                                System.out.print("Inserisci la marca del furgone da parcheggiare: ");
                                marca= input.nextLine();
                                System.out.print("Inserisci il modello del furgone da parcheggiare: ");
                                modello= input.nextLine();
                                System.out.print("Inserisci il numero di assi del furgone da parcheggiare: ");
                                numeroAssi= input.nextInt();
                                System.out.print("Inserisci l'altezza massima del furgone da parcheggiare: ");
                                altezzaMax= input.nextDouble();
                                do {
                                    System.out.print("Inserisci per quanto tempo il veicolo resterà all'interno del garage (in ore): ");
                                    tempo = input.nextDouble();
                                    if (tempo<=0){
                                        System.out.println("VALORE DEL TEMPO INSERITO NON VALIDO!");
                                    }
                                }while (tempo<=0);
                                Furgone furgoneAgg=new Furgone(targa,marca,modello, garage.calcolaPrezzo(tempo), numeroAssi,altezzaMax);
                                System.out.println(" ");
                                garage.modificaVeicolo(numBox,furgoneAgg);
                                System.out.println(" ");
                                break;
                            }
                            default:System.out.println("TIPOLOGIA DEL VEICOLO INSERITA NON VALIDA!");
                        }
                    }while (!tipoVeicolo.equalsIgnoreCase("auto")&&!tipoVeicolo.equalsIgnoreCase("moto")&&!tipoVeicolo.equalsIgnoreCase("furgone"));
                    break;
                }
                case 0:{
                    System.out.println(" ");
                    System.out.println("Arrivederci!");
                    break;
                }
                case 10:{
                    System.out.println(" ");
                    System.out.println("Ricavo totale aggiornato: "+garage.ricavoTotale()+" €");
                    System.out.println(" ");
                    break;
                }
                default:
                    System.out.println(" ");
                    System.out.println("SCELTA INSERITA NON VALIDA!");
                    System.out.println(" ");
            }
        }while (scelta!=0);
    }
}