package punto10;

import util.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Integer> listaSimple1 = new ListaSimple<>();
        ListaSimple<Integer> listaSimple2 = new ListaSimple<>();
        listaSimple1.agregarfinal(1);
        listaSimple1.agregarfinal(2);
        listaSimple1.agregarfinal(3);
        listaSimple1.agregarfinal(4);
        listaSimple2.agregarfinal(5);
        listaSimple2.agregarfinal(6);
        listaSimple2.agregarfinal(7);
        listaSimple2.agregarfinal(8);

        ListaSimple<Integer> listaSimple3 = new ListaSimple<>();
        listaSimple3 = listaSimple3.conectar(listaSimple1,listaSimple2);
        listaSimple3.imprimirLista();
        
    }
}
