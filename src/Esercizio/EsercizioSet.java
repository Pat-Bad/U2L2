package Esercizio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EsercizioSet {
   private Set<String> parole = new HashSet<String>();

    public void settingHashSet() {
        //inizializzo lo scanner per comunicare con l'utente
        Scanner myScanner = new Scanner(System.in);
        //inizializzo l'HashSet di stringhe


        //inizio a chiedere i dati che mi servono
        //chiedo il numero di parole da inserire er lo prendo come metro per calcolare quante volte chiedere l'esatta parola da inserire
        System.out.println("Inserisci il numero di parole da aggiungere");
        int numeroParole = myScanner.nextInt();
        myScanner.nextLine();

//chiedo la parola da inserire con un ciclo for, lo chiede tante volte quante specificate prima dall'utente
        for (int i = 0; i < numeroParole; i++) {
            System.out.println("Inserisci la parola da aggiungere");
            String parolaSingola = myScanner.nextLine();

            if (parole.add(parolaSingola) == false) System.out.println("Questa parola è doppia: "+parolaSingola);

        }

        System.out.println("Il numero di parole inserite è: " + parole.size());

        }
        public void stampaParole(){
        for (String parola : parole) {System.out.print(parola + ", ");
        };

};};



