import java.util.*;
/**
 * @titulo EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED.
 * @author JIMENA ROSERO SILVA 23323885E
 * @version 1.0
 */


public class EmpleadoED_23323885E {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
 /**
     * Constructor con dos parámetros.
     * 
     * 
     * @param nombreCompleto nombre completo en mayúsculas.
     * @param dni documento nacional de identidas con letra y sin espacios.
     */   
    public EmpleadoED_23323885E(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
  /**
     * 
     * @param horasExtra numero de horas extra dedicadas redondeando a la baja (entero). 
     * @return devuelve el salario bruto mensual en euros con dos decimales.
     */
    
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double)Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }
 // esta clase no se comentará
    public static void main(String[] args) {
        EmpleadoED_23323885E emp = new EmpleadoED_23323885E("JIMENA ROSERO", "23323885E");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra) + " euros, al hacer " + horasExtra + " horas extra.");
        
    }
    
}
