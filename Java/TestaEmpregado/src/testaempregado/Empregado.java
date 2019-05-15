/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaempregado;

/**
 *
 * @author franc
 */
public abstract class Empregado {
    private String nome;
    private String sobrenome;
    private int cpf;
    
    public double vencimento(double sal)
    {
        return sal;
    }
    
}
