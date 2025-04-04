package punto7;

import util.ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoble<String> listaDoble = new ListaDoble<>();
        listaDoble.agregarfinal("A");
        listaDoble.agregarfinal("B");
        listaDoble.agregarfinal("C");

        ListaDoble<String>.IteradorListaDoble iterador = (ListaDoble<String>.IteradorListaDoble) listaDoble.iterator();

        System.out.println("Recorrido hacia adelante:");
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("\nRecorrido hacia atrás:");
        while (iterador.hasPrevious()) {
            System.out.println(iterador.previous());
        }

        // For-each también funcionará
        System.out.println("\nUsando for-each:");
        for (String elemento : listaDoble) {
            System.out.println(elemento);
        }
    }
}
