package prueba1;

import java.util.Scanner;

public class prueba2 {

	public static int xd(int[] arreglo, int busqueda, int inicio, int fin) {
	/*	Scanner teclado = new Scanner(System.in);
		int[] miarreglo = new int[80000000];
		for (int i = 60000000; i < miarreglo.length; i++) {
			if (miarreglo[i] == miarreglo.length) {
				break;
			} else {
				miarreglo[i] = i;
			}
			System.out.println("introdusca el numero");
			int mibusqueda = teclado.nextInt();
			System.out.println("el numero es" + " " + mibusqueda);
			if (mibusqueda < 78000000 && mibusqueda > 72000000) {
				System.out.println("el numero es de viva");
			} else if (mibusqueda < 72000000 && mibusqueda > 68000000) {
				System.out.println("el numero es de tigo");
			} else if (mibusqueda < 68000000 && mibusqueda > 60000000) {
				System.out.println("el numero es de entel");
			} else {
				System.out.println("el numero no existe");
			}
*/
			if (inicio > fin) {
				return -1;
			}
			int indiceDelElementoMid = (int) Math.floor((inicio + fin) / 2);
			int elementoMid = arreglo[indiceDelElementoMid];
			if (elementoMid == busqueda) {
				return indiceDelElementoMid;
			}
			if (busqueda < indiceDelElementoMid) {
				fin = indiceDelElementoMid - 1;
				return xd(arreglo, busqueda, inicio, fin);

			} else {
				inicio = indiceDelElementoMid + 1;
				return xd(arreglo, busqueda, inicio, fin);
			}
	//	}
	//teclado.close();
	
	}
}

/*
 * int[] numeros = {12,45,67,27,89,84,65,21,44}; int numberToSearch = 44; if
 * (Arrays.binarySearch(numeros, numberToSearch)>0)
 * System.out.println("El número " + numberToSearch + " está en el Array"); else
 * System.out.println("El número " + numberToSearch + " NO está en el Array");
 */