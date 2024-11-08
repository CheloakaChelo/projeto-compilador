import java.util.Set;
import java.util.HashSet;

public class Simbolos {

        private static Set<Integer> idsImpressos = new HashSet<>();

        private int numero;

        private String simbolo;

        public Simbolos(Set<Integer> idsImpressos, int numero, String simbolo) {
            this.numero = numero;
            this.simbolo = simbolo;

        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getSimbolo() {
            return simbolo;
        }

        public void setSimbolo(String simbolo) {
            this.simbolo = simbolo;
        }


    }
