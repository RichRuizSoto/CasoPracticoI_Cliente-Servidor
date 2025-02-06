package com.mycompany.casopracticoi_cs;

import javax.swing.JOptionPane;

public class CasoPracticoI_CS {

    public static void main(String[] args) {

        boolean salir = true;

        int monto;
        String descripcion;
        String fecha;

        while (salir) {
            String pregunta = JOptionPane.showInputDialog("1. Ingreso\n2.Egreso\n\nSalir");

            if (!pregunta.equals("1") || pregunta.equals("2")) {
                salir = false;
            } else {
                monto = Integer.parseInt(JOptionPane.showInputDialog("Monto: "));
                descripcion = JOptionPane.showInputDialog("Descripcion: ");
                fecha = JOptionPane.showInputDialog("Fecha: ");

                if (pregunta.equals("1")) {
                    Transaccion ingreso = new Ingreso(monto, descripcion, fecha);
                    ingreso.calcularImpuesto(monto);
                    ingreso.procesarTransaccion(monto, descripcion, fecha);
                    

                } else {
                    Transaccion egreso = new Egreso(monto, descripcion, fecha);
                    egreso.calcularImpuesto(monto);
                    egreso.procesarTransaccion(monto, descripcion, fecha);

                }
            }

        }
    }
}
