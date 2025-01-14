package Esercizio;

import java.util.*;

public class EsercizioList {
    private int numeri;
    private List<Integer> numeriRandom  = new ArrayList<>();

    public void generaNumeri(){
        Scanner myScanner2 = new Scanner (System.in);
        System.out.println("Scrivi quanti numeri vuoi generare");
        numeri = myScanner2.nextInt();
        for (int i=0; i<numeri; i++) {
            numeriRandom.add((int)(Math.random()*101));

            Collections.sort(numeriRandom);
            for (int numero : numeriRandom) System.out.println("Lista ordinata" + numeriRandom);


        }
    }
    public void dueListe(){
        List<List<Integer>> listaBase = new ArrayList<>();
        listaBase.add(numeriRandom);

       Collections.sort(numeriRandom);
       for (int numero : numeriRandom) System.out.println("Ordine ascendente: " + numeriRandom);
       Collections.sort(numeriRandom, Collections.reverseOrder());
       for (int n : numeriRandom) System.out.println("ordine discendente: " + n);

    }

    public boolean listaBooleano(){
        List<List<Integer>> listaB = new ArrayList<>();
        boolean valoreBooleano;
        listaB.add(numeriRandom);
        for (int i=0;i<numeriRandom.size();i +=2) {
            if 

    }


}
