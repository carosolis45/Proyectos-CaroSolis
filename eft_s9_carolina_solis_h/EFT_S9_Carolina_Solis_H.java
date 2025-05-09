/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eft_s9_carolina_solis_h;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author fifam
 */
public class EFT_S9_Carolina_Solis_H {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner scanner = new Scanner(System.in);
        
        // Datos del teatro
        String nombreTeatro = "TEATRO MORO";
        
        
        // Listas para almacenar datos de las entradas vendidas
        ArrayList<Integer> numerosAsientos = new ArrayList<>();
        ArrayList<String> tiposEntrada = new ArrayList<>(); // "VIP", "PLATEA", "PALCO", "GALERIA"
        ArrayList<Double> precios = new ArrayList<>();
        ArrayList<String> categoriasCliente = new ArrayList<>(); //  Estudiante, Niños,mujeres, Adulto Mayor
        ArrayList<Double> preciosOriginales = new ArrayList<>();
        ArrayList<Double> preciosFinales = new ArrayList<>();
        
        // Precios según tipo de entrada
        final double PRECIO_VIP = 10000;
        final double PRECIO_PALCO = 7000;
        final double PRECIO_PLATEA_ALTA= 6000;
        final double PRECIO_PLATEA_BAJA = 5000;
        final double PRECIO_GALERIA= 4000;
        
        //descuento
        final double DESCUENTO_NIÑOS = 0.10; // 10%
        final double DESCUENTO_ESTUDIANTE = 0.15; // 15%
        final double DESCUENTO_MUJERES = 0.20; // 20%
        final double DESCUENTO_ADULTO_MAYOR = 0.25; // 25%
        
        
        int totalAsientos = 50;
        int asientosDisponibles = totalAsientos;
        
        System.out.println("=== SISTEMA DE VENTA DE ENTRADAS ===");
        System.out.println("Teatro: " + nombreTeatro);
        System.out.println("Asientos disponibles: " + asientosDisponibles + "/" + totalAsientos);
        
        
        
        while (asientosDisponibles > 0) {
            System.out.println("\n=== NUEVA VENTA ===");
            
        // Seleccionar categoría de cliente
            System.out.println("\nCategoria de cliente:");
            System.out.println("1. Normal (sin descuento)");
            System.out.println("2. Estudiante (15% descuento)");
            System.out.println("3. Adulto Mayor (25% descuento)");
            System.out.println("4. Niños (10% descuento)");
            System.out.println("5. Mujeres (20% descuento)");
            System.out.println("Seleccione categoría (1-5):");
            int categoria = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            String categoriaCliente = "";
            double factorDescuento = 0;
            
            switch (categoria) {
                case 1:
                    categoriaCliente = "Normal";
                    factorDescuento = 0;
                    break;
                case 2:
                    categoriaCliente = "Estudiante";
                    factorDescuento = DESCUENTO_ESTUDIANTE;
                    break;
                case 3:
                    categoriaCliente = "Adulto Mayor";
                    factorDescuento = DESCUENTO_ADULTO_MAYOR;
                    break;
                case 4:
                    categoriaCliente = "Niños";
                    factorDescuento = DESCUENTO_NIÑOS;
                    break;  
                case 5:
                    categoriaCliente = "Mujeres";
                    factorDescuento = DESCUENTO_MUJERES;
                    break;  
                    
                    
                default:
                    System.out.println("NO ES VALIDO EL DATO INGRESADO, SELECCIONE NUMERO VALIDO");
                    
            }
            
            
            //dato cliente
            String Cliente="";
            System.out.println("Por Favor ingrese su Nombre para el registro");
            Cliente = scanner.nextLine();   
            
                                   
            // Mostrar tipos de entrada
            System.out.println("\nTipos de entrada disponibles:");
            System.out.println("1. VIP  " + PRECIO_VIP);
            System.out.println("2. PALCO " + PRECIO_PALCO);
            System.out.println("3. PLATEA ALTA " + PRECIO_PLATEA_ALTA);
            System.out.println("4. PLATEA BAJA " + PRECIO_PLATEA_BAJA);
            System.out.println("5. GALERIA " + PRECIO_GALERIA);
            System.out.println("Seleccione tipo de entrada (1-5):");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 
            
            String tipoEntrada = "";
            double precioBase = 0;
            
            switch (tipo) {
                case 1:
                    tipoEntrada = "VIP";
                    precioBase = PRECIO_VIP;
                    break;
                case 2:
                    tipoEntrada = "PALCO";
                    precioBase = PRECIO_PALCO;
                    break;
                case 3:
                    tipoEntrada = "PLATEA ALTA";
                    precioBase = PRECIO_PLATEA_ALTA;
                    break;
                case 4:
                    tipoEntrada = "PLATEA BAJA";
                    precioBase = PRECIO_PLATEA_BAJA;
                    break;  
                case 5:
                    tipoEntrada = "GALERIA";
                    precioBase = PRECIO_GALERIA;
                    break; 
                                    
                default:
                    System.out.println("NO ES VALIDO EL DATO INGRESADO, SELECCIONE NUMERO VALIDO");
                    
            }
            
             // Calcular precio con descuento
            double descuento = precioBase * factorDescuento;
            double precioFinal = precioBase - descuento;                   
            
            // Asignar número de asiento
            int numeroAsiento = totalAsientos - asientosDisponibles + 1;
            
            // Almacenar datos en las listas
            tiposEntrada.add(tipoEntrada);                    
            preciosOriginales.add(precioBase);
            preciosFinales.add(precioFinal);
            numerosAsientos.add(numeroAsiento);
            
            asientosDisponibles--;
            
            // Mostrar comprobante
            System.out.println("\n=== ENTRADA VENDIDA ===");
            System.out.println("Teatro: " + nombreTeatro);
            System.out.println("Cliente: " + Cliente);
            System.out.println("Asiento: " + numeroAsiento);
            System.out.println("Tipo: " + tipoEntrada);
            System.out.printf("Precio original: $ %.2f%n", precioBase);
            if (descuento > 0) {
            System.out.printf("Descuento aplicado: %.2f (%.0f%%)%n", descuento, factorDescuento * 100);
            }
            System.out.printf("Precio final: $ %.2f%n", precioFinal);
            System.out.println("=========================");
            
            // Preguntar si desea continuar
            System.out.println("\nAsientos disponibles: " + asientosDisponibles);
            if (asientosDisponibles > 0) {
                System.out.println("¿Desea comprar otra entrada? (si/no)");
                String continuar = scanner.nextLine();
                if (!continuar.equalsIgnoreCase("si")) {
                    break;
                }
            }
        }
        
        // Mostrar resumen de ventas
        System.out.println("\n===== BOLETA DE VENTA TEATRO MORO=====");
        System.out.println("\n=== RESUMEN DE VENTAS ===");
        System.out.println("Total de entradas vendidas: " + (totalAsientos - asientosDisponibles));
        
        double totalRecaudado = 0;
        double totalDescuentos = 0;
        
        for (int i = 0; i < preciosFinales.size(); i++) {
            totalRecaudado += preciosFinales.get(i);
            totalDescuentos += (preciosOriginales.get(i) - preciosFinales.get(i));
        }        
        
        
                    
        System.out.println("Total Precio Final: $ " + totalRecaudado);
        System.out.println("Total Descuentos: $ " + totalDescuentos);
           
        
       
        System.out.println("========GRACIAS POR SU VISITA==================="); 
        
        
        scanner.close();   
        
        
        
    }
        
           
       
    
}
