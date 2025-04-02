package punto11;

import util.ListaPoli;
import util.ListaSimple;

public class Main {
    public static void main(String[] args) {
        ListaPoli poli = new ListaPoli();
        poli.add(2,4);
        poli.add(4,3);
        poli.add(6,2);
        poli.add(1,1);
        ListaSimple<Double> x = new ListaSimple<>(); x.agregarfinal(0.0); x.agregarfinal(0.5);
        x.agregarfinal(1.0);
        x.agregarfinal(1.5);
        x.agregarfinal(2.0);
        x.agregarfinal(2.5);
        x.agregarfinal(3.0);
        x.agregarfinal(3.5);
        x.agregarfinal(4.0);
        x.agregarfinal(4.5);
        x.agregarfinal(5.0);

        String calc = poli.calculate(x);
        System.out.println(calc);
        poli.print();
    }
}
