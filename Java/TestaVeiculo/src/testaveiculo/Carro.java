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
public class Carro extends Veiculo_Motor{
    private final int n_portas;
    
    /**
     * @return the n_portas
     */
    public int getN_portas() {
        return n_portas;
    }
    
    public Carro(int v, String c, int n){
        super(v,c,0,0);
        n_portas = n;
    }
    
    public void ligaAr(){
        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
    }
}
