/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionario;

/**
 *
 * @author franc
 */
public class Secretarias extends Funcionario{
    private int ramal;
    
    /*Construtor*/
    public Secretarias(String n, float s, int r){
        super(n, s);
        ramal = r;
    }
    
    /*Gets e Sets*/
    public int getRamal(){
        return ramal;
    }
    public void setRamal(int ramal){
        this.ramal = ramal;
    }
    
    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("\nNúmero do Ramal: "+ramal);
    }
}
