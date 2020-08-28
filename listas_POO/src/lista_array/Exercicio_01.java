package lista_array;

import java.util.Random;
/**
 * @author David Roussenq Maria
 * Curso ADS - Senac 2020-2
 */
public class Exercicio_01 {
    /**
     * 1-CRIE UM ARRAY DE INTEIROS DETAMANHO 10.
     * IMPLEMENTE UM PROGRAMA QUE DEFINA E ESCREVA O ARRAY,
     * BEM COMO A QUANTIDADE DE ELEMENTOS ARMAZENADOS NESTE ARRAY QUE S�O PARES.
     */
    public static void main(String[] args) {

        Random gerador = new Random();
        int[] numeros = new int[10];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(9) + 1;
            System.out.println(numeros[i]);
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Total de numeros pares: " + contador);

    }

}
