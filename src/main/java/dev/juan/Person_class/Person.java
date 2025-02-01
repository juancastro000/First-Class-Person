package dev.juan.Person_class;

public class Person {

    String nombre;
    String apellido;
    String dni;
    int nacimiento;

    public Person (String nombre, String apellido, String dni, int nacimiento){

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        if (nacimiento > 1900 && nacimiento < 2026) {
            this.nacimiento = nacimiento;
        } else System.out.println("año invalido");
        
    }



}