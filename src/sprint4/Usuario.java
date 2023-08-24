package sprint4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
    private String nombre;
    private Date fechaNacimiento;
    private int run;

    public Usuario() {
    }

    public Usuario(String nombre, Date fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }
 
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	
	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Nombre: " + nombre + ", Fecha de nacimiento: " + dateFormat.format(fechaNacimiento) + ", RUN: " + run;
    }
	
	 public void mostrarEdad() {
	        int edad = calcularEdad();
	        System.out.println("El usuario tiene " + edad + " años.");
	    }

	    public void analizarUsuario() {
	        System.out.println("Nombre: " + nombre + ", RUN: " + run);
	    }
	    
	    private int calcularEdad() {
	        Date fechaActual = new Date();
	        long diferenciaEnMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
	        long diferenciaEnAnios = diferenciaEnMilisegundos / (1000L * 60 * 60 * 24 * 365); // Aproximado
	        return (int) diferenciaEnAnios;
	    }
}
