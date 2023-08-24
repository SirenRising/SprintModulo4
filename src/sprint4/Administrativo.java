package sprint4;

import java.util.Date;

class Administrativo extends Usuario {
    private String área;
    private String experienciaPrevia;

    public Administrativo() {
    }

    public Administrativo(String área, String experienciaPrevia, String nombre, Date fechaNacimiento, int run) {
        super(nombre, fechaNacimiento, run);
        this.área = área;
        this.experienciaPrevia = experienciaPrevia;
    }

    public String getÁrea() {
		return área;
	}

	public void setÁrea(String área) {
		this.área = área;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	@Override
    public String toString() {
        return super.toString() + ", Área: " + área + ", Experiencia previa: " + experienciaPrevia;
    }
	
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Área: " + área + ", Experiencia previa: " + experienciaPrevia);
    }
    
}