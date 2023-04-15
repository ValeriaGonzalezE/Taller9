package poo;
import java.util.*;
public class Uso_Empleado {

	public static void main(String[] args) {
		
		Empleado [] misEmpleado = new Empleado[4];
		
		misEmpleado[0]=new Empleado ("Paco Gomez  ", 85000, 1990, 12, 17);
		
		misEmpleado[1]=new Empleado ("Ana lopez  ", 95000, 1995, 06, 02);
		
		misEmpleado[2]=new Empleado ("Maria Martin  ", 105000, 2002, 03, 15);
		
		misEmpleado[3]=new Empleado ("Antonio Fernandez  ");
		
		for(Empleado e: misEmpleado) {
			
			e.subeSueldo(5);
			
		}
		
        for(Empleado e: misEmpleado) {
			
			System.out.println(" Nombre: " + e.dameNombre() + " Sueldo: " + e.dameSueldo() + " Fecha de Alta: " + e.dameFechaContrato());
			
		}
	}
}

class Empleado{
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		
		sueldo= sue;
		
		GregorianCalendar calendario =new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato= calendario.getTime();
		
	}
	
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	public String dameNombre() {
		return nombre;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public Date dameFechaContrato() {
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
