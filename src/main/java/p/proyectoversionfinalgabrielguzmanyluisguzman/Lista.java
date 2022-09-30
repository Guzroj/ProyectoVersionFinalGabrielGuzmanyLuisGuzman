package p.proyectoversionfinalgabrielguzmanyluisguzman;

    /**
     * Clase que define las operaciones básicas que debe tener una lista simple.
     */
    public class Lista {


        // Puntero que indica el inicio de la lista o conocida tambien
        // como cabeza de la lista.
        private nodo inicio;
        // Variable para registrar el tamaño de la lista.
        private int size;
        /**
         * Constructor por defecto.
         */
        public void Lista(){
            inicio = null;
            size = 0;
        }
        /**
         * Consulta si la lista esta vacia.
         * @return true si el primer nodo (inicio), no apunta a otro nodo.
         */
        public boolean esVacia(){
            return inicio == null;
        }
        /**
         * Consulta cuantos elementos (nodos) tiene la lista.
         * @return numero entero entre [0,n] donde n es el numero de elementos
         * que contenga la lista.
         */
        public int getSize(){
            return size;
        }
        /**
         * Agrega un nuevo nodo al final de la lista.
         * @param valor a agregar.
         */
        public void agregarAlFinal(String valor){
            // Define un nuevo nodo.
            nodo nuevo = new nodo();
            // Agrega al valor al nodo.
            nuevo.setValor(valor);
            // Consulta si la lista esta vacia.
            if (esVacia()) {
                // Inicializa la lista agregando como inicio al nuevo nodo.
                inicio = nuevo;
                // Caso contrario recorre la lista hasta llegar al ultimo nodo
                //y agrega el nuevo.
            } else{
                // Crea ua copia de la lista.
                nodo aux = inicio;
                // Recorre la lista hasta llegar al ultimo nodo.
                while(aux.getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                // Agrega el nuevo nodo al final de la lista.
                aux.setSiguiente(nuevo);
            }
            // Incrementa el contador de tamaño de la lista
            size++;
        }
        /**
         * Agrega un nuevo nodo al inicio de la lista.
         * @param valor a agregar.
         */
        public void agregarAlInicio(String valor){
            // Define un nuevo nodo.
            nodo nuevo = new nodo();
            // Agrega al valor al nodo.
            nuevo.setValor(valor);
            // Consulta si la lista esta vacia.
            if (esVacia()) {
                // Inicializa la lista agregando como inicio al nuevo nodo.
                inicio = nuevo;
                // Caso contrario va agregando los nodos al inicio de la lista.
            } else{
                // Une el nuevo nodo con la lista existente.
                nuevo.setSiguiente(inicio);
                // Renombra al nuevo nodo como el inicio de la lista.
                inicio = nuevo;
            }
            // Incrementa el contador de tamaño de la lista.
            size++;
        }


        /**
         * Obtiene el valor de un nodo en una determinada posición.
         * @param posicion del nodo que se desea obtener su valor.
         * @return un numero entero entre [0,n-1] n = numero de nodos de la lista.
         * @throws Exception
         */
        public String getValor(int posicion) throws Exception{
            // Verifica si la posición ingresada se encuentre en el rango
            // >= 0 y < que el numero de elementos del la lista.
            if(posicion>=0 && posicion< size){
                // Consulta si la posicion es el inicio de la lista.
                if (posicion == 0) {
                    // Retorna el valor del inicio de la lista.
                    return inicio.getValor();
                }else{
                    // Crea una copia de la lista.
                    nodo aux = inicio;
                    // Recorre la lista hasta la posición ingresada.
                    for (int i = 0; i < posicion; i++) {
                        aux = aux.getSiguiente();
                    }
                    // Retorna el valor del nodo.
                    return aux.getValor();
                }
                // Crea una excepción de Posicion inexistente en la lista.
            } else {
                throw new Exception("Posicion inexistente en la lista.");
            }
        }
        /**
         * Busca si existe un valor en la lista.
         * @param referencia valor a buscar.
         * @return true si existe el valor en la lista.
         */
        public boolean buscar(String referencia){
            // Crea una copia de la lista.
            nodo aux = inicio;
            // Bandera para indicar si el valor existe.
            boolean encontrado = false;
            // Recorre la lista hasta encontrar el elemento o hasta
            // llegar al final de la lista.
            while(aux != null && encontrado != true){
                // Consulta si el valor del nodo es igual al de referencia.
                if (referencia == aux.getValor()){
                    // Canbia el valor de la bandera.
                    encontrado = true;
                }
                else{
                    // Avansa al siguiente. nodo.
                    aux = aux.getSiguiente();
                }
            }
            // Retorna el resultado de la bandera.
            return encontrado;
        }



        /**
         * Elimina un nodo que se encuentre en la lista ubicado
         * por su posición.
         * @param posicion en la cual se encuentra el nodo a eliminar.
         */
        public void removerPorPosicion(int posicion){
            // Verifica si la posición ingresada se encuentre en el rango
            // >= 0 y < que el numero de elementos del la lista.
            if(posicion>=0 && posicion< size){
                // Consulta si el nodo a eliminar es el primero
                if(posicion == 0){
                    // Elimina el primer nodo apuntando al siguinte.
                    inicio = inicio.getSiguiente();
                }
                // En caso que el nodo a eliminar este por el medio
                // o sea el ultimo
                else{
                    // Crea una copia de la lista.
                    nodo aux = inicio;
                    // Recorre la lista hasta lleger al nodo anterior al eliminar.
                    for (int i = 0; i < posicion-1; i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo a eliminar.
                    nodo siguiente = aux.getSiguiente();
                    // Elimina la referencia del nodo apuntando al nodo siguiente.
                    aux.setSiguiente(siguiente.getSiguiente());
                }
                // Disminuye el contador de tamaño de la lista.
                size--;
            }
        }
        /**
         * Elimina la lista
         */
        public void eliminar(){
            // Elimina el valor y la referencia a los demas nodos.
            inicio = null;
            // Reinicia el contador de tamaño de la lista a 0.
            size = 0;
        }
        /**
         * Mustra en pantalla los elementos de la lista.
         */
        public void listar(){
            // Verifica si la lista contiene elementoa.
            if (!esVacia()) {
                // Crea una copia de la lista.
                nodo aux = inicio;
                // Posicion de los elementos de la lista.
                int i = 0;
                // Recorre la lista hasta el final.
                while(aux != null){
                    // Imprime en pantalla el valor del nodo.
                    System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                    // Avanza al siguiente nodo.
                    aux = aux.getSiguiente();
                    // Incrementa el contador de la posión.
                    i++;
                }
            }
        }

    }
