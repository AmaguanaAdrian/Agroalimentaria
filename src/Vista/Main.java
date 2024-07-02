/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.*;
/**
 *
 * @author USER
 */

public class Main {
    public static void main(String[] args) {
        ProductoFresco productoFresco = new ProductoFresco("2023-07-30", "12745", "2020-06-30", "España");
        ProductoRefrigerado productoRefrigerado = new ProductoRefrigerado("2023-07-30", "67890", "ORG123", "2020-06-30", 4.0, "Francia");
        CongeladoPorAire congeladoPorAire = new CongeladoPorAire("2024-12-30", "11223", "2024-06-30", "Noruega", -18.0, 78.0, 21.0, 0.04, 0.96);

        System.out.println("Producto Fresco:");
        System.out.println("Fecha de Caducidad: " + productoFresco.getFechaCaducidad());
        System.out.println("Número de Lote: " + productoFresco.getNumeroLote());
        System.out.println("Fecha de Envasado: " + productoFresco.getFechaEnvasado());
        System.out.println("País de Origen: " + productoFresco.getPaisOrigen());

        System.out.println("\nProducto Refrigerado:");
        System.out.println("Fecha de Caducidad: " + productoRefrigerado.getFechaCaducidad());
        System.out.println("Número de Lote: " + productoRefrigerado.getNumeroLote());
        System.out.println("Código del Organismo: " + productoRefrigerado.getCodigoOrganismo());
        System.out.println("Fecha de Envasado: " + productoRefrigerado.getFechaEnvasado());
        System.out.println("Temperatura de Mantenimiento: " + productoRefrigerado.getTempMantenimiento());
        System.out.println("País de Origen: " + productoRefrigerado.getPaisOrigen());

        System.out.println("\nProducto Congelado por Aire:");
        System.out.println("Fecha de Caducidad: " + congeladoPorAire.getFechaCaducidad());
        System.out.println("Número de Lote: " + congeladoPorAire.getNumeroLote());
        System.out.println("Fecha de Envasado: " + congeladoPorAire.getFechaEnvasado());
        System.out.println("País de Origen: " + congeladoPorAire.getPaisOrigen());
        
        System.out.println("\nTemperatura de Mantenimiento: " + congeladoPorAire.getTempMantenimiento());
        System.out.println("Porcentaje de Nitrógeno: " + congeladoPorAire.getPorcentajeNitrogeno());
        System.out.println("Porcentaje de Oxígeno: " + congeladoPorAire.getPorcentajeOxigeno());
        System.out.println("Porcentaje de Dióxido de Carbono: " + congeladoPorAire.getPorcentajeDioxidoCarbono());
        System.out.println("Porcentaje de Vapor de Agua: " + congeladoPorAire.getPorcentajeVaporAgua());
    }
}


