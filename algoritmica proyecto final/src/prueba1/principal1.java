package prueba1;
import java.util.Scanner;
public class principal1 {

	public static void main( String[] args) {
		int[] arreglo ;
		int busqueda;
		int inicio ;
		int fin;
		Scanner teclado = new Scanner(System.in);
		int[] miarreglo = new int [79999999];
		for(int i =60000000 ;i==miarreglo.length;i++) {
			int[] miarrreglo= {i};
		}
		System.out.println("introdusca el numero");
		int telefono =teclado.nextInt();
		if (inicio > fin) {
			return;
		}
		int indiceDelElementoMid = (int) Math.floor((inicio + fin) / 2);
		int elementoMid = arreglo[indiceDelElementoMid];
		if(elementoMid == busqueda) {
		return ;
		}
		if (busqueda < indiceDelElementoMid ) {
			fin = indiceDelElementoMid - 1;
			return ;
		}else {
			inicio = indiceDelElementoMid + 1;
			return main(arreglo, busqueda , inicio, fin );
		}
	}

}

/*package prueba1;
import java.util.Scanner;
public class principal1 {
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introdusca el numero de telefono");
	int numero = teclado.nextInt();
	System.out.println("el numero es" + " " + numero);
	if (numero < 78000000 && numero >72000000) {
	System.out.println("el numero es de viva");
	} else if(numero <72000000 && numero >68000000) {
		System.out.println("el numero es de tigo");
	} else if(numero < 68000000 && numero >60000000) {
		System.out.println("el numero es de entel");
	}else {
		System.out.println("el numero no existe");
	}
	
	teclado.close();*/
	/*
	 * static int arr[];
	static int Binarysearch(int inicial, int final, int numero) {
		if (final >= inicial) {
			int medio = inicial + (final - inicial) / 2;
			if (arr[medio] == numero {
				return medio;
			} else if (arr[medio] > numero) {
				return Binarysearch(inicial, medio - 1, numero);
			} else {
				return Binarysearch(medio + 1, final, numero);
			}
		} else {
			return -1;
		}
	}
	static int Binarysearch(int numero) {
		int inicial = 0;
		int final = arr.length - 1;
		while (inicial <= final) {
			int medio = inicial + (final - inicial) / 2;
			if (arr[medio] == numero) {
				return medio;
			}
			if (arr[medio] < numero) {
				inicial = medio + 1;
			} else {
				final = medio - 1;
			}
		}
		return -1;
	}
}
*/
	/*int busquedaBin(int bajo,int alto)
{
    int resultado;

     if (bajo== alto){
        return bajo;
     }

     int mid=(bajo+alto)/2;


      if(f(mid))
        {
           resultado = busquedaBin(bajo, mid);
        }
        else
        {
           resultado = busquedaBin(mid+1, alto);
        }

return resultado;
*/
	
	/*}
	
}*/
