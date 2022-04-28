package practicas;
import java.lang.Math;
import java.util.Scanner;


public class Juego_AdivinaNumero {
    
    public static void main(String[] args) {
        int intentos = 0;
        int numero = 0;
        Scanner entrada = new Scanner(System.in);
        int aleatorio = (int)(Math.random() * 100);

        do{
            intentos++;

            System.out.println("Ingrese un número: ");
            numero = entrada.nextInt();

            if(numero > aleatorio){
                System.out.println("Más bajo");

            }else if(numero < aleatorio){
                System.out.println("Más alto");
            }

        }while(numero != aleatorio);
        entrada.close();

        System.out.println("Correcto. " + "Lo lograste en: " + intentos + " intentos");
       
      
        
       

        

        

    
       
        


       

        


        
        

        

    }
}
