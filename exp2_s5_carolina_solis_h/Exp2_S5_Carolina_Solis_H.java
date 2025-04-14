/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exp2_s5_carolina_solis_h;

import java.util.Scanner;

/**
 *
 * @author fifam
 */
public class Exp2_S5_Carolina_Solis_H {

    /**
     * @param args the command line arguments
     */
    
      
    
    
    public static void main(String[] args) {
         //precios de las entradas
        int VALOR_ENTRADA_VIP  = 10000;
        int VALOR_ENTRADA_PLATEA = 7000;
        int VALOR_ENTRADA_GENERAL= 5000;   
        
        Scanner tc= new Scanner(System.in);
        
        System.out.println("=====BIENVENIDO A TEATRO MORO=====");
                   
        
             
        boolean[]fila1UBICACIONVIP = new boolean[7];
        boolean[]fila2UBICACIONPLATEA = new boolean[7];
        boolean[]fila3UBICACIONGENERAL = new boolean[7];
        
        System.out.println("¿Cuantas entradas desea comprar?");
        int cantidadEntradas=tc.nextInt();
        
             
            
                
        int asientosseleccionados=0;
                
        while (asientosseleccionados<cantidadEntradas){
            System.out.println("Asientos Disponibles ");
            
            System.out.print("fila1UBICACIONVIP" );
            for (int i=0; i<fila1UBICACIONVIP.length; i++){
                if(fila1UBICACIONVIP[i]){
                    System.out.print("[X]");
                }else{
                    System.out.print("[O]");
                }
            }
            System.out.println("");
            
            System.out.print("fila2UBICACIONPLATEA");
            for (int i=0; i<fila2UBICACIONPLATEA.length; i++){
                if(fila2UBICACIONPLATEA[i]){
                    System.out.print("[X]");
                }else{
                    System.out.print("[O]");
                }
            }
            System.out.println("");
            
            System.out.print("fila3UBICACIONGENERAL");
            for (int i=0; i<fila3UBICACIONGENERAL.length; i++){
                if(fila3UBICACIONGENERAL[i]){
                    System.out.print("[X]");
                }else{
                    System.out.print("[O]");
                }
            }
            System.out.println("");
            
            
            System.out.println("seleccione fila (1-3) "); 
            int fila=tc.nextInt();
            
                                 
                
                    
                        
            
            System.out.println("seleccione numero de asiento(1-7)");
            int asiento=tc.nextInt();
            
            boolean ocupado=false; 
            
            if(fila==1){
               if(fila1UBICACIONVIP[asiento-1]==false){
                  fila1UBICACIONVIP[asiento-1]=true;
                  ocupado=true;
               } 
            }else if(fila==2){
               if(fila2UBICACIONPLATEA[asiento-1]==false){
                  fila2UBICACIONPLATEA[asiento-1]=true; 
                  ocupado=true;
               } 
            }else if (fila==3){
                if(fila3UBICACIONGENERAL[asiento-1]==false){
                   fila3UBICACIONGENERAL[asiento-1]=true;
                   ocupado=true;
                }
            }else{
                System.out.println("fila invalida");    
            }
           
           
            if (ocupado==true){
                System.out.println("asiento reservado");
                asientosseleccionados++;
            }else{
                System.out.println("asiento no disponible");
            }
        }
                   
         
            
        //valorentradas
        System.out.println("VALORES ENTRADAS ");
        System.out.println("1. VALOR FILA1-UBICACION VIP $" + VALOR_ENTRADA_VIP);
        System.out.println("2. VALOR FILA2-UBICACION PLATEA $" + VALOR_ENTRADA_PLATEA);
        System.out.println("3. VALOR FILA3-UBICACION GENERAL $" + VALOR_ENTRADA_GENERAL);
        
        int opcionUbicacion;
        do{
            System.out.println("Seleccione Valor entrada de acuerdo a ubicacion fila, debe elegir un numero (1-3): ");
            opcionUbicacion=tc.nextInt();          
        }while (opcionUbicacion <1 || opcionUbicacion >3);
        
        String ubicacion=" ";      
        double precio = 0 ; 
        
        
        switch (opcionUbicacion) {
                
            case 1:
                ubicacion = "UBICACION VIP";
                precio = VALOR_ENTRADA_VIP;
                break;
            case 2:
                 ubicacion = "UBICACION PLATEA";
                 precio = VALOR_ENTRADA_PLATEA;
                 break;
            case 3:
                 ubicacion = "UBICACION GENERAL";
                 precio = VALOR_ENTRADA_GENERAL;
                 break;          
            
            
        }
        
        // Solicitar Tipo de Cliente
        System.out.println("TIPO DE CLIENTE");
        System.out.println("1. ESTUDIANTE (10% descuento)");
        System.out.println("2. TERCERA EDAD (15% descuento)");
        System.out.println("3.NINGUNO");
        
        int opcionCliente;
        do {
            System.out.println("Por favor seleccione tipo de cliente (1-3): ");
            opcionCliente=tc.nextInt();
            
        }while (opcionCliente<1 || opcionCliente > 3);
        
        double descuento= 0;
        String tipoDescuento ="Ninguno";
        
        if (opcionCliente==1){
            descuento = precio*0.10;
            tipoDescuento="ESTUDIANTE (10%)";           
        } else if (opcionCliente==2){
            descuento = precio*0.15;
            tipoDescuento="TERCERA EDAD (15%)";
            
        }
                
        double precioFinal= (precio - descuento)*cantidadEntradas;
        
        
        // PROMOCIONES DISPONIBLES
        System.out.println("Promociones disponibles:");
        System.out.println("1.PROMOCION FAMILIA (4 entradas): 30% de descuento");
        System.out.println("2. PROMOCION AMIGOS (6 entradas): 35% de descuento");
        System.out.println("3. NINGUNO");
                    
        int opcionPromocion;
        do {
            System.out.println("Por favor seleccione opcion promocion disponible (1-3): ");
            opcionPromocion=tc.nextInt();
            
        }while (opcionPromocion<1 || opcionPromocion > 3);
        
        double descuentoPromocion= 0;
        String tipoDescuentoPromocion ="Ninguno";
        
        if (opcionPromocion==1){
            descuentoPromocion = precio*0.30;
            tipoDescuentoPromocion="ROMOCION FAMILIA (30%)";           
        } else if (opcionPromocion==2){
            descuentoPromocion = precio*0.35;
            tipoDescuentoPromocion="PROMOCION AMIGOS (35%)";
        } else if (opcionPromocion==3){
            descuentoPromocion = precio;
            tipoDescuentoPromocion="ninguno";
        
        }
             
                     
        double precioPromocion= (precio - descuentoPromocion)*cantidadEntradas ;
        
       
            
  
                       
        
       
        //Mostrar en resumen
        
        System.out.println("Ubicacion :"+ ubicacion);
        System.out.println("Precio Entrada $: "+ precio );
        System.out.println("Descuento:" + tipoDescuento );
        System.out.println("Precio Final $:" + precioFinal);
        System.out.println("Precio Promocion$:" + precioPromocion);    
        
        System.out.println("Gracias por su Compra");
        
        
    }
    
}
