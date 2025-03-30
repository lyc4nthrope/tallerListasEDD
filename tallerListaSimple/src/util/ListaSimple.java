package util;

import punto2.Persona;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaSimple<T> implements Iterable<T> {

	private Nodo<T> nodoPrimero;
	private Nodo<T> nodoUltimo;
	private int tamanio;


	public ListaSimple() {
		nodoPrimero = null;
		nodoPrimero = null;
		tamanio = 0;
	}

	//punto1
	public List<T> obtenerPosicionesImparesNodo() {
		List<T> result = new ArrayList<>();
		int i = 1;
		Nodo<T> actual = nodoPrimero;

		while (actual != null){
			if (i % 2 !=0){
				result.add(actual.getValorNodo());
			}
			actual = actual.getSiguienteNodo();
			i++;
		}
		return result;
	}

	//punto2
	public <T extends Persona> List<T> obtenerCedulaPar() {
		List<T> result = new ArrayList<>();
		Nodo<T> actual = (Nodo<T>) nodoPrimero;

		while (actual != null) {
			String cedula = actual.getValorNodo().getCedula();
			String cedulaLimpia = cedula.replaceAll("[^0-9]", "");

			if (cedulaLimpia.length() % 2 == 0) {
				result.add(actual.getValorNodo());
			}
			actual = actual.getSiguienteNodo();
		}
		return result;
	}

	//Metodos basicos

	//Agregar al inicio de la lista
	public void agregarInicio(T valorNodo) {

		Nodo<T> nuevoNodo = new Nodo<>(valorNodo);

		if(estaVacia())
		{
			nodoPrimero = nuevoNodo;
		}
		else
		{
			nuevoNodo.setSiguienteNodo(nodoPrimero);
			nodoPrimero = nuevoNodo;
		}
		tamanio++;
	}


	//Agregar al final de la lista
	public void agregarfinal(T valorNodo) {

		Nodo<T> nodo = new Nodo<>(valorNodo);

		if( estaVacia() ) {
			nodoPrimero = nodoUltimo = nodo;
		}else {
			nodoUltimo.setSiguienteNodo(nodo);
			nodoUltimo = nodo;
		}

		tamanio++;
	}


	//Obtener util.Nodo el valor de un util.Nodo
	public T obtenerValorNodo(int indice) {

		Nodo<T> nodoTemporal = null;
		int contador = 0;

		if(indiceValido(indice))
		{
			nodoTemporal = nodoPrimero;

			while (contador < indice) {

				nodoTemporal = nodoTemporal.getSiguienteNodo();
				contador++;
			}
		}

		if(nodoTemporal != null)
			return nodoTemporal.getValorNodo();
		else
			return null;
	}


	//Verificar si indice es valido
	private boolean indiceValido(int indice) {
		if( indice>=0 && indice<tamanio ) {
			return true;
		}
		throw new RuntimeException("�ndice no v�lido");
	}


	//Verificar si la lista esta vacia
	public boolean estaVacia() {
		return(nodoPrimero == null)?true:false;
	}


	/**
	 * Imprime en consola la lista enlazada
	 */
	public void imprimirLista() {

		Nodo<T> aux = nodoPrimero;

		while(aux!=null) {
			System.out.print( aux.getValorNodo()+"\t" );
			aux = aux.getSiguienteNodo();
		}

		System.out.println();
	}

	//Eliminar dado el valor de un nodo
	public T eliminar(T dato){
		Nodo<T> nodo = nodoPrimero;
		Nodo<T> previo = null;
		Nodo<T> siguiente = null;
		boolean encontrado = false;

		//buscar el nodo previo
		while(nodo!=null) {
			if( nodo.getValorNodo() == dato ) {
				encontrado = true;
				break;
			}
			previo = nodo;
			nodo = nodo.getSiguienteNodo();
		}

		if(encontrado) {
			siguiente = nodo.getSiguienteNodo();
			if( previo==null ) {
				nodoPrimero = siguiente;
			}else {
				previo.setSiguienteNodo(siguiente);
			}

			if(siguiente==null) {
//				nodoUltimo = previo;
			}else {
				nodo.setSiguienteNodo(null);
			}

			nodo = null;
			tamanio--;
			return dato;
		}
		throw new RuntimeException("El elemento no existe");
	}


	//Elimina el primer nodo de la lista
	public T eliminarPrimero() {

		if( !estaVacia() ) {
			Nodo<T> n = nodoPrimero;
			T valor = n.getValorNodo();
			nodoPrimero = n.getSiguienteNodo();

			if(nodoPrimero==null) {
//				nodoUltimo = null;
			}

			tamanio--;
			return valor;
		}

		throw new RuntimeException("Lista vac�a");
	}


	private Nodo<T> obtenerNodo(int indice) {

		if(indice>=0 && indice<tamanio) {

			Nodo<T> nodo = nodoPrimero;

			for (int i = 0; i < indice; i++) {
				nodo = nodo.getSiguienteNodo();
			}

			return nodo;
		}

		return null;
	}

	public void modificarNodo(int indice, T nuevo) {

		if( indiceValido(indice) ) {
			Nodo<T> nodo = obtenerNodo(indice);
			nodo.setValorNodo(nuevo);
		}

	}

	public int obtenerPosicionNodo(T dato) {

		int i = 0;

		for(Nodo<T> aux = nodoPrimero; aux!=null ; aux = aux.getSiguienteNodo() ) {
			if( aux.getValorNodo().equals(dato) ) {
				return i;
			}
			i++;
		}

		return -1;
	}


	@Override
	public Iterator<T> iterator() {
		return new IteradorListaSimple(nodoPrimero);
	}

	protected class IteradorListaSimple implements Iterator<T>{

		private Nodo<T> nodo;
		private int posicion;

		public IteradorListaSimple(Nodo<T> nodo) {
			this.nodo = nodo;
			this.posicion = 0;
		}

		@Override
		public boolean hasNext() {
			return nodo!=null;
		}

		@Override
		public T next() {
			T valor = nodo.getValorNodo();
			nodo = nodo.getSiguienteNodo();
			posicion++;
			return valor;
		}

		public int getPosicion() {
			return posicion;
		}
	}


	//Metodos get y set de la clase util.ListaSimple


	public Nodo getNodoPrimero() {
		return nodoPrimero;
	}


	public void setNodoPrimero(Nodo nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}


	public int getTamanio() {
		return tamanio;
	}


	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}






}
