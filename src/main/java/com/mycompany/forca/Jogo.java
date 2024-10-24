/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forca;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author usf2
 */
public final class Jogo {
    private String palavra;
    private boolean[] acertados;
    private int tentativas = 5;
    private final ArrayList<Character> tentativasErradas = new ArrayList<>();
    
    public Jogo(){
        
    }
    
    public String imprime(){
        String finalText = "";
         for(int i = 0; i < this.palavra.length(); i++){
            if(this.acertados[i]){
                finalText += this.palavra.charAt(i);
            }
            else{
                finalText += " _";
            }
            
        }
         return finalText;
    }
    
    public String getPalavra(){
        return this.palavra;
    }
    
    public void setAcertados(String acertos){
        int size = this.palavra.length();
        if(acertos == null){
            
            this.acertados = new boolean[size];
        }
        else{
            boolean[] acertosLidos = new boolean[size];
            for(int i = 0; i < acertos.length(); i++){
                
                acertosLidos[i] = acertos.charAt(i) != 0;
            }
            this.acertados = acertosLidos;
        }
    }
    
    public void verificaEspacos(){
        for(int i = 0; i < this.palavra.length(); i++){
            char c = palavra.charAt(i);
            if(c == ' '){
                acertados[i] = true;
            }
        }
    }
    
    public void setPalavra(String p){
        this.palavra = p;
    }
    
    public void setAcertado(int valor){
        
        this.acertados[valor] = true;
    }
    
    public boolean[] getAcertados(){
        return this.acertados;
    }
    
   
    
    public void tentaLetra(char letra){
        int acertos = 0;
        for(int i = 0; i < this.palavra.length(); i++){
            if(Jogo.removerAcentos(Character.toString(Character.toLowerCase(this.palavra.charAt(i)))).charAt(0) == Character.toLowerCase(letra)){
                this.setAcertado(i);
                acertos++;
                
            }
        }
       if(acertos == 0){
            this.tentativas--;
            this.tentativasErradas.add(letra);
        }
    }
    
    public boolean chuta(String tentativa){
        String palavraSemAcento = Jogo.removerAcentos(this.palavra).toLowerCase();
        String tentativaSemAcento = Jogo.removerAcentos(tentativa).toLowerCase();
        return tentativaSemAcento.equals(palavraSemAcento);
    }
    
      public static String removerAcentos(String texto) {
        // Normaliza o texto para a forma de decomposição
        String textoNormalizado = Normalizer.normalize(texto, Form.NFD);
        
        // Remove os caracteres acentuados (marcadores de acento) usando expressão regular
        Pattern pattern = Pattern.compile("\\p{M}");
        String textoSemAcentos = pattern.matcher(textoNormalizado).replaceAll("");
        
        return textoSemAcentos;
    }
    
    public boolean verificaSeAcabou(){
        boolean temErro = false;
        for(int i = 0; i < this.acertados.length; i++){
            if(!this.acertados[i]){
                temErro = true;
                break;
            }
        }
        if(!temErro){
            anunciaVitoria();
            return true;
        }
        
        if(this.tentativas <= 0){
            this.anunciaDerrota();
            return true;
        }
        
        return false;
    }
    
    public void anunciaVitoria(){
        System.out.println("Vitoriaaaaaaaa!!!!!!");
    }
    
    public void anunciaDerrota(){
        System.out.println("Perdeuuuuuuu!!!!!!");
    }
    
    
    
    
}
