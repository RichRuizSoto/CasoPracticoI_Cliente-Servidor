
package com.mycompany.casopracticoi_cs;

public class Ingreso extends Transaccion{

    public Ingreso(double monto, String descripcion, String fecha) {
        super(monto, descripcion, fecha);
    }

        @Override
        public void calcularImpuesto(double monto) {
        System.out.println("Monto del impuesto: " + (100 / monto) * 10);
    }
    
}
