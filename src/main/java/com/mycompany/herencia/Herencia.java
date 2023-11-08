
package com.mycompany.herencia;

public class Herencia {

    public static void main(String[] args) {
        
        Empleado emple1 = new Empleado();
        
        emple1.nombre = "juan";
        emple1.apellido = "perez";
        emple1.id = 1;
        emple1.dni= 1124;
        emple1.empresa = "Nutresa";
        
        System.out.println("Informacion de empleado");
        System.out.println(emple1.getNombre());
        System.out.println(emple1.getApellido());
        System.out.println(emple1.getId());
        System.out.println(emple1.getDni());
        System.out.println(emple1.getEmpresa());
    }
}
