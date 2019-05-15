/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author franc
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Medico m1 = new Medico();
        Clinico_Geral cg1 = new Clinico_Geral();
        Cirurgiao c1 = new Cirurgiao();
        
        m1.setTrabalhaNoHospital(true);
        m1.tratarPaciente();
        
        cg1.setTrabalhaNoHospital(false);
        cg1.setAtendeEmCasa(true);
        cg1.setAtendeEmCasa(true);
        cg1.tratarPaciente();
        cg1.receitar();
        
        c1.setTrabalhaNoHospital(true);
        c1.tratarPaciente();
        c1.fazerIncisao();
        
    }
    
}
