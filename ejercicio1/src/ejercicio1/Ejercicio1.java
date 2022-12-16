package ejercicio1;
import bpc.daw.reproductor.*;
import java.util.Scanner;
public class Ejercicio1 
{

    public static void main(String[] args) 
    {
     ArchivoMP3 track1 = new ArchivoMP3("hola1");
     ArchivoMP3 track2 = new ArchivoMP3("hola2");
     ArchivoMP3 track3 = new ArchivoMP3("hola3");
     ArchivoMP3 track4 = new ArchivoMP3("hola4");
     ArchivoMP3 track5 = new ArchivoMP3("hola5");
     boolean salir = false;
     
     System.out.println("Selecciona tu track:");
     System.out.println("0 -> Mostrar tracks disponibles");
     System.out.println("1 -> Mostrar track 1");
     System.out.println("2 -> Mostrar track 2");
     System.out.println("3 -> Mostrar track 3");
     System.out.println("4 -> Mostrar track 4");
     System.out.println("5 -> Salir del Sistema");
     ArchivoMP3[] ListaCanciones = {track1, track2, track3, track4, track5};
     
     int opcion = 0;
     Scanner lectura = new Scanner(System.in);
     System.out.println("¿Qué tema quieres escuchar?");
     opcion = lectura.nextInt();
     
     switch(opcion)
     {
         case 0:
              for(int i = 0; i < ListaCanciones.length; i++) //Length es la longitud de la lista 
              {
              System.out.println("----------------------------");
              System.out.println("La canción elegida es " + ListaCanciones[i+1]); // ¿por qué se pone el +1? Por la posición del Array
              }
     System.out.println("----------------------------");
     }        
     
    }
    
}
