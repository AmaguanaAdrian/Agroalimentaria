/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class CongeladoPorAgua extends ProductoCongelado {
    private double salinidadAgua;

    public CongeladoPorAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, double salinidadAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.salinidadAgua = salinidadAgua;
    }

    // Getters y setters
    public double getSalinidadAgua() {
        return salinidadAgua;
    }

    public void setSalinidadAgua(double salinidadAgua) {
        this.salinidadAgua = salinidadAgua;
    }
}
