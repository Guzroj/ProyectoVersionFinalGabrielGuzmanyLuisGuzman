package p.proyectoversionfinalgabrielguzmanyluisguzman.;

public class Listas {
    nodo primero;
    nodo ultimo;

    public Listas(){
        primero=null;
        ultimo=null;

    }
    public void ingresarNodo(int dato){
        nodo nuevo= new nodo();
        nuevo.dato= dato;

        if (primero==null){
            primero=nuevo;
            primero.siguiente =null;
            primero.anterior= null;
            ultimo=primero;
        }else {
            ultimo.siguiente=nuevo;
            nuevo.anterior=ultimo;
            nuevo.siguiente=null;
            ultimo=nuevo;

        }
    }
    public void desplegarLista(){
        nodo actual= new nodo();
        actual=ultimo;
        while (actual!=null){
            System.out.println(actual.dato);
            actual=actual.;
        }
    }
}