package com.elite.shoes.ShoesApplication.controladores;

import com.elite.shoes.ShoesApplication.entidades.MovimientoDinero;
import com.elite.shoes.ShoesApplication.servicios.ServiciosMovimientoDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlMovimientoDinero {

    ServiciosMovimientoDinero movimiento1;

    //Constructor
    public controlMovimientoDinero(){
        this.movimiento1 = new ServiciosMovimientoDinero();
    }
    //Metodo
    @GetMapping("VerMovimientos")
    public MovimientoDinero controlMovimientoDinero(){
        return this.movimiento1.getMovimientoDinero();
    }
}
