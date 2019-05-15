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
public class Gerente extends Funcionario{
    private String username;
    private String senha;
    
    /*Construtor*/
    public Gerente(String n, float s, String user, String senha){
        super(n,s);
        username = user;
        this.senha = senha;
    }
    
    @Override
    public void mostraDados(){
        super.mostraDados();
        System.out.println("\nUsername:"+username);
        System.out.println("Senha:"+senha);
    }
    
    @Override
    public void calculaBonificacao(){
        float a = super.getSalario();
        a *= 1.3;
        super.setSalario(a);
    }
    
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
