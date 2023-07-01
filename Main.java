/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.contabancaria;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Conta grana = new Conta();
        
        grana.setAgencia(0215);
        grana.setLimite(500);
        grana.setSenha(9875);
        grana.setNumero(12345678);
        grana.setSaldo(1590.35);
        //grana.setLimiteDisponivel(100);
        
        System.out.print(grana.getSaldo());
    }
}
