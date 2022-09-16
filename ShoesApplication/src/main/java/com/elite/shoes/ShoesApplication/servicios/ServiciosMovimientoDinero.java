package com.elite.shoes.ShoesApplication.servicios;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.entidades.MovimientoDinero;

public class ServiciosMovimientoDinero {
    MovimientoDinero compra1;

    /*serviciosEmpleados empl1 = new serviciosEmpleados();

    //Constructor
    public ServiciosMovimientoDinero(){
        Empleado prof1 = this.empl1.empleado1;
        this.compra1 = new MovimientoDinero("01-01-2022",  prof1, "Camilo",
                100000.0, "egreso");
    }

     */
    public MovimientoDinero getMovimientoDinero(){
        return compra1;
    }
}
