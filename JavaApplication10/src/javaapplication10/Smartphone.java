/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication10;

/**
 *
 * @author Maicon
 */
public class Smartphone {
    
    private String fabricante;
    private String modelo;
    private int anofabricacao;
    private String cor;
    
    public Smartphone(String fabricante, String modelo, int ano, String cor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anofabricacao = ano;
        this.cor = cor;       
    }
    
    public String exibeSmartphone(){
        return "- Fabricante: " + this.fabricante + " Modelo: " + this.modelo + " Ano: " + this.anofabricacao + " Cor: " +this.cor;
    }
    
}
