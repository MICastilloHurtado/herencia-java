
package com.mycompany.herencia;

public class Empleado extends Persona {
    
    int dni;
    String empresa;

    public Empleado() {
    }

    public Empleado(int dni, String empresa, String nombre, String apellido, int id) {
        super(nombre, apellido, id);
        this.dni = dni;
        this.empresa = empresa;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    
    
}
