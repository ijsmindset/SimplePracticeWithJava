import java.util.Scanner;

public class Holidays{
    public static void main (String args[]){

        Scanner in = new Scanner(System.in);
        String name = "";
        int key = 0, seniority = 0;

        System.out.println("*************************************************************************************************");
        System.out.println("* Bienvenidos al sistema de asignación de vacaciones para empleados en Transportes-Ivan company *");
        System.out.println("*************************************************************************************************"); 
        System.out.println("");       
        System.out.println(""); 
        System.out.println("Recuerda la clave de tu departamento: 1 operario, 2 Administracion, 3 Gerencia.");

        System.out.println( "Cual es tu nombre?" );
        name = in.nextLine();
        System.out.println("");

        System.out.println("Cuantos años lleva en la empresa el trabajador?");
        key = in.nextInt();
        System.out.println("");

        System.out.println("Cuál es la clave de su departamento?");
        seniority = in.nextInt();
        System.out.println("");

        if (key == 1){ 

            if(seniority == 1){
                System.out.println("El empleado " + name + " tiene derecho a 10 dias de vacaciones anuales" );
            }       else if(seniority >= 2 && seniority <= 5){
                System.out.println("El empleado " + name + " tiene derecho a 15 dias de vacaciones anuales");
            }       else if(seniority >= 6){
                System.out.println("El empleado " + name + " tiene derecho a 20 dias de vacaciones anuales");
            }
  
        } else if(key == 2){

            if(seniority == 1){
                System.out.println("El empleado " + name + " tiene derecho a 15 dias de vacaciones anuales" );
            }       else if(seniority >= 2 && seniority <= 5){
                System.out.println("El empleado " + name + " tiene derecho a 20 dias de vacaciones anuales" );
            }       else if(seniority >= 6){
                System.out.println("El empleado " + name + " tiene derecho a 25 dias de vacaciones anuales" );
            }

        } else if(key == 3){

            if(seniority == 1){
                System.out.println("El empleado " + name + " tiene derecho a 20 dias de vacaciones anuales" );
            }       else if(seniority >= 2 && seniority <= 5){
                System.out.println("El empleado " + name + " tiene derecho a 25 dias de vacaciones anuales" );
            }       else if(seniority >= 6){
                System.out.println("El empleado " + name + " tiene derecho a 30 dias de vacaciones anuales" );
            }
        } else {
        
               System.out.println("Error!! la clave del departamento no es correcta" );
        }
        

    } 

}


