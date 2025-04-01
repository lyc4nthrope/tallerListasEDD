package util;

public class ListaCircularSimple<T> {
    private int size;
    private Nodo<T> primero;
    private Nodo<T> ultimo;

    public ListaCircularSimple() {
        super();
        this.size = 0;
        this.primero = null;
        this.ultimo = null;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Nodo<T> getPrimero() {
        return primero;
    }
    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }
    public Nodo<T> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Nodo<T> ultimo) {
        this.ultimo = ultimo;
    }

    public void addFirst(T t) {
        Nodo<T> nuevoNodo =  new Nodo<T>(t);
        if(isEmpty()) {
            primero = nuevoNodo;
        }else {
            nuevoNodo.setSiguienteNodo(primero);
            primero = nuevoNodo;
            ultimo.setSiguienteNodo(primero);
        }
        size ++;
    }

    public void add(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (isEmpty()) {
            primero = nuevoNodo;
            ultimo = primero;
        }else {
            ultimo.setSiguienteNodo(nuevoNodo);
            ultimo = nuevoNodo;
            ultimo.setSiguienteNodo(primero);
        }
        size ++;
    }

    public void addAt(T dato, int pos){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        Nodo<T> aux = primero;
        Nodo<T> sig;
        Nodo<T> prev = null;
        int i = 0;
        boolean encontrado = false;

        if (isEmpty()){
            primero = nuevoNodo;
        }if (pos == 0){
            nuevoNodo.setSiguienteNodo(primero);
            primero = nuevoNodo;
            ultimo.setSiguienteNodo(primero);
            encontrado = true;
        }else {
            while (i < size) {
                if (i == pos) {
                    sig = aux;
                    prev.setSiguienteNodo(nuevoNodo);
                    nuevoNodo.setSiguienteNodo(sig);
                    encontrado = true;
                    break;
                }
                if (prev != null) {
                    prev = prev.getSiguienteNodo();
                } else {
                    prev = primero;
                }
                aux = aux.getSiguienteNodo();
                i++;
            }
        }
        if (!encontrado) {
            System.out.println("La posición no existe añadiendo al final");
            add(dato);
        }
        size ++;

    }

    public void clean(){
        primero = null;
        ultimo = null;
        size = 0;
    }

    public void removeFirst(){
        if ((!isEmpty())) {
            primero = primero.getSiguienteNodo();
            ultimo.setSiguienteNodo(primero);
            size--;
        }
        if (primero == null) {
            System.out.println("La lista ya esta vacia");
            clean();
        }
    }

    public void remove(T dato){
        Nodo<T> aux = primero;
        Nodo<T> sig;
        Nodo<T> prev = null;
        boolean encontrado = false;

        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
        }else {
            while (aux.getSiguienteNodo() != primero) {
                if (aux.getValorNodo() == dato) {
                    sig = aux.getSiguienteNodo();
                    prev.setSiguienteNodo(sig);
                    size--;
                    break;
                }
                if (prev != null) {
                    prev = aux.getSiguienteNodo();
                }else {
                    prev = primero;
                }
                aux = aux.getSiguienteNodo();
            }
        }
        if (!encontrado) {
            System.out.println("El dato no existe");
        }
    }

    public void removeLast(){
        Nodo<T> aux = primero;
        if(isEmpty()){
            System.out.println("La lista ya esta vacia");

        } else if (primero.getSiguienteNodo() == null) {
            primero = null;
            ultimo = null;
            size = 0;
        }else {
            while (aux.getSiguienteNodo() != primero) {
                if (aux.getSiguienteNodo() == ultimo) {
                    ultimo = aux;
                    ultimo.setSiguienteNodo(primero);
                    size--;
                    break;
                }
                aux = aux.getSiguienteNodo();
            }
        }
    }

    public Nodo<T> getNodo(int pos){
        Nodo<T> aux = primero;
        int i = 0;
        boolean encontrado = false;
        while (i < size) {
            if (i == pos) {
                encontrado = true;
                break;
            }
            aux = aux.getSiguienteNodo();
            i++;
        }
        if (encontrado) {
            return aux;
        }else {
            return null;
        }
    }

    public int find(T dato){
        Nodo<T> aux = primero;
        int i = 0;
        boolean encontrado = false;
        while (i<size) {
            if (aux.getValorNodo() == dato) {
                encontrado = true;
                break;
            }
            aux = aux.getSiguienteNodo();
            i++;
        }
        if (!encontrado){
            i = -1;
        }
        return i;
    }

    public void modify(T dato, int pos){
        Nodo<T> aux = getNodo(pos);
        aux.setValorNodo(dato);
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("la lista esta vacia");
        }else {
            Nodo<T> aux = primero; //i=0
            boolean fin = false;
            while (!fin) {//i < n
                System.out.println(aux);
                aux = aux.getSiguienteNodo();//i++
                if (aux == primero) {
                    fin = true;
                }
            }
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

}
