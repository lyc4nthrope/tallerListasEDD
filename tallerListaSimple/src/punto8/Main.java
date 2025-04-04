package punto8;

import model.Persona;
import util.ListaDoble;

public class Main {
    public static void main(String[] args) {
        ListaDoble<Persona> lista = new ListaDoble<>();

        lista.agregarfinal(new Persona("pepe", "1"));
        lista.agregarfinal(new Persona("pancrasio", "14"));
        lista.agregarfinal(new Persona("daniel", "6"));

        ListaDoble<Persona> personasConCedulaPar = lista.obtenerCedulaPar();

        ListaDoble<Persona>.IteradorListaDoble iterador = (ListaDoble<Persona>.IteradorListaDoble) personasConCedulaPar.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
