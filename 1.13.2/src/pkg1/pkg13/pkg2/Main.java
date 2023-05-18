/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.pkg13.pkg2;
import java.util.Scanner;
/**
En este ejemplo, utilizamos la clase Scanner para obtener el valor de n desde la entrada del usuario.
* Luego, creamos un vector llamado numeros de tamaño n. 
* Utilizamos un bucle for para recorrer el vector y asignar los números del 1 hasta n a cada elemento del vector.
* Finalmente, imprimimos los números almacenados en el vector utilizando otro bucle for.

Al ejecutar este programa, te pedirá ingresar el valor de n.
* Después de ingresar el valor, mostrará los números del 1 hasta n almacenados en el vector. 
* Por ejemplo, si ingresas 10, mostrará los números del 1 al 10.

 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Ingrese sus digitos aca");
   int n = scanner.nextInt();
    int[] numeros = new int[n];
    for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        System.out.println("Los numeros almacenados son");
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
    
}
