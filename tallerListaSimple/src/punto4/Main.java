package punto4;

import util.ListaSimple;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregarInicio(1);
        listaSimple.agregarInicio(2);
        listaSimple.agregarInicio(3);
        listaSimple.agregarInicio(4);
        listaSimple.agregarInicio(5);

        List<Integer> impares = listaSimple.valoresImparesLista();
        System.out.println(impares);
    }
}
