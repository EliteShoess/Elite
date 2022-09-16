package com.elite.shoes.ShoesApplication.entidades;


import javax.persistence.*;

@Entity
@Table(name="Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    // Atributos
    @Column (name = "nombreEmpresa")
    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private int nit;



    // Nuevo Atributo

    //private MovimientoDinero movimientoDineros;
    //private Empleado empleado;

    // Constructor

    public Empresa() {
    }

    public Empresa(String nombreEmpresa, String direccion, String telefono, int nit) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        //this.movimientoDineros = movimientoDineros;
        //this.empleado = empleado;
    }

    // Getters and Setters




    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }


    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", nit=" + nit +
                '}';
    }
}
