/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_hospital;

import java.util.ArrayList;

/**
 *
 * @author alvarogasca
 */
public class Hospital {
    private String nombre;
    private ArrayList<Cama> camasDisponibles;
    private ArrayList<Cama> camasOcupadas;
    private ArrayList<Medico> medicos;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Ingreso> ingresos;

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.camasDisponibles = new ArrayList<>();
        this.camasOcupadas = new ArrayList<>();
        this.medicos = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.ingresos = new ArrayList<>();
    }

    public void agregarCama(Cama cama) {
        camasDisponibles.add(cama);
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
        Paciente paciente = ingreso.getPaciente();
        Cama cama = ingreso.getCama();
        paciente.setEstado("Hospitalizado");
        cama.setDisponible(false);
        camasDisponibles.remove(cama);
        camasOcupadas.add(cama);
    }

    public ArrayList<Cama> getCamasDisponibles() {
        return camasDisponibles;
    }

    public ArrayList<Cama> getCamasOcupadas() {
        return camasOcupadas;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public void darAlta(Paciente paciente) {
        for (Ingreso ingreso : ingresos) {
            if (ingreso.getPaciente().equals(paciente)) {
                ingreso.getCama().setDisponible(true);
                camasOcupadas.remove(ingreso.getCama());
                camasDisponibles.add(ingreso.getCama());
                ingresos.remove(ingreso);
                paciente.setEstado("Alta");
                break;
            }
        }
    }
    
    public Paciente buscarPaciente(String nombre) {
        for (Ingreso ingreso : ingresos) {
            if (ingreso.getPaciente().getNombre().equals(nombre)) {
                return ingreso.getPaciente();
            }
        }
        return null;
    }
    
    public Medico buscarMedico(String nombre) {
        for (Medico medico : medicos) {
            if (medico.getNombre().equals(nombre)) {
                return medico;
            }
        }
        return null;
    }
    
    public Cama buscarCamas(Paciente paciente) {
        for (Cama cama : camasOcupadas) {
            if (cama.getPaciente() != null && cama.getPaciente().equals(paciente)) {
                return cama;
            }
        }
        return null; // Si no se encuentra al paciente, se devuelve null
    }
    
    public ArrayList<Cama> buscarCamasDisponibles() {
        ArrayList<Cama> camasDisponibles = new ArrayList<>();
        for (Cama cama : camasDisponibles) {
            if (cama.getPaciente() == null) {
                camasDisponibles.add(cama);
            }
        }
        return camasDisponibles;
    }
}
