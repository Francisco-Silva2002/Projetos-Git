/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaveiculo;

/**
 *
 * @author franc
 */
public class Bicicleta extends Veiculo{
    /*Contrutor*/
    public Bicicleta(int v, String c){
        super(v,c);
    }
    
    public void apertaCampainha(){
        System.out.println("PLIIIIIIIIIIIIIIIIIIIIIIIIIM");
    }
}
