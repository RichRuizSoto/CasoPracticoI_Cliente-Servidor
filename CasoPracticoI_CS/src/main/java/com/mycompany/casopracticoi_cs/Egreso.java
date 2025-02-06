package com.mycompany.casopracticoi_cs;

import javax.swing.JOptionPane;

public class Egreso extends Transaccion {

    double deducciones;
    double gastosAdicionales;

    public Egreso(double monto, String descripcion, String fecha) {
        super(monto, descripcion, fecha);
    }

    @Override
    public String toString() {
        return "Egreso{" + "deducciones=" + deducciones + ", gastosAdicionales=" + gastosAdicionales + '}';
    }

    @Override
    public void procesarTransaccion(double monto, String descripcion, String fecha) {

        System.out.println("Monto: " + monto + "\nDescripcion: " + descripcion + "\nFecha: " + fecha);

        String consulta = JOptionPane.showInputDialog("Deducciones o Gastos adicionales ? \n1.Si 2.No");

        if (consulta.equals(1)) {
            deducionesOGastosAdicionales();
        }
    }

    public void deducionesOGastosAdicionales() {
        deducciones = Double.parseDouble(JOptionPane.showInputDialog("Deducciones: "));
        gastosAdicionales = Double.parseDouble(JOptionPane.showInputDialog("Gastos Adicionales: "));

        System.out.println("Deducciones: "+deducciones+"\nGastos Adicionales: "+gastosAdicionales);
    }

}
