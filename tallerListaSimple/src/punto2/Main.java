package punto2;

import model.Persona;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListaSimple<Persona> listaSimple = new ListaSimple<>();

        listaSimple.agregarInicio(new Persona("pepe", "2"));
        listaSimple.agregarInicio(new Persona("pancrasio", "22"));
        listaSimple.agregarInicio(new Persona("daniel", "22"));

        List<Persona> personaConCedulaPar = listaSimple.obtenerCedulaPar();
        System.out.println("Personas con cedula par (" + personaConCedulaPar.size() + "): ");
        personaConCedulaPar.forEach(System.out::println);
    }
}
