package sprint4;

import java.text.SimpleDateFormat;
import java.util.Date;

class VisitaTerreno {
    private int identificadorVisita;
    private int rutCliente;
    private Date día;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaTerreno() {
    }

    public VisitaTerreno(int identificadorVisita, int rutCliente, Date día, String hora, String lugar, String comentarios) {
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        this.día = día;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    public int getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(int identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
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

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Identificador: " + identificadorVisita + ", RUT Cliente: " + rutCliente + ", Día: " + dateFormat.format(día) + ", Hora: " + hora + ", Lugar: " + lugar;
    }
}