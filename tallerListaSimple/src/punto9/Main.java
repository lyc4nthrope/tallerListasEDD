package punto9;

import util.ListaCircularSimple;

public class Main {
    public static void main(String[] args) {
        ListaCircularSimple<Integer> listaCircularSimple = new ListaCircularSimple<>();
        listaCircularSimple.add(1);
        listaCircularSimple.add(2);
        listaCircularSimple.add(3);
        listaCircularSimple.add(4);
        listaCircularSimple.addAt(6, 0);

        listaCircularSimple.print();
        int posicion = listaCircularSimple.find(2);
        System.out.println(posicion);
        System.out.println(listaCircularSimple.getNodo(2));
    }
}
