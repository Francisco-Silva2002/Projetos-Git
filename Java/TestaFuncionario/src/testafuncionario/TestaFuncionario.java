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
public class TestaFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente ger1 = new Gerente("Francisco",1500f,"franc","1345");
        Telefonista tel1 = new Telefonista("Francisco",2000f,6789);
        Secretarias sec1 = new Secretarias("Francisca",2500f,5);
        
        ger1.mostraDados();
        System.out.println("");
        tel1.mostraDados();
        System.out.println("");
        sec1.mostraDados();
        
        System.out.println("\nBonificação de 10%\n");
        ger1.calculaBonificacao();
        tel1.calculaBonificacao();
        sec1.calculaBonificacao();
        
        ger1.mostraDados();
        System.out.println("");
        tel1.mostraDados();
        System.out.println("");
        sec1.mostraDados();
    }
    
}
