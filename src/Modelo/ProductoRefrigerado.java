/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USER
 */
public class ProductoRefrigerado extends Producto {
    private String codigoOrganismo;
    private String fechaEnvasado;
    private double tempMantenimiento;
    private String paisOrigen;

    public ProductoRefrigerado(String fechaCaducidad, String numeroLote, String codigoOrganismo, String fechaEnvasado, double tempMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechaEnvasado = fechaEnvasado;
        this.tempMantenimiento = tempMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    // Getters y setters
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }

    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(double tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
