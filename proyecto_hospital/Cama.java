/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_hospital;

/**
 *
 * @author alvarogasca
 */
public class Cama {
    private int numeroCama;
    private boolean disponible;
    private Paciente paciente;
    
    public Cama(int numeroCama) {
        this.numeroCama = numeroCama;
        this.disponible = true;
        this.paciente = null;
    }
    
    public int getNumeroCama() {
        return this.numeroCama;
    }
    
    public boolean isDisponible() {
        return this.disponible;
    }
    
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void asignarPaciente(Paciente paciente) {
        this.paciente = paciente;
        this.disponible = false;
    }
    
    public void liberarCama() {
        this.paciente = null;
        this.disponible = true;
    }
}
