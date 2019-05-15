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
public class Assalariado extends Empregado{
    private double salario;
    
    @Override
    public double vencimento(double sal)
    {
        salario = sal;
        return sal;
    }
}
