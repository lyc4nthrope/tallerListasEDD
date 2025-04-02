package punto12;

import util.ListaInt;

public class Main {
    public static void main(String[] args) {
        ListaInt lista = new ListaInt();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);

        double media = lista.mediaOf(lista);
        System.out.println(media);
        double deviate = lista.standarDeviationOf(lista);
        System.out.println(deviate);
    }
}
