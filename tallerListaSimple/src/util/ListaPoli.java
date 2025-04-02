package util;

public class ListaPoli {
    private NodoPoli first, last;
    private int size;

    public ListaPoli() {
        super();
        first = null;
        last = null;
        size = 0;
    }

    public NodoPoli getFirst() {
        return first;
    }

    public void setFirst(NodoPoli first) {
        this.first = first;
    }

    public NodoPoli getLast() {
        return last;
    }

    public void setLast(NodoPoli last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(int num, int expo){
        NodoPoli nuevoNodo = new NodoPoli(num, expo);
        if (isEmpty()){
            first = last = nuevoNodo;
        }else {
            last.setNext(nuevoNodo);
            last = nuevoNodo;
        }
        size++;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
        }else {
            NodoPoli aux = first;
            boolean fin = false;
            String poli = "";
            while (!fin) {
                if (aux != last){
                    poli += aux + " + ";
                }else {
                    poli += aux;
                }
                aux = aux.getNext();
                if (aux == null){
                    fin = true;
                }
            }
            System.out.println(poli);
        }
    }

    public String calculate(ListaSimple<Double> x){
        String poli = "";
        NodoPoli aux;
        Nodo<Double> xaux = x.getNodoPrimero();
        double num;
        while (xaux != null) {
            aux = first;
            while (aux != null) {
                num = aux.getNum() * Math.pow(xaux.getValorNodo(), aux.getExpo());
                if (aux.getNext() != null) {
                    poli += num + " + ";
                } else {
                    poli += num;
                }
                aux = aux.getNext();
            }
            poli += "\n";
            xaux = xaux.getSiguienteNodo();
        }
        return poli;
    }

    private boolean isEmpty(){
        return size == 0;
    }
}
