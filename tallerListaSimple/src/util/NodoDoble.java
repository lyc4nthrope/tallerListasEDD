package util;

public class NodoDoble<T> {

    private NodoDoble<T> siguienteNodo;
    private NodoDoble<T> anteriorNodo;
    private T valorNodo;

    public NodoDoble(T valorNodo) {
        this.valorNodo = valorNodo;
    }

    public NodoDoble(T dato, NodoDoble<T> siguiente, NodoDoble<T> anterior) {
        super();
        this.valorNodo = dato;
        this.siguienteNodo = siguiente;
        this.anteriorNodo = anterior;
    }

    //Metodos get y set de la clase Nodo

    public NodoDoble<T> getSiguienteNodo() {
        return siguienteNodo;
    }


    public void setSiguienteNodo(NodoDoble<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }


    public T getValorNodo() {
        return valorNodo;
    }


    public void setValorNodo(T valorNodo) {
        this.valorNodo = valorNodo;
    }


    public NodoDoble<T> getAnteriorNodo() {
        return anteriorNodo;
    }


    public void setAnteriorNodo(NodoDoble<T> anteriorNodo) {
        this.anteriorNodo = anteriorNodo;
    }
}
