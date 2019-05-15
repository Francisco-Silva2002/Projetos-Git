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
public class Comissionado extends Empregado{
    private final double totalVendas;
    private double comissao;
    
    public Comissionado(double tot, double c)
    {
        totalVendas = tot;
        comissao = c;
    }
    
    public void setComissao(float com)
    {
        comissao = com;
    }
    
    @Override
    public double vencimento(double sal)
    {
        sal = totalVendas * comissao;
        return sal;
    }
}
