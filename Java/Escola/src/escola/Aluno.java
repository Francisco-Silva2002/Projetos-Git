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
public class Aluno extends Pessoa{
    private final int ra;
    
    public Aluno(String n, int ra)
    {
        super(n);
        this.ra = ra;
    }
    
    @Override
    public void mostradados()
    {
        System.out.println("Alunos");
        System.out.println("=====================");
        System.out.println("Nome: " + super.getNome());
        System.out.println("RA: " + ra);
    }
}
