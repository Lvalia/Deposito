package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite almacenar los datos de una cuenta y realizar operaciones, como ingresar y retirar dinero.
 * Contiene información sobre el titular, el número de cuenta, el saldo y el tipo de interés.
 *
 * @author Luis Antonio Valía Martínez
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    /**
     * Número de cuenta bancaria.
     */
    private String cuenta;
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    /**
     * Tipo de interés aplicado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros.
     * Permite crear una cuenta con todos sus datos iniciales.
     *
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el nombre del titular.
     *
     * @return nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del titular.
     *
     * @param nombre nuevo nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return número de cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Modifica el número de cuenta.
     *
     * @param cuenta nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo disponible.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta.
     *
     * @param saldo nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés de la cuenta.
     *
     * @return tipo de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Modifica el tipo de interés de la cuenta.
     *
     * @param tipoInterés nuevo tipo de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el estado actual de la cuenta (saldo).
     *
     * @return saldo actual de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     *
     * @param cantidad cantidad que se desea ingresar.
     * @throws Exception si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de dinero de la cuenta.
     *
     * @param cantidad cantidad que se desea retirar.
     * @throws Exception si la cantidad es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
