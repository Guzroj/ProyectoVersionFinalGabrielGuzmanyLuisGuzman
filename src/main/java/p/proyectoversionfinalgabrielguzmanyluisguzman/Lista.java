package p.proyectoversionfinalgabrielguzmanyluisguzman;

/**
 * Es una lista enlazada que se utiliza para recorrer de forma simple.
 */
    public class Lista {


        private nodo inicio;
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
     * agrega el nodo al final
     * @param valor es un string
     */

    public void agregarAlFinal(String valor){

            nodo nuevo = new nodo();
            nuevo.setValor(valor);
            if (esVacia()) {
                inicio = nuevo;
            } else{
                nodo aux = inicio;
                while(aux.getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(nuevo);
            }
            size++;
        }

    /**
     * agrega el nodo al inicio de la lista.
     * @param valor es un string
     */
    public void agregarAlInicio(String valor){
            nodo nuevo = new nodo();
            nuevo.setValor(valor);
            if (esVacia()) {
                inicio = nuevo;
            } else{
                nuevo.setSiguiente(inicio);
                inicio = nuevo;
            }
            size++;
        }

    /**
     * Obtiene el valor de una posicion
     * @param posicion es un integrer que busca la posicion en un nodo
     * @return el nodo
     * @throws Exception
     */
        public String getValor(int posicion) throws Exception{
            if(posicion>=0 && posicion< size){
                if (posicion == 0) {
                    return inicio.getValor();
                }else{
                    nodo aux = inicio;
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
     * verifica que este el nodo que busco
     * @param referencia el nodo que se busca
     * @return boolean
     */
    public boolean buscar(String referencia){
            nodo aux = inicio;
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
     * me borra el nodo de una posicion dada
     * @param posicion es un integrer
     */



    public void removerPorPosicion(int posicion){
            if(posicion>=0 && posicion< size){
                if(posicion == 0){
                    inicio = inicio.getSiguiente();
                }
                else{
                    nodo aux = inicio;
                    for (int i = 0; i < posicion-1; i++) {
                        aux = aux.getSiguiente();
                    }
                    nodo siguiente = aux.getSiguiente();
                    aux.setSiguiente(siguiente.getSiguiente());
                }
                size--;
            }
        }

        public void eliminar(){
            inicio = null;
            // Reinicia el contador.
            size = 0;
        }

        public void listar(){
            if (!esVacia()) {
                nodo aux = inicio;
                int i = 0;
                while(aux != null){
                    System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                    aux = aux.getSiguiente();
                    i++;
                }
            }
        }

    }
