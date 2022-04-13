import java.util.*;

public class Paciente {

    String paciente;
    Medico medico;


    public Paciente(String paciente, int medico) {
        this.paciente = paciente;
        this.medico = medico;
    }


    public Paciente() {}

    public void setNome(String paciente) {
        this.paciente = paciente;
    }

    public String getNome() {
        return paciente;
    }


    public void setMedico(String Medico) {
        this.medico = medico;
    }


    public void exibirRelatorio() {
        System.out.println("Paciente: ");
        System.out.println("Médico: " );
    }
}