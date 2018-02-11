/**
* Write a description of class cerosFactorial here.
* 
* @authors
* Juan Carlos Monsalve Torres
* Ronal Mauricio Reales Fernandez
* Luis David Roa Saavedra
* 
*/
import java.util.Scanner;
public class Add_two_numbers
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        String numero = "";

        System.out.print("\n Ingrese dos numeros serparados por un espacio \n ");
        numero = entrada.nextLine();
        String[] datos = numero.split(" ");
        for (int i = 0; i < datos.length; i++) {
            suma = suma + Integer.valueOf(datos[i]);
        }
        System.out.print("La suma de los dos numeros es: " + suma + " \n");
    }
}