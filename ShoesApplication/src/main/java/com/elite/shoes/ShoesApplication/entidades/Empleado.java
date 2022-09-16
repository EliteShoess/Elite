package com.elite.shoes.ShoesApplication.entidades;

import javax.persistence.*;

@Entity
@Table(name="Empleado")

public class Empleado {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name="nombreEmpleado")
    private String nombreEmpleado;
    @Column(name="correo")
    private String correo;
    @Column(name="perteneceALaEmpresa")
    private String perteneceALaEmpresa;
    @Column(name="rolEmpleado")
    private String rolEmpleado;

    //Nuevo Atributo
    @Transient
    private Empresa empresa;

    //private MovimientoDinero movimientoDineros;

    //Constructor
    public Empleado(int i, String carlos, String s, String compensar, String cajero, Object o){

    }

    public Empleado(String nombreEmpleado, String correo, String perteneceALaEmpresa,
                    String rolEmpleado, Empresa empresa) {

        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        this.perteneceALaEmpresa = perteneceALaEmpresa;
        this.rolEmpleado = rolEmpleado;
        this.empresa = empresa;
        //this.movimientoDineros = movimientoDineros;
    }

    //Getters and Setters





    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPerteneceALaEmpresa() {
        return perteneceALaEmpresa;
    }

    public void setPerteneceALaEmpresa(String perteneceALaEmpresa) {
        this.perteneceALaEmpresa = perteneceALaEmpresa;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }



    @Override
    public String toString() {
        return "Empleado{" +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", correo='" + correo + '\'' +
                ", perteneceALaEmpresa='" + perteneceALaEmpresa + '\'' +
                ", rolEmpleado='" + rolEmpleado + '\'' +
                ", Empresa= " + empresa +
                '}';
    }
}