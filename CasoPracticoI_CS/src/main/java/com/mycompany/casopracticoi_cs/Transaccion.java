
package com.mycompany.casopracticoi_cs;

import javax.swing.JOptionPane;

public abstract class Transaccion {
    
    double monto;
    String descripcion;
    String fecha;

    public Transaccion(double monto, String descripcion, String fecha) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    
    public void calcularImpuesto(double monto) {
        System.out.println("Monto del impuesto: " + (100 / monto) * 13.5);
    }
    
    public void procesarTransaccion(double monto, String descripcion, String fecha) {
        System.out.println("Monto: "+monto+"\nDescripcion: "+descripcion+"\nFecha: "+fecha);
    }
    
    
}
