package p.proyectoversionfinalgabrielguzmanyluisguzman;

/**
 * ListaDobleCir se encarga de leer una lista doblemente enlazada
 * Se encarga de leer una lista doblemente enlazada circular y de los pasos que necesitamos para leerla.
 * @author Luis
 * @version 1.0
 */
public class ListaDobleCir {



        private nodoDobleCir inicio;
        private int size;
        public void Lista(){
            inicio = null;
            size = 0;
        }

        public boolean esVacia(){
            return inicio == null;
        }


        public int getSize(){
            return size;
        }

    /**
     * agregarAlFinal se refiere que lo que quiero utilizar lo va a agregar al final.
     * @param valor es el valor de la lista que se va modificando, conforme se neceiste
     */

    public void agregarAlFinal(String valor){

            nodoDobleCir nuevo = new nodoDobleCir();

            nuevo.setValor(valor);

            if (esVacia()) {

                inicio = nuevo;

            } else{

                nodoDobleCir aux = inicio;;

                while(aux.getSiguiente() != null){
                    aux= aux.getSiguiente();
                }
               
                aux.setSiguiente(nuevo);
                nuevo.setAnterior(aux);

            }
            size++;

        }

    /**
     * agregarAlInicio agrega valor al principio de la lista.
     * @param valor valor se modifica de forma que va a ir de primero en la lista.
     */
    public void agregarAlInicio(String valor){

            nodoDobleCir nuevo = new nodoDobleCir();

            nuevo.setValor(valor);

            if (esVacia()) {

                inicio = nuevo;


            } else{
                nodoDobleCir aux = inicio.getAnterior();
                nuevo.setAnterior(aux);
                inicio.setAnterior(nuevo);
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            size++;
        }

    /**
     * getValor es para conseguir el nodo de la posicion
     * @param posicion se encarga de obtener la posicion que uno ingresa.
     * @return me da el nodo de la posicion
     * @throws Exception
     */

        public String getValor(int posicion) throws Exception{
            if(posicion>=0 && posicion< size){
                if (posicion == 0) {
                    return inicio.getValor();
                }else{
                    nodoDobleCir aux = inicio;
                    for (int i = 0; i < posicion; i++) {
                        aux = aux.getSiguiente();
                    }
                    return aux.getValor();
                }
            } else {
                throw new Exception("Posicion inexistente en la lista.");
            }
        }

    /**
     * buscar se encarga de decir si el nodo que yo selecciono, esta presente
     * @param referencia es el nodo que estoy buscando
     * @return boolean
     */

    public boolean buscar(String referencia){
            nodoDobleCir aux = inicio;
            boolean encontrado = false;
            while(aux != null && encontrado != true){
                if (referencia == aux.getValor()){
                    encontrado = true;
                }
                else{
                    aux = aux.getSiguiente();
                }
            }
            return encontrado;
        }

    /**
     * removerPorPosicion se encarga de eliminar el nodo ubicado en la posicion que seleccione.
     *
     * @param posicion es un integrer utilizado para llegar a la posicion del nodo.
     */
    public void removerPorPosicion(int posicion){
            if(posicion>=0 && posicion< size){
                if(posicion == 0){
                    inicio = inicio.getSiguiente();
                }
                else{
                    nodoDobleCir aux = inicio;
                    for (int i = 0; i < posicion-1; i++) {
                        aux = aux.getSiguiente();
                    }
                    nodoDobleCir siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
                size--;
            }
        }

    /**
     * utilizado como referencia para eliminar
     */
    public void eliminar(){
            inicio = null;
            size = 0;
        }

    /**
     * listar Se encarga de ir metiendo a la lista los nodos.
     */

    public void listar(){
            if (!esVacia()) {
                nodoDobleCir aux = inicio;
                int i = 0;
                while(aux != null){
                    System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                    aux = aux.getSiguiente();
                    i++;
                }
            }
        }

    }
    //Listas armadas en base a tutorias y clases

