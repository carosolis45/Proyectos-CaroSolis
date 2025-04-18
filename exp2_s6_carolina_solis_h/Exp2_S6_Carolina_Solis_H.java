/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s6_carolina_solis_h;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author fifam
 */
public class Exp2_S6_Carolina_Solis_H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    int filas = 4;
    int asientos = 7;


    boolean[] fila1 = new boolean[asientos];
    boolean[] fila2 = new boolean[asientos];
    boolean[] fila3 = new boolean[asientos];
    boolean[] fila4 = new boolean[asientos];
    

    Scanner sc = new Scanner(System.in);
    System.out.println("::::BIENVENIDOS A TEATRO MORO:::::");
    System.out.println("=== reservas de asientos ==="); 

    int opcion= -1;
    
    while (opcion !=0){
        System.out.println("::::MENU DE OPCIONES::::");
        System.out.println("1.DISPONIBILIDAD");
        System.out.println("2.RESERVA ASIENTOS");
        System.out.println("0.SALIR DEL MENU");
        System.out.println("Selecciones un numero de opcion (1,2,0 salir)");
        
        if(sc.hasNextInt()){
            opcion=sc.nextInt();
        }else{
            sc= next();
            System.out.println("Favor ingresar numero valido");
            continue;
        }
        
        
        switch (opcion){
            case 1:
                for (int f = 1; f <= filas; f++) {
                boolean[] filaActual; 
                if (f == 1) filaActual = fila1;
                else if (f == 2) filaActual = fila2;
                else if (f == 3) filaActual = fila3;
                else filaActual = fila4;

               System.out.print("Fila " + f + ": ");

               for (int a = 0; a < asientos; a++) {
               if (filaActual[a]) System.out.print("[X]");
               else System.out.print("[O]");
               }
               System.out.println(); 
               }
               break;
            case 2:
               int filaSel = -1;
               System.out.print("\nSeleccione una fila (1-" + filas + ") o 0 para salir: ");
                        
               while (filaSel != 0) {
               if (sc.hasNextInt()) {
               filaSel = sc.nextInt(); 
               } else {
               sc.next();
               System.out.println("Por favor, ingrese un número válido.");
               continue; 
               }
               if (filaSel == 0) {
        break;
      }
      if (filaSel < 1 || filaSel > filas) {
        System.out.println("Fila inválida.");
        continue;
      }


      System.out.print("Por Favor Seleccione un asiento (1-" + asientos + "): ");
      int asientoSel = sc.nextInt();

      if (asientoSel < 1 || asientoSel > asientos) {

        System.out.println("Asiento inválido.");

        continue;
       
        
      }

      boolean[] filaSeleccionada;
      if (filaSel == 1) filaSeleccionada = fila1;
      else if (filaSel == 2) filaSeleccionada = fila2;
      else if (filaSel == 3) filaSeleccionada = fila3;
      else filaSeleccionada = fila4;

      if (filaSeleccionada[asientoSel - 1]) {

      System.out.println("Lo sentimos este asiento ya está ocupado.");

      } else {

        filaSeleccionada[asientoSel - 1] = true;

        System.out.println("La Reserva fue exitosa: Fila " + filaSel + " – Asiento " + asientoSel);

        Timer timer= new Timer ();
        
        final int filaTemporal= filaSel;
        final int asientoTemporal= asientoSel;
        
        TimerTask tareadeCancelacion=new TimerTask(){
        @Override    
        public void run(){
           filaSeleccionada[filaTemporal - 1] = false;
           System.out.println("LA RESERVA DE FILA:"+filaTemporal+ "ASIENTO:"+asientoTemporal+ "FUE CANCELADO");
           timer.cancel();
        }
                
        };
        
        timer.schedule(tareadeCancelacion,40000); 
        
                        
        
      }

      System.out.println("Si el tiempo finaliza y deseas reservar, debes volver ingresar ");   
      System.out.println("::::GRACIAS POR  VISITAR TEATRO MORO:::::"); 
      
    }

                          
                          
            break;
            
            case 0:
            System.out.println("Salir");
            break;
                    
            default:  
            System.out.println("no valida la opcion");
            throw new AssertionError();
        } 
        
        
     
        
    }
           
        
        
    sc.close();

     
   
        
        
      
      
              
        
        
    }
}
                        
        
  
        
    