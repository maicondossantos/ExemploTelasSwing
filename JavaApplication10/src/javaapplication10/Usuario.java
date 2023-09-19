/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Professor
 */
public class Usuario {
    
    private String nome;
    private String sobrenome;
    private Smartphone smart;
    
    public Usuario(){
        this.nome = "";
        this.sobrenome = "";
    }
    public Usuario(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.smart = null;
    }
    public String getNome(){
        return this.nome;
    }    
    public String getSobrenome(){
        return this.sobrenome;
    }    
    
    public void setSmart(Smartphone smart){
        this.smart = smart;
    }
        
    public Smartphone getSmart(Smartphone smart){
        return this.smart;
    }
    
    public String todosOsDados(){
        return "Nome e Sobrenome: " + this.nome + " " + this.sobrenome + " Smartphone: " + this.smart.exibeSmartphone();
    }
    
}
