/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s4_carolina_solis;

import java.util.Scanner;

/**
 *
 * @author fifam
 */
public class Exp2_S4_Carolina_Solis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc= new Scanner(System.in);
        
        int filas = 5;
        int asientos = 5;
        
        boolean[]fila1=new boolean[asientos];
        boolean[]fila2=new boolean[asientos];
        boolean[]fila3=new boolean[asientos];
        boolean[]fila4=new boolean[asientos];
        boolean[]fila5=new boolean[asientos];
        
        System.out.println("Bienvenido al Sistema de disponibilidad y venta Asientos ");
        
        int filasel= -1;
        
        while(filasel !=0){
            System.out.println("plano de asientos disponibles (x=OCUPADO , 0=DIPONIBLE)");
            
            for(int f=1;f<=filas; f++){
                boolean[] filatemporal;
                
                if (f == 1)filatemporal = fila1;
                else if(f==2) filatemporal = fila2;
                else if (f==3) filatemporal = fila3;
                else if (f==4) filatemporal = fila4;
                else filatemporal=fila5;
                
                System.out.print("Fila= "+f);
            
                              
            
                
                for (int a=0; a<asientos ; a++){
                    if(filatemporal[a])System.out.print("[x]");
                    else System.out.print("[0]");
                }
                System.out.println();
                
            }
            
                        
            
            System.out.println("Seleccione una fila o 0 para salir ");
            
            if (tc.hasNextInt()){
             filasel=tc.nextInt();
            }else{
                tc.next();
                System.out.println("Por favor ingrese un numero valido");
                continue;
            }
            
             if(filasel==0){
                 break;
             }        
            
             if (filasel<1 || filasel>filas){
                 System.out.println("Fila Invalida");
                 continue;
             }
             
            System.out.println("seleccione un asiento (1- "+asientos+"):");
            
            int asientosel=tc.nextInt();
            
            System.out.println("La fila que ud ha seleccionado es Fila: "+filasel);
            System.out.println("y el asiento seleccionado es el numero: "+asientosel);
            
                               
        
            System.out.println("cantidad de entradas a comprar");
            int cantidad=tc.nextInt();
            
            
            int[] precio=new int[cantidad];
            
            for (int i=0; i<cantidad; i++){
                System.out.println("ingrese el precio de las entradas"+(i+1)+" :");
                precio[i]=tc.nextInt();
            }
            
                    
                     
                      
            int total =0;
            
            for (int i=0;i<precio.length; i++){
                total=total+ precio[i];
            }
            
            System.out.println("total de compra : "+total );
            
            
            System.out.println("Por favor, ingrese su edad: ");
            int edad = tc.nextInt();
            if (edad < 18) {
            System.out.println("Descuento del 10% aplicado. Usted es estudiante.");
            } else if (edad >= 65) {
            System.out.println("Descuento del 15% aplicado. Usted es una persona de la tercera edad.");
            } else {
            System.out.println("No se aplican descuentos.");
            }           
            
                  
                     
                                     
        }
 
         tc.close();
    }

}
        
                    
                  
 






         
