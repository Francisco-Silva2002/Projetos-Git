/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaimovel;

/**
 *
 * @author franc
 */
public class TestaImovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Novo n1 = new Novo(222,"Rua LALALA",2000f,215f);
        Usado u1 = new Usado(333,"Rua LAUAAAAAAAAAA",2500f,350f);
        
        n1.Imprime();
        System.out.println(n1.getPreco());
        n1.novoValor();
        System.out.println(n1.getPreco());
        
        u1.Imprime();
        u1.novoValor();
        u1.Imprime();
    }
    
}
