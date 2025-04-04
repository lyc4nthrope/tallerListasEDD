package punto3;

import util.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregarInicio(1);
        listaSimple.agregarInicio(2);
        listaSimple.agregarInicio(3);
        listaSimple.agregarInicio(4);
        listaSimple.agregarInicio(5);

        listaSimple.eliminarNumerosPares();
    }
}
