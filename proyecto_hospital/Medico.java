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
public class Medico {
    private int codigo;
    private String nombre;
    private String apellido;
    private String telefono;
    private Especialidad especialidad;
    private ArrayList<Paciente> pacientesAtendidos;

    public Medico(int codigo, String nombre, String apellido, String telefono, Especialidad especialidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.especialidad = especialidad;
        this.pacientesAtendidos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Paciente> getPacientesAtendidos() {
        return pacientesAtendidos;
    }

    public void agregarPaciente(Paciente paciente) {
        pacientesAtendidos.add(paciente);
    }

    public void eliminarPaciente(Paciente paciente) {
        pacientesAtendidos.remove(paciente);
    }

    public void atenderPaciente(Paciente paciente) {
        // Implementación del método para atender al paciente
    }

    @Override
    public String toString() {
        return "Medico{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad + ", pacientesAtendidos=" + pacientesAtendidos + '}';
    }
}
