package sprint4;

class Capacitacion {
    private int identificador;
    private int rutCliente;
    private String día;
    private String hora;
    private String lugar;
    private String duración;
    private int cantidadAsistentes;

    public Capacitacion() {
    }

    public Capacitacion(int identificador, int rutCliente, String día, String hora, String lugar, String duración, int cantidadAsistentes) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.día = día;
        this.hora = hora;
        this.lugar = lugar;
        this.duración = duración;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDía() {
		return día;
	}

	public void setDía(String día) {
		this.día = día;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	@Override
    public String toString() {
        return "Identificador: " + identificador + ", RUT Cliente: " + rutCliente + ", Día: " + día + ", Hora: " + hora + ", Lugar: " + lugar;
    }
	
    public String mostrarDetalle() {
        return "La capacitación será en " + lugar + " a las " + hora + " del día " + día + ", y durará " + duración + " minutos";
    }
    
    
}