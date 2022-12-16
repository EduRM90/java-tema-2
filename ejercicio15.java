import java.util.Scanner;
public class ejercicio15 
{

    public static void main(String args[]) 
    {
        //opción 1 - columnas alternas
        /*int numeracion=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres que se repita?");
        numeracion = lectura.nextInt();
        //int columna = numeracion/2;
        
            for(int i=1; i<numeracion; i++)
            {
                if (i%2 != 0)
                {
                    System.out.println(i + " En clase no se juega");
                }
                else
                {
                    System.out.println("                       " + i + " En clase no se juega");
                }
            }*/
            
            //OPCIÓN 2 COLUMNAS PARALELAS
            /*int numeracion = 0;
            Scanner lectura = new Scanner(System.in);
            System.out.println("¿Cuántas veces quieres que se repita?");
            numeracion = lectura.nextInt();
            int fincolumna1 = numeracion/2;
            for(int i=1; i<=(numeracion/2); i++)
            {
            
             System.out.println(i + "En clase no se juega.          " + (i + fincolumna1) + "En clase no se juega.");
             
            }*/
            //opcion 3 IMPRIMIR EN DIAGONAL
        int numeracion=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuántas veces quieres que se repita?");
        numeracion = lectura.nextInt();
        String espacio = " ";
        for(int i=1; i<=numeracion; i++)
        {
         System.out.print(espacio);
         System.out.println(i + "En clase no se juega");
         espacio = espacio + "   ";
        }
    }
}
