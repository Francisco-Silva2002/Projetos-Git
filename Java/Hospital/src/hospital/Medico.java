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
public class Medico {
    private boolean trabalhaNoHospital;
    
     /**
     * @return the trabalhaNoHospital
     */
    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    /**
     * @param trabalhaNoHospital the trabalhaNoHospital to set
     */
    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
    
    public void tratarPaciente(){
        if(trabalhaNoHospital){
            System.out.println("O que temos aqui");
        } else System.out.println("Formado em Gray's Anatomy.......");
    }
}
