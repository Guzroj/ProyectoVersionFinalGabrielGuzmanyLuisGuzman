package p.proyectoversionfinalgabrielguzmanyluisguzman;

public class nodoDobleCir {




        private String valor;

        private nodoDobleCir siguiente, anterior;

        public void Nodo(){
            this.valor = "";
            this.siguiente = null;
            this.anterior = null;
        }


        public String getValor() {
            return valor;
        }

        public void setValor(String valor) {
            this.valor = valor;
        }

        public nodoDobleCir getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(nodoDobleCir siguiente) {
            this.siguiente = siguiente;
        }

        public nodoDobleCir getAnterior() {
            return anterior;
        }

        public void setAnterior(nodoDobleCir anterior) {
            this.anterior = anterior;
        }
}
