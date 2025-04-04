package punto6;

import util.ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoble listaDoble = new ListaDoble<>();
        listaDoble.agregarInicio(4);
        listaDoble.agregarInicio(3);
        listaDoble.agregarInicio(2);
        listaDoble.agregarInicio(1);

        listaDoble.imprimirHaciaAtras();
    }
}
