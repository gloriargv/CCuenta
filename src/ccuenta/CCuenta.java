/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ccuenta;

/**
 *
 * @author masina
 */
public class CCuenta {

       /**
 * Esta clase recoge constructores y métodos para controlar cuentas corrientes
 * @author gloria ruiz gomez-vazquez
 * @version 2023
 */
    
    /**
     * Atributos encapsulados de la clase CCuenta
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * constructor sin argumentos
     */
    public CCuenta ()
    {
    }
 /**
     * constructor con parámetros que recoge propiedades de nombre, cuenta, saldo y tipoInteres
     * @param nom   recoge el nombre
     * @param cue   recoge el numero de cuenta
     * @param sal   recoge el saldo
     * @param tipo  recoge el tipo de interes
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }

/**
     * Método para asignar el nombre del titular de la cuenta
     * @param nom nombre del titular
     */
    public void setNombre(String nom)
    {
        nombre=nom;
    }
    // Método que me devuelve el nombre del titular
    public String getNombre()
    {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
     public double getEstado ()
    {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }



    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getEstado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    // Método que me devuelve el número de cuenta
    public String getCuenta ()
    {
        return cuenta;
    }
    
}
