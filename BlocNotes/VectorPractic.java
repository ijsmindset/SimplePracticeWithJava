import java.util.Scanner;

public class VectorPractic{
  public static void main(String[] args){

   int longitud = 0;

   Scanner in = new Scanner(System.in);

   System.out.println("Give me the number of positions #: ");
   longitud = in.nextInt();

   int numeros[] = new int [longitud];

   for(int i = 0; i < numeros.length; i++){
    System.out.println("Give me value #: " + (i + 1));
    numeros[i] = in.nextInt();
  }
    for(int i = 0; i < numeros.length; i++){
     System.out.print("[" + numeros[i] + "]");
      
  }
     System.out.println("");

      System.out.println("**********************");
      System.out.println("* vectores Dinamicos *");
      System.out.println("**********************");
/*version de prueba*/
 }
}
