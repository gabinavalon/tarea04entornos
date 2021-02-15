/**
 * Esta clase cuenta con los métodos para crear Cuentas, con los datos de estas. 
 * También inlcuye métodos para retirar e ingresar dinero
 * @author Gabriel 
 * @version 1.0
*/

package cuentas;
public class CCuenta {

/** 
 * Atributos de los objetos:  
 * nombre, el nombre del propietario
 * cuenta, el identificador de la cuenta
 * saldo, el saldo de la cuenta que podrá alterarse con los métodos
 * tipoInt, el tipo de cuenta 
 * */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInt;

/** Getters y Setters */
    
	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

    
	String getCuenta() {
		return cuenta;
	}

	void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
    double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	double getTipoInt() {
		return tipoInt;
	}

	void setTipoInt(double tipoInt) {
		this.tipoInt = tipoInt;
	}
/** Constructores del objeto CCuenta
 * nom es el nombre del propietario
 * cue la identificación de la cuenta
 * sal es el salario de la cuenta
 * tipo no se especifica
 */
	public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/** 
 * Método que devuelve  el saldo actual de la cuenta
 * @return Saldo actual de la cuenta
 **/ 
    public double estado()
    {
        return getSaldo();
    }
/**
 *  Método para ingresar una cantidad en la cuenta
 *  @param cantidad La cifra que queremos añadir a la cuenta
 *  @return void. suma la cantidad introducida al saldo original
 *  @exception Cantidad introducida menor que 0
 *  @throws Exception
 * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**	
     * Método para retirar una cantidad de la cuenta
     * @return void. Resta a la cuenta la cantidad introducida
     * @param cantidad La cifra que se quiere retirar de la cuenta
     * @exception Canitad es menor de cero o cantidad es superior al saldo de la cuenta
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
