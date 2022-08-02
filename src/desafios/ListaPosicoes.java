package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ListaPosicoes<T> {


        private List<T> lista= new ArrayList<>();

        public void addPosicao(T valor) {
            lista.add(valor);
        }

        public T first() {
            if (lista.isEmpty()) {
                throw new IllegalStateException("A lista esta vazia");
            }
            return lista.get(0);
        }

        public void print() {
            System.out.print("[");
            if (!lista.isEmpty()) {
                System.out.print(lista.get(0));
            }
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(", " + lista.get(i));
            }
            System.out.println("]");
        }
    }

