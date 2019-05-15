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
public class Horista extends Empregado{
    private final double precoHora;
    private final int horasTrabalhadas;
    
    public Horista(double ph, int h)
    {
        precoHora = ph;
        horasTrabalhadas = h;
    }
    
    @Override
    public double vencimento(double sal)
    {
        sal = precoHora * horasTrabalhadas;
        return sal;
    }
    
    
}
