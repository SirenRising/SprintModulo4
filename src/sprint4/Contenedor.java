package sprint4;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        asesorias = new ArrayList<>();
        capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(int run) {
        asesorias.removeIf(asesoria -> asesoria instanceof Usuario && ((Usuario) asesoria).getRun() == run);
    }

    public void listarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                System.out.println(usuario);
            }
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (tipo.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
                    System.out.println(usuario);
                } else if (tipo.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
                    System.out.println(usuario);
                } else if (tipo.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
                    System.out.println(usuario);
                }
            }
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion);
            int rutCliente = capacitacion.getRutCliente();
            for (Asesoria asesoria : asesorias) {
                if (asesoria instanceof Cliente && ((Cliente) asesoria).getRut() == rutCliente) {
                    System.out.println("Cliente asociado: " + asesoria);
                    break;
                }
            }
        }
    }
}
