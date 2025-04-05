import java.util.Scanner;

public class VectorPractic{
  public static void main(String[] args){

   int longitud = 0;

   Scanner in = new Scanner(System.in);

   System.out.println("dame la cantidad de huecos #: ");
   longitud = in.nextInt();

   int numeros[] = new int [longitud];

   for(int i = 0; i < numeros.length; i++){
    System.out.println("dame el valor#: " + (i + 1));
    numeros[i] = in.nextInt();
  }
    for(int i = 0; i < numeros.length; i++){
     System.out.print("[" + numeros[i] + "]");
      
  }
     System.out.println("");

      System.out.println("**********************");
      System.out.println("* vectores Dinamicos *");
      System.out.println("**********************");

 }
}
