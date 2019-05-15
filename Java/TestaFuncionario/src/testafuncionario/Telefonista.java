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
public class Telefonista extends Funcionario{
    private int codigo;
    
    /*Construtor*/
    public Telefonista(String n, float s, int codi){
        super(n, s);
        codigo = codi;
    }
    
    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("\nCódigo: "+codigo);
    }
    
    /*Gets e Sets*/
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
}
