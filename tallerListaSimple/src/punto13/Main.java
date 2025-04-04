package punto13;

import util.ListaInt;

public class Main {
    public static void main(String[] args) {
        int x = 2;
        ListaInt lista = new ListaInt();
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(2);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);
        lista.add(2);
        lista.add(12);

        int distance = lista.maxDistance(lista.getFirst(), x,-1, 0, 0);
        System.out.println(distance);
    }
}
