package sprint4;

import java.text.SimpleDateFormat;
import java.util.Date;

class Profesional extends Usuario {
    private String título;
    private Date fechaIngreso;

    public Profesional() {
    }

    public Profesional(String título, Date fechaIngreso, String nombre, Date fechaNacimiento, int run) {
        super(nombre, fechaNacimiento, run);
        this.título = título;
        this.fechaIngreso = fechaIngreso;
    }

    

    public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return super.toString() + ", Título: " + título + ", Fecha de ingreso: " + dateFormat.format(fechaIngreso);
    }
	
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Título: " + título + ", Fecha de ingreso: " + fechaIngreso);
    }
    
    
}

