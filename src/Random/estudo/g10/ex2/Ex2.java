package estudo.g10.ex2;

import java.util.*;

public class Ex2 {
    public static void main(String[] args){
        
        Map<String, ArrayList<String>> mapa = new TreeMap<>();
        mapa.put("branco", new ArrayList<String>(Arrays.asList("Que tem a cor da neve")));
        mapa.put("preto", new ArrayList<String>(Arrays.asList("Que tem a cor do preto")));
        mapa.put("azul", new ArrayList<String>(Arrays.asList("Que tem a cor do céu")));
        mapa.put("verde", new ArrayList<String>(Arrays.asList("Que tem a cor do bom")));
        mapa.put("amarelo", new ArrayList<String>(Arrays.asList("Que tem a minha cor")));

        //Remove
        mapa.remove("branco");
        mapa.remove("preto");

        //Change
        mapa.put("azul", new ArrayList<String>(Arrays.asList("Que tem a cor do mar")));
        mapa.put("verde", new ArrayList<String>(Arrays.asList("Que tem a cor da erva")));

        //ADD
        mapa.get("verde").add("É do bom");

        System.out.printf("MAPA: \n%s\n", mapa.toString());
        System.out.println("-".repeat(60));


        System.out.printf("Termo random de verde: \n%s\n", getRandomTermo(mapa, "verde"));
        System.out.println("-".repeat(60));
        
    }
    
    public static int numeroRandom(int min, int max){
        int intervalo = (max - min) + 1;     
        return (int)(Math.random() * intervalo) + min;
    }

    public static String getRandomTermo(Map<String, ArrayList<String>> mapa, String chave) {
        return mapa.get(chave).get(numeroRandom(0,mapa.get(chave).size()-1));
    }
    
}

