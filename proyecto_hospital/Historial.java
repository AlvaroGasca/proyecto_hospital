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
public class Historial {
    private Paciente paciente;
    private Medico medico;
    private ArrayList<Ingreso> ingresos;

    public Historial(Paciente paciente, Medico medico) {
        this.paciente = paciente;
        this.medico = medico;
        ingresos = new ArrayList<>();
    }

    public void agregarIngreso(Ingreso ingreso) {
        ingresos.add(ingreso);
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString() {
        return "Historial{" + "paciente=" + paciente + ", medico=" + medico + ", ingresos=" + ingresos + '}';
    }
}
