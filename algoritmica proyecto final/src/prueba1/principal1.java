package prueba1;

import java.util.Scanner;

public class principal1 {

	public static void main( String[] args) {
		Scanner teclado = new Scanner(System.in);
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
			int inicio = miarreglo[0];
			int fin = miarreglo.length-1;
			prueba2.xd(miarreglo, mibusqueda, inicio, fin);

}
}
}