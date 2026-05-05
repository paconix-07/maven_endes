package com.miempresa.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar una lista de empleados.
 * Permite añadir empleados y mostrar todos los empleados registrados.
 *
 * @author PNA
 * @version 1.0
 */
public class EmployeeManager {

    private List<Employee> employees;

    /**
     * Constructor de la clase EmployeeManager.
     * Crea una lista vacía de empleados.
     */
    public EmployeeManager() {
        employees = new ArrayList<Employee>();
    }

    /**
     * Añade un nuevo empleado a la lista.
     *
     * @param name nombre del empleado
     * @param years años que lleva el empleado en la empresa
     * @throws IllegalArgumentException si los años son negativos
     */
    public void addEmployee(String name, int years) {
        if (years < 0) {
            throw new IllegalArgumentException("Los años no pueden ser negativos.");
        }

        Employee employee = new Employee(name, years);
        employees.add(employee);

        System.out.println(name + " added to the system.");
    }

    /**
     * Muestra por pantalla todos los empleados registrados.
     */
    public void printEmployees() {
        System.out.println("List of employees:");

        for (Employee employee : employees) {
            System.out.println(employee.getName() + ", Years in company: " + employee.getYears());
        }
    }

    /**
     * Devuelve la lista de empleados.
     *
     * @return lista de empleados registrados
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * Método principal del programa.
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee("John Doe", 5);
        manager.addEmployee("Jane Smith", 2);

        manager.printEmployees();
    }
}