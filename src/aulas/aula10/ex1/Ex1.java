package aulas.aula10.ex1;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String args[]){
        Map <String, String> map = new HashMap<>();

        map.put("branco", "Que tem a cor da neve");
        map.put("preto", "Que tem a cor da noite");
        map.put("amarelo", "Que tem a cor do sol");
        map.put("azul", "Que tem a cor do mar");
        map.put("verde", "Que tem a cor do relvado");


        //REMOVE
        map.remove("branco");
        map.remove("preto");
        map.remove("amarelo");
        map.remove("azul");
        map.remove("verde");

        //CHANGE
        map.put("branco", "Que tem a cor da nuvém");
        map.put("preto", "Que tem a cor do petróleo");
        map.put("amarelo", "Que tem a cor do girassol");
        map.put("azul", "Que tem a cor do céu");
        map.put("verde", "Que tem a cor da floresta");
        

        //SEARCH
        System.out.printf("Busca por branco: \n%s\n",map.get("branco"));
        System.out.printf("Busca por preto: \n%s\n",map.get("preto"));
        System.out.printf("Busca por amarelo: \n%s\n",map.get("amarelo"));
        System.out.printf("Busca por azul: \n%s\n",map.get("azul"));
        System.out.printf("Busca por verde: \n%s\n",map.get("verde"));

        //-------------------------//
        
        
        System.out.printf("map.toString() >>>\n%s\n", map.toString());
        System.out.printf("map.keySet() >>>\n%s\n", map.keySet());
        System.out.printf("map.values() >>>\n%s\n", map.values());

    }
}
