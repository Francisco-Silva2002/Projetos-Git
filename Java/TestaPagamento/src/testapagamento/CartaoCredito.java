/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapagamento;

/**
 *
 * @author franc
 */
public class CartaoCredito implements TipoPagamento{
    private final int diaFaturamento;
    private final double porcFat;
    
    public CartaoCredito()
    {
        diaFaturamento = 20;
        porcFat = 0.1;
    }
    
    
    @Override
    public int getDiasFaturamento() {
        return diaFaturamento;
    }

    @Override
    public double getPorcFinacPaga() {
        return porcFat;
    }
    
}
