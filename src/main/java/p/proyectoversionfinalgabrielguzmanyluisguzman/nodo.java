package p.proyectoversionfinalgabrielguzmanyluisguzman;

import java.io.File;

/**
 *
 *nodo fue realizado para realizar la lista enlazada
 */
public class nodo {

    int dato;


    private String valor;
    // Variable para enlazar los nodos.
    nodo siguiente;

    nodo anterior;

    /**
     * nodo() se refiere a la cabeza del nodo
     *
     */
    public void nodo() {
        this.valor = "";
        this.siguiente = null;
    }

    // Forma de definir los metodos que voy a utilizar para avanzar en el nodo

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(nodo anterior) {
        this.anterior = anterior;
    }

    public nodo getAnterior() {
        return anterior;
    }
}