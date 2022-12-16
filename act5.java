import java.util.*;
public class act5 
{

    public static void main(String args[]) 
    {
    Scanner lectura1 = new Scanner(System.in);
    System.out.println("¿Cuál es el límite de hoy?");
    int limite = lectura1.nextInt();
    int acumulador = 0;
    
    do
    {
    Scanner lectura2 = new Scanner(System.in);
    System.out.println("¿Cuántas piezas lleva?");
    int caza = lectura2.nextInt();
    acumulador = caza + acumulador;
    System.out.println("Usted lleva " + acumulador + " piezas de las " + limite + " que puede cazar.");
    
    }while(acumulador<limite);
    System.out.println("Se acabó la caza");
 
    }
}
