package Lista;

import Lista.Nodo;

public class Listas {

	Nodo cabeza;
	public Listas() {
		this.cabeza=null;
	}
	
	public void InsertarAlInicio(String elementoInicio) {
		Nodo nuevoNodo = new Nodo(elementoInicio);
		nuevoNodo.siguiente = cabeza;
		cabeza = nuevoNodo;
	}
	
	
	
	public boolean buscar(String buscarElemento) {
		Nodo temp = cabeza;
		while (temp != null) {//Recorre la lista
			if (temp.dato == buscarElemento) {//Compara el valor del nodo con el dato buscado
				return true;//Retorna true si lo encuentra
			}
			temp = temp.siguiente;
		}
		return false;//retorna false si no lo encuentra
	}
	
	
}
