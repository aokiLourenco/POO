package aulas.aula10.ex2;

import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {
    
    public static int randomNumber(int min, int max){
        int gap = (max - min) + 1;
        return (int)(Math.random() * gap) + min;
    }

    public static String getEspecial(Map<String, ArrayList<String>> map, String key){
        return map.get(key).get(randomNumber(0, map.get(key).size()-1));
    }
    
    public static void main(String args[]){
        Map <String, ArrayList<String>> map = new TreeMap<>();
        
        map.put("branco", new ArrayList<String>(Arrays.asList("Que tem a cor da neve")));
        map.put("preto", new ArrayList<String>(Arrays.asList("Que tem a cor da noite")));
        map.put("amarelo", new ArrayList<String>(Arrays.asList("Que tem a cor do sol")));
        map.put("azul", new ArrayList<String>(Arrays.asList("Que tem a cor do mar")));
        map.put("verde", new ArrayList<String>(Arrays.asList("Que tem a cor do relvado")));


        //REMOVE
        map.remove("branco");
        map.remove("preto");
        map.remove("amarelo");
        map.remove("azul");
        map.remove("verde");

        //CHANGES
        map.put("branco", new ArrayList<String>(Arrays.asList("Que tem a cor da nuvém")));
        map.put("preto", new ArrayList<String>(Arrays.asList("Que tem a cor do petróleo")));
        map.put("amarelo", new ArrayList<String>(Arrays.asList("Que tem a cor do girassol")));
        map.put("azul", new ArrayList<String>(Arrays.asList("Que tem a cor do céu")));
        map.put("verde", new ArrayList<String>(Arrays.asList("Que tem a cor da floresta")));
        map.get("verde").add("Que tem a cor do bom");
        map.get("branco").add("Que tem a cor do leite");
        map.get("branco").add("Que tem a cor da mesa");
        map.get("branco").add("Que tem a cor do quartzo");
        map.get("branco").add("Que tem a cor de mais não sei do que");
        map.get("branco").add("ERROR: run out of ideas");


        

        //SEARCH
        System.out.printf("Busca por branco: \n%s\n",map.get("branco"));
        System.out.printf("Busca por preto: \n%s\n",map.get("preto"));
        System.out.printf("Busca por amarelo: \n%s\n",map.get("amarelo"));
        System.out.printf("Busca por azul: \n%s\n",map.get("azul"));
        System.out.printf("Busca por verde: \n%s\n",map.get("verde"));

        //SPECIAL SEARCH
        System.out.printf("\nBusca especial por branco: %s\n", getEspecial(map, "branco"));
        System.out.printf("Busca especial por preto: %s\n", getEspecial(map, "preto"));
        System.out.printf("Busca especial por amarelo: %s\n", getEspecial(map, "amarelo"));
        System.out.printf("Busca especial por azul: %s\n", getEspecial(map, "azul"));
        System.out.printf("Busca especial por verde: %s\n", getEspecial(map, "verde"));


        //-------------------------//
        
        
        System.out.printf("\nmap.toString() >>> %s\n", map.toString());
        System.out.printf("\nmap.keySet() >>> %s\n", map.keySet());
        System.out.printf("\nmap.values() >>> %s\n", map.values());

    }
}
