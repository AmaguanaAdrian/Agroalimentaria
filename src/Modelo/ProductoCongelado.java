/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double tempMantenimiento;

    public ProductoCongelado(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.tempMantenimiento = tempMantenimiento;
    }

    // Getters y setters
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(double tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }
}
