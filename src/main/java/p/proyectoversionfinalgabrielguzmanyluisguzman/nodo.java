package p.proyectoversionfinalgabrielguzmanyluisguzman;

import java.io.File;

public class nodo {
    private String valor;
    // Variable para enlazar los nodos.
    private nodo siguiente;

    private nodo anterior;

    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void nodo() {
        this.valor = "";
        this.siguiente = null;
    }

    // Métodos get y set para los atributos.

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