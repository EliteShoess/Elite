package com.elite.shoes.ShoesApplication.controladores;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.servicios.serviciosEmpleados;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controlEmpleado {

    serviciosEmpleados servicesE;

    //constructor

    public controlEmpleado (serviciosEmpleados sevicesE){
        this.servicesE = sevicesE;

    }

    @GetMapping("/vista1")
    public String visualizar(){
        return "Primera vista de una web con Spring Boot";
    }
    @GetMapping("/vista2")
    public Empleado controlEmpleado(){
        Empleado empleado1 = new Empleado(9386676, "Carlos", "carll@gmail.com",
                "Compensar","cajero",null);
        return empleado1;
    }
    serviciosEmpleados services;

    //Constructor del controlador

    public controlEmpleado(){

        this.services = new serviciosEmpleados();
    }

    //Metodo para visualizar las listas de empleados de serviciosEmpleados
    @GetMapping("/verEmpleado")
    public List<Empleado> verEmpleado(){
        return this.services.getListaEmpleados();
    }


    //Esto es lo nuevo implementando las herramientas del JPA

}
