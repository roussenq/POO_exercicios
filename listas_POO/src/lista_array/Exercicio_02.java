package lista_array;

import java.util.Random;

/**
 * @author David Roussenq Maria Curso ADS - Senac 2020-1
 */
public class Exercicio_02 {

	/**
	 * 2-CRIE UM ARRAY DE INTEIROS DETAMANHO 10. IMPLEMENTE UM PROGRAMA QUE DEFINA E
	 * ESCREVA O ARRAY, BEM COMO A SOMA DOS ELEMENTOS ARMAZENADOS NESTEARRAY.
	 */
	public static void main(String[] args) {

		Random gerador = new Random();
		int[] numeros = new int[10];
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = gerador.nextInt(9) + 1;
			soma += numeros[i];
			System.out.println("Elemento nº" + (i + 1) + ": " + numeros[i]);
		}
		System.out.println("A soma dos elementos do array é: " + soma);
	}

}
