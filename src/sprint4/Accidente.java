package sprint4;

import java.text.SimpleDateFormat;
import java.util.Date;

class Accidente {
    private int identificadorAccidente;
    private int rutCliente;
    private Date día;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;

    public Accidente() {
    }

    public Accidente(int identificadorAccidente, int rutCliente, Date día, String hora, String lugar, String origen, String consecuencias) {
        this.identificadorAccidente = identificadorAccidente;
        this.rutCliente = rutCliente;
        this.día = día;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
    }



    public int getIdentificadorAccidente() {
		return identificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		this.identificadorAccidente = identificadorAccidente;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public Date getDía() {
		return día;
	}

	public void setDía(Date día) {
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}

	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Identificador: " + identificadorAccidente + ", RUT Cliente: " + rutCliente + ", Día: " + dateFormat.format(día) + ", Hora: " + hora + ", Lugar: " + lugar;
    }
}