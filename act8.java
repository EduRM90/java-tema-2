import java.util.*;
public class act8 
{

    
    public static void main(String args[]) 
    {
     Scanner lectura = new Scanner(System.in);
     System.out.println("Escribe una frase");
     String frase = lectura.next();
//     boolean hasMoreTokens = false;
//     do
//     {
     StringTokenizer corte = new StringTokenizer(frase, " ");
     StringTokenizer corte2 = new StringTokenizer(frase, " ");
     StringTokenizer corte3 = new StringTokenizer(frase, " ");
     
     
     String frasecortada = corte.nextToken(" ");
     String frasecortada2 = corte2.nextToken(" ");
     String frasecortada3 = corte3.nextToken(" ");
     
     
     System.out.println(frasecortada);
     System.out.println(frasecortada2);
     System.out.println(frasecortada3);
   
     
//     }while(hasMoreTokens = true);
    }
}
