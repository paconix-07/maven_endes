package com.miempresa.app;

/**
 * Clase que representa a un empleado de la empresa.
 * Guarda el nombre del empleado y los años que lleva trabajando.
 *
 * @author P.N.A
 * @version 1.0
 */
public class Employee {

    private String name;
    private int years;

    /**
     * Constructor de la clase Employee.
     *
     * @param name nombre del empleado
     * @param years años que lleva el empleado en la empresa
     */
    public Employee(String name, int years) {
        this.name = name;
        this.years = years;
    }

    /**
     * Devuelve el nombre del empleado.
     *
     * @return nombre del empleado
     */
    public String getName() {
        return name;
    }

    /**
     * Cambia el nombre del empleado.
     *
     * @param name nuevo nombre del empleado
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve los años que lleva el empleado en la empresa.
     *
     * @return años del empleado en la empresa
     */
    public int getYears() {
        return years;
    }

    /**
     * Cambia los años que lleva el empleado en la empresa.
     *
     * @param years nuevos años del empleado
     * @throws IllegalArgumentException si los años son negativos
     */
    public void setYears(int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Los años no pueden ser negativos.");
        }
        this.years = years;
    }
}