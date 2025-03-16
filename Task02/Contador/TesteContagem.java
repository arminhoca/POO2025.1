package Contador;

public class TesteContagem {

    public static void main(String[] args) {
        
        String novaPalavra;

        novaPalavra = "Batatinha123";

        
        System.out.println("Palavra escolhida: "+ novaPalavra);

        System.out.println("Número de caracteres: " + novaPalavra.length());

        System.out.println("Maiusculo: " + novaPalavra.toUpperCase());

        int qntVogais = novaPalavra.replaceAll("[^aeiouAEIOU]", "").length();
        System.out.println("Número de vogais: " + qntVogais);        

        boolean comecaComUni = novaPalavra.toUpperCase().startsWith("UNI");
        System.out.println("A palavra começa com 'UNI'? " + comecaComUni);

        boolean terminaComRio = novaPalavra.toUpperCase().endsWith("RIO");
        System.out.println("A palavra termina com 'RIO'? " + terminaComRio);

        int numDigitos = novaPalavra.replaceAll("[^0-9]", "").length();
        System.out.println("Número de dígitos: " + numDigitos);
        
    }
}
