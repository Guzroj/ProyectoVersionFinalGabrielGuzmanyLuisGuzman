package p.proyectoversionfinalgabrielguzmanyluisguzman;

public class ListaDobleCir {


        // Puntero que indica el inicio de la lista o conocida tambien
        // como cabeza de la lista.
        private NodoDE inicio;
        // Variable para registrar el tamaño de la lista.
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



        public void agregarAlFinal(String valor){
            // Define un nuevo nodo.
            NodoDE nuevo = new NodoDE();
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
                NodoDE aux = inicio;;
                // Recorre la lista hasta llegar al ultimo nodo.
                while(aux.getSiguiente() != null){
                    aux= aux.getSiguiente();
                }
                // Agrega el nuevo nodo al final de la lista.
                aux.setSiguiente(nuevo);
                nuevo.setAnterior(aux);

            }
            size++;

        }

        public void agregarAlInicio(String valor){
            // Define un nuevo nodo.
            nodoDobleCir nuevo = new nodoDobleCir();
            // Agrega al valor al nodo.
            nuevo.setValor(valor);

            // Consulta si la lista esta vacia.
            if (esVacia()) {
                // Inicializa la lista agregando como inicio al nuevo nodo.
                inicio = nuevo;

                // Caso contrario va agregando los nodos al inicio de la lista.
            } else{
                // Une el nuevo nodo con la lista existente.
                nodoDobleCir aux = inicio.getAnterior();
                nuevo.setAnterior(aux);
                //aux.setSiguiente(nuevo);
                inicio.setAnterior(nuevo);
                nuevo.setSiguiente(inicio);
                // Renombra al nuevo nodo como el inicio de la lista.
                inicio = nuevo;
            }
            // Incrementa el contador de tamaño de la lista.
            size++;
        }


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
                    nodoDobleCir aux = inicio;
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

        public boolean buscar(String referencia){
            // Crea una copia de la lista.
            nodoDobleCir aux = inicio;
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
                    nodoDobleCir aux = inicio;
                    // Recorre la lista hasta lleger al nodo anterior al eliminar.
                    for (int i = 0; i < posicion-1; i++) {
                        aux = aux.getSiguiente();
                    }
                    // Guarda el nodo siguiente al nodo a eliminar.
                    nodoDobleCir siguiente = aux.getSiguiente();
                    // Elimina la referencia del nodo apuntando al nodo siguiente.
                    aux.setSiguiente(siguiente.getSiguiente());
                }
                // Disminuye el contador de tamaño de la lista.
                size--;
            }
        }

        public void eliminar(){
            // Elimina el valor y la referencia a los demas nodos.
            inicio = null;
            // Reinicia el contador de tamaño de la lista a 0.
            size = 0;
        }

        public void listar(){
            // Verifica si la lista contiene elementoa.
            if (!esVacia()) {
                // Crea una copia de la lista.
                nodoDobleCir aux = inicio;
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

