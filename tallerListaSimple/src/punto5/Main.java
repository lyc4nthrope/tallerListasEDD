package punto5;

import util.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregarInicio(1);
        listaSimple.agregarInicio(1);
        listaSimple.agregarInicio(1);
        listaSimple.agregarInicio(1);
        listaSimple.agregarInicio(1);

        int repetidos = listaSimple.contarRepeticiones(1);
        System.out.println(repetidos);

    }
}
