/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forca;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class Forca {

     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         String[] animais = {
            "Abelha", "Avestruz", "Baleia", "Búfalo", "Cachorro",
            "Cabra", "Cavalo", "Cervo", "Coelho", "Elefante",
            "Foca", "Formiga", "Galo", "Gato", "Girafa",
            "Hipopotamo", "Jacaré", "Jaguatirica", "Javali", "Leão",
            "Macaco", "Mula", "Onça", "Ornitorrinco", "Paca",
            "Pato", "Peixe", "Porco", "Puma", "Rato",
            "Rinoceronte", "Sapo", "Serpente", "Tigre", "Touro",
            "Urso", "Veado", "Vaca", "Vento", "Zebra",
            "Cavalo-marinho", "Pinguim", "Polvo", "Peixe-boi", "Robalo",
            "Cobra", "Paca", "Pangolim", "Bicho-preguiça", "Cacatua"
        };
         
       String[] herois = {
            // Marvel
            "Homem-Aranha", "Homem de Ferro", "Capitão América", "Thor", "Hulk",
            "Viúva Negra", "Pantera Negra", "Doutor Estranho", "Deadpool", "Wolverine",
            "Capitã Marvel", "Homem-Formiga", "Cavaleiro da Lua", "Gavião Arqueiro", "Jessica Jones",
            "Luke Cage", "Justiceiro", "Blade", "Surfista Prateado", "Nova",
            "Motoqueiro Fantasma", "Tempestade", "Groot", "Guardiões da Galáxia", "Star-Lord",
            "Drax", "Mantis", "Nebulosa", "Yondu", "Colossus",
            "Gambit", "Noturno", "Rouge", "Psylocke", "Emma Frost",
            "Magneto", "Mística", "Dentes de Sabre", "Jean Grey", "Ciclope",
            "Homem-Morcego", "Super-Homem", "Mulher-Maravilha", "Flash", "Aquaman",
            "Lanterna Verde", "Batman", "Robin", "Mulher-Gato", "Coringa"
        };
          
          String[] cidades = {
            "São Paulo", "Rio de Janeiro", "Belo Horizonte", "Brasília", "Salvador",
            "Fortaleza", "Curitiba", "Manaus", "Recife", "Porto Alegre",
            "Belém", "São Luís", "Maceió", "Natal", "João Pessoa",
            "Aracaju", "Campo Grande", "Cuiabá", "Teresina", "Vitória",
            "Palmas", "Boa Vista", "Macapá", "São Bernardo do Campo", "Santos",
            "Guarulhos", "Osasco", "Diadema", "Jundiaí", "Sorocaba",
            "Ribeirão Preto", "Campinas", "Piracicaba", "Londrina", "Marília",
            "São José dos Campos", "Taubaté", "Jaboatão dos Guararapes", "Canoas", "Joinville",
            "Blumenau", "São Carlos", "Mogi das Cruzes", "Bauru", "Itapetininga",
            "Maringá", "Uberlândia", "Divinópolis", "Lages", "Pelotas",
            "Santarém", "Caruaru", "São José", "Palhoça", "Itaúna"
        };
          String[] times = {
            "Flamengo", "Palmeiras", "São Paulo", "Santos", "Corinthians",
            "Vasco da Gama", "Fluminense", "Botafogo", "Grêmio", "Internacional",
            "Cruzeiro", "Atlético Mineiro", "Bahia", "Sport", "Náutico",
            "Fortaleza", "Ceará", "Atlético Paranaense", "Paraná", "Goiás",
            "Atlético Goianiense", "Juventude", "Figueirense", "Chapecoense", "Avaí",
            "Vitória", "Ponte Preta", "Bragantino", "Guarani", "São Caetano",
            "Portuguesa", "Joinville", "Paysandu", "Remo", "Santa Cruz",
            "ABC", "XV de Piracicaba", "CSA", "São Bento", "Tombense"
        };

         
        System.out.println("Qual tema você quer: ");
        System.out.println("1: Animais\n 2: heróis\n 3: Cidades brasileiras\n 4: Times de futebol");
        int temaEscolhido = scanner.nextInt();
        scanner.nextLine();
        String palavra = "";
        switch(temaEscolhido){
            case(1) -> palavra = animais[(int)(Math.random() * 50)];
            
            case(2) -> palavra = herois[(int)(Math.random() * 50)];
            
            case(3) -> palavra = cidades[(int)(Math.random() * 50)];
            
            case(4) -> palavra = times[(int)(Math.random() * 50)];
            
        }
        
        Jogo forca = new Jogo(palavra, 5);
        
        while(!forca.verificaSeAcabou()){
            
            forca.imprime();
            System.out.println("Escreva uma letra:");
            String palavraAtual = (String)scanner.nextLine();
            System.out.println(palavraAtual);
            if(palavraAtual.length() > 1){
                if(forca.chuta(palavraAtual)){
                    forca.anunciaVitoria();
                    break;
                }
                else{
                    forca.anunciaDerrota();
                    break;
                }
            }
            else{
                char letraAtual = palavraAtual.charAt(0);
                forca.tentaLetra(letraAtual);
            }
        }
        forca.escreveBoneco();
        System.out.println("A palavra era " + forca.getPalavra());
        
     }


}
