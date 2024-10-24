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
            "Abelha", "Avestruz", "Baleia", "B�falo", "Cachorro",
            "Cabra", "Cavalo", "Cervo", "Coelho", "Elefante",
            "Foca", "Formiga", "Galo", "Gato", "Girafa",
            "Hipop�tamo", "Jacar�", "Jaguatirica", "Javali", "Le�o",
            "Macaco", "Mula", "On�a", "Ornitorrinco", "Paca",
            "Pato", "Peixe", "Porco", "Puma", "Rato",
            "Rinoceronte", "Sapo", "Serpente", "Tigre", "Touro",
            "Urso", "Veado", "Vaca", "Vento", "Zebra",
            "Cavalo-marinho", "Pinguim", "Polvo", "Peixe-boi", "Robalo",
            "Cobra", "Paca", "Pangolim", "Bicho-pregui�a", "Cacatua"
        };

    private String[] herois = {
            "Homem-Aranha", "Homem de Ferro", "Capit�o Am�rica", "Thor", "Hulk",
            "Vi�va Negra", "Pantera Negra", "Doutor Estranho", "Deadpool", "Wolverine",
            "Capit� Marvel", "Homem-Formiga", "Cavaleiro da Lua", "Gavi�o Arqueiro", "Jessica Jones",
            "Luke Cage", "Justiceiro", "Blade", "Surfista Prateado", "Nova",
            "Motoqueiro Fantasma", "Tempestade", "Groot", "Guardi�es da Gal�xia", "Star-Lord",
            "Drax", "Mantis", "Nebulosa", "Yondu", "Colossus",
            "Gambit", "Noturno", "Rogue", "Psylocke", "Emma Frost",
            "Magneto", "M�stica", "Dentes de Sabre", "Jean Grey", "Ciclope",
            "Homem-Morcego", "Super-Homem", "Mulher-Maravilha", "Flash", "Aquaman",
            "Lanterna Verde", "Batman", "Robin", "Mulher-Gato", "Coringa"
        };

    private String[] cidades = {
            "S�o Paulo", "Rio de Janeiro", "Belo Horizonte", "Bras�lia", "Salvador",
            "Fortaleza", "Curitiba", "Manaus", "Recife", "Porto Alegre",
            "Bel�m", "S�o Lu�s", "Macei�", "Natal", "Jo�o Pessoa",
            "Aracaju", "Campo Grande", "Cuiab�", "Teresina", "Vit�ria",
            "Palmas", "Boa Vista", "Macap�", "S�o Bernardo do Campo", "Santos",
            "Guarulhos", "Osasco", "Diadema", "Jundia�", "Sorocaba",
            "Ribeir�o Preto", "Campinas", "Piracicaba", "Londrina", "Mar�lia",
            "S�o Jos� dos Campos", "Taubat�", "Jaboat�o dos Guararapes", "Canoas", "Joinville",
            "Blumenau", "S�o Carlos", "Mogi das Cruzes", "Bauru", "Itapetininga",
            "Maring�", "Uberl�ndia", "Divin�polis", "Lages", "Pelotas",
            "Santar�m", "Caruaru", "S�o Jos�", "Palho�a", "Ita�na"
        };

    private String[] times = {
            "Flamengo", "Palmeiras", "S�o Paulo", "Santos", "Corinthians",
            "Vasco da Gama", "Fluminense", "Botafogo", "Gr�mio", "Internacional",
            "Cruzeiro", "Atl�tico Mineiro", "Bahia", "Sport", "N�utico",
            "Fortaleza", "Cear�", "Atl�tico Paranaense", "Paran�", "Goi�s",
            "Atl�tico Goianiense", "Juventude", "Figueirense", "Chapecoense", "Ava�",
            "Vit�ria", "Ponte Preta", "Bragantino", "Guarani", "S�o Caetano",
            "Portuguesa", "Joinville", "Paysandu", "Remo", "Santa Cruz",
            "ABC", "XV de Piracicaba", "CSA", "S�o Bento", "Tombense",
            "Botafogo-SP", "CRB", "Londrina", "Oper�rio-PR", "Crici�ma",
            "Ituano", "Sampaio Corr�a", "Vila Nova", "Novo Hamburgo", "America-RN"
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
