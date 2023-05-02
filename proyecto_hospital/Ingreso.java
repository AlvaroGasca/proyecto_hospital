/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_hospital;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author alvarogasca
 */
public class Ingreso {
    private int numeroIngreso;
    private Date fechaIngreso;
    private Date fechaAlta;
    private Paciente paciente;
    private Medico medico;
    private Cama cama;

    public Ingreso(int numeroIngreso, Date fechaIngreso, Paciente paciente, Medico medico, Cama cama) {
        this.numeroIngreso = numeroIngreso;
        this.fechaIngreso = fechaIngreso;
        this.paciente = paciente;
        this.medico = medico;
        this.cama = cama;
    }

    // Getters y setters
    public int getNumeroIngreso() {
        return numeroIngreso;
    }

    public void setNumeroIngreso(int numeroIngreso) {
        this.numeroIngreso = numeroIngreso;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Cama getCama() {
        return cama;
    }

    public void setCama(Cama cama) {
        this.cama = cama;
    }

    // Otros métodos
    public void darAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean estaEnCurso() {
        return fechaAlta == null;
    }

    public int duracion() {
        if (fechaAlta == null) {
            throw new IllegalStateException("El ingreso no ha finalizado todavía.");
        }
        long diff = fechaAlta.getTime() - fechaIngreso.getTime();
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public String toString() {
        return "Ingreso{" + "numeroIngreso=" + numeroIngreso + ", fechaIngreso=" + fechaIngreso + ", fechaAlta=" + fechaAlta + ", paciente=" + paciente + ", medico=" + medico + ", cama=" + cama + '}';
    }
}
