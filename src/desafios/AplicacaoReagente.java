package desafios;

import desafios.ListaPosicoes;

import java.util.Scanner;

public class AplicacaoReagente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaPosicoes<Integer> lista = new ListaPosicoes<>();

        System.out.print("Digite um valor de posicao para o reagente: ");
        int n = sc.nextInt();

        for(int i=0; i < n; i++) {
            Integer valor = sc.nextInt();
            lista.addPosicao(valor);
        }

        lista.print();
        Integer x = lista.first();
        System.out.println("Posicao: " + x);

        sc.close();

    }

}
