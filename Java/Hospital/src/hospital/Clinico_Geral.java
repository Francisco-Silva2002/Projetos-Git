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
public class Clinico_Geral extends Medico{
    private boolean atendeEmCasa;
    /**
     * @return the atendeEmCasa
     */
    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    /**
     * @param atendeEmCasa the atendeEmCasa to set
     */
    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
    
    public void receitar(){
        System.out.println("Dipironaaaaaaaaa");
    }
}
