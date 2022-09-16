package com.elite.shoes.ShoesApplication.servicios;

import com.elite.shoes.ShoesApplication.entidades.Empleado;
import com.elite.shoes.ShoesApplication.repositorios.repositorioEmpleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class serviciosEmpleados {

    /*
    //Atributos de otra clase = Objetos
    Empleado empleado1;
    Empleado empleado2;
    List<Empleado> listaEmpleados;

    public serviciosEmpleados() {
        this.empleado1 = new Empleado(9386676, "Carlos", "carll@gmail.com",
                "Compensar", "cajero", null);

        this.empleado2 = new Empleado(222322, "Camilo", "cami@gmail.com",
                "Cafam", "cajero", null);

        this.listaEmpleados = new ArrayList<>();

        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);

    }
    //Metodo para obtener los datos de la lista Empleados


     */
    //Utilizamos el repositorio

    private repositorioEmpleado repositorioEm;

    //constructor
    public serviciosEmpleados(repositorioEmpleado repositorioEm){
        this.repositorioEm = repositorioEm;
    }

    //Metodo para visualizar a partir del GET

    public List<Empleado> getListaEmpleados() {
        return this.repositorioEm.findAll();
    }
}