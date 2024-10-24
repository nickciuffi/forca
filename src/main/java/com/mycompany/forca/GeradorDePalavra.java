/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forca;

/**
 *
 * @author nicol
 */
public class GeradorDePalavra {
    private String[] animais = {
            "Abelha", "Avestruz", "Baleia", "Búfalo", "Cachorro",
            "Cabra", "Cavalo", "Cervo", "Coelho", "Elefante",
            "Foca", "Formiga", "Galo", "Gato", "Girafa",
            "Hipopótamo", "Jacaré", "Jaguatirica", "Javali", "Leão",
            "Macaco", "Mula", "Onça", "Ornitorrinco", "Paca",
            "Pato", "Peixe", "Porco", "Puma", "Rato",
            "Rinoceronte", "Sapo", "Serpente", "Tigre", "Touro",
            "Urso", "Veado", "Vaca", "Vento", "Zebra",
            "Cavalo-marinho", "Pinguim", "Polvo", "Peixe-boi", "Robalo",
            "Cobra", "Paca", "Pangolim", "Bicho-preguiça", "Cacatua"
        };

    private String[] herois = {
            "Homem-Aranha", "Homem de Ferro", "Capitão América", "Thor", "Hulk",
            "Viúva Negra", "Pantera Negra", "Doutor Estranho", "Deadpool", "Wolverine",
            "Capitã Marvel", "Homem-Formiga", "Cavaleiro da Lua", "Gavião Arqueiro", "Jessica Jones",
            "Luke Cage", "Justiceiro", "Blade", "Surfista Prateado", "Nova",
            "Motoqueiro Fantasma", "Tempestade", "Groot", "Guardiões da Galáxia", "Star-Lord",
            "Drax", "Mantis", "Nebulosa", "Yondu", "Colossus",
            "Gambit", "Noturno", "Rogue", "Psylocke", "Emma Frost",
            "Magneto", "Mística", "Dentes de Sabre", "Jean Grey", "Ciclope",
            "Homem-Morcego", "Super-Homem", "Mulher-Maravilha", "Flash", "Aquaman",
            "Lanterna Verde", "Batman", "Robin", "Mulher-Gato", "Coringa"
        };

    private String[] cidades = {
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

    private String[] times = {
            "Flamengo", "Palmeiras", "São Paulo", "Santos", "Corinthians",
            "Vasco da Gama", "Fluminense", "Botafogo", "Grêmio", "Internacional",
            "Cruzeiro", "Atlético Mineiro", "Bahia", "Sport", "Náutico",
            "Fortaleza", "Ceará", "Atlético Paranaense", "Paraná", "Goiás",
            "Atlético Goianiense", "Juventude", "Figueirense", "Chapecoense", "Avaí",
            "Vitória", "Ponte Preta", "Bragantino", "Guarani", "São Caetano",
            "Portuguesa", "Joinville", "Paysandu", "Remo", "Santa Cruz",
            "ABC", "XV de Piracicaba", "CSA", "São Bento", "Tombense",
            "Botafogo-SP", "CRB", "Londrina", "Operário-PR", "Criciúma",
            "Ituano", "Sampaio Corrêa", "Vila Nova", "Novo Hamburgo", "America-RN"
};


    public String[] getAnimais() {
        return animais;
    }

    public void setAnimais(String[] animais) {
        this.animais = animais;
    }

    public String[] getHerois() {
        return herois;
    }

    public void setHerois(String[] herois) {
        this.herois = herois;
    }

    public String[] getCidades() {
        return cidades;
    }

    public void setCidades(String[] cidades) {
        this.cidades = cidades;
    }

    public String[] getTimes() {
        return times;
    }

    public void setTimes(String[] times) {
        this.times = times;
    }
    
    public static String GeraPalavra(int index){
        GeradorDePalavra gerador = new GeradorDePalavra();
        String palavra = "";
        switch(index){
            case(0) -> palavra = gerador.getAnimais()[(int)(Math.random() * 50)];
            
            case(1) -> palavra = gerador.getHerois()[(int)(Math.random() * 50)];
            
            case(2) -> palavra = gerador.getCidades()[(int)(Math.random() * 50)];
            
            case(3) -> palavra = gerador.getTimes()[(int)(Math.random() * 50)];
            
        }
        
        return palavra;
    }
}
