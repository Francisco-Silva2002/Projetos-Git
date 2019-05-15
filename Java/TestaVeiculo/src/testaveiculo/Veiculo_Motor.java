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
public class Veiculo_Motor extends Veiculo{
    private final int tam_motor;
    private final int n_placa;
    
    /*Contrutor*/
    public Veiculo_Motor(int v, String c, int t, int n){
        super(v,c);
        tam_motor = t;
        n_placa = n;
    }
    
    /**
     * @return the tam_motor
     */
    public int getTam_motor() {
        return tam_motor;
    }

    /**
     * @return the n_placa
     */
    public int getN_placa() {
        return n_placa;
    }
}
