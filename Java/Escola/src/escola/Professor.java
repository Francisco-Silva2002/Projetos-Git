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
public class Professor extends Pessoa{
    private final int matricula;
    private final float salario;
    
    public Professor(String n, int mat, float sal)
    {
        super(n);
        matricula = mat;
        salario = sal;
    }
    
    @Override
    public void mostradados()
    {
        System.out.println("Professor");
        System.out.println("=====================");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Salário: R$%.2f", salario);
    }
}
