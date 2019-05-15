/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author franc
 */
public class Pessoa {
    
    private String nome;
    
    public Pessoa(String n)
    {
        nome = n;
    }
    
    public void mostradados()
    {
        System.out.println("Nome: " + nome);
    }
    
     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
