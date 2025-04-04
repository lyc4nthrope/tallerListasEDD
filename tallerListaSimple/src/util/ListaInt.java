package util;

public class ListaInt {
    Nodo<Integer> first;
    Nodo<Integer> last;
    int size;

    public ListaInt() {
        super();
        first = null;
        last = null;
        size = 0;
    }

    public Nodo<Integer> getFirst() {
        return first;
    }

    public void setFirst(Nodo<Integer> first) {
        this.first = first;
    }

    public Nodo<Integer> getLast() {
        return last;
    }

    public void setLast(Nodo<Integer> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(int dato){
        Nodo<Integer> nuevoNodo = new Nodo(dato);
        if (isEmpty()){
            first = last = nuevoNodo;
        }else {
            last.setSiguienteNodo(nuevoNodo);
            last = nuevoNodo;
        }
        size++;
    }

    public void removeFirst(){
        if ((!isEmpty())) {
            first = first.getSiguienteNodo();
            size--;
        }
        if (first == null) {
            System.out.println("La lista ya esta vacia");
            clean();
        }
    }

    public void print(){
        if (isEmpty()){
            System.out.println("La lista esta vacia");
        }else {
            Nodo<Integer> aux = first;
            boolean fin = false;
            while (!fin) {
                System.out.println(aux);
                aux = aux.getSiguienteNodo();
                if (aux == null){
                    fin = true;
                }
            }
        }
    }


    //12
    public double mediaOf(ListaInt lista){
        double media = 0;
        int i = 0;
        Nodo<Integer> aux = first;
        while (aux != null) {
            media += aux.getValorNodo();
            i++;
            aux = aux.getSiguienteNodo();
        }
        media = media/(double)i;
        return media;
    }

    public double standarDeviationOf(ListaInt lista){
        double suma = 0;
        int i = -1;
        double media = mediaOf(lista);
        Nodo<Integer> aux = first;
        while (aux != null) {
            suma += Math.pow(aux.getValorNodo()-media,2);
            i++;
            aux = aux.getSiguienteNodo();
        }
        double deviation = Math.sqrt(suma/i);
        return deviation;
    }


    //13
    public int maxDistance(Nodo<Integer> aux,int x, int ante, int actu, int maximaDistancia){
        if (aux == null) {
            return maximaDistancia;
        }if (aux.getValorNodo() == x ) {
            if (ante != -1){
                maximaDistancia = Math.max(maximaDistancia, actu - ante);
            }
            ante = actu;
        }

        return maxDistance(aux.getSiguienteNodo(), x, ante, actu+1, maximaDistancia);
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void clean(){
        first = null;
        last = null;
        size = 0;
    }
}
