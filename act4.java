import java.util.*;
public class act4 
{

    public static void main(String args[]) 
    {
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Eres mayor de edad? (sí/no)");
        String respuesta = lectura.next();
        String posiblerespuesta1 = "sí";
//        String posiblerespuesta2 = "si";
//        String posiblerespuesta3 = "Sí";
//        String posiblerespuesta4 = "Si";

        while(!(respuesta.equals(posiblerespuesta1)))
        {
            System.out.println("Prueba otra vez");
        
            System.out.println("¿Eres mayor de edad? (sí/no)");
            respuesta = lectura.next();
        }
    }
}
