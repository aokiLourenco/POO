package temp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class ex01 {
	public static void main(String[] args) {
		Scanner sc = null;
		TreeMap<String,ArrayList<Double>> dados = new TreeMap<String,ArrayList<Double>>();
		ArrayList<Double> d;
		double soma =0, contador = 0;
		try {
			sc = new Scanner(new File("qdv.txt"));
		} catch (IOException e) {
			System.out.print("Erro no ficheiro "+ e);
		}
		
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			
			if (!line.startsWith("#")) {
				String dadosLinha[] = line.split("	"); 

				soma+=Double.parseDouble(dadosLinha[1].replace(',', '.'));
				contador+=1;
				
				if(dados.containsKey(dadosLinha[0])) {
					d = dados.get(dadosLinha[0]);
				} else {
					d = new ArrayList<Double>();
					d.add(0.0);
					d.add(0.0);
				}
				d.set(0, d.get(0)+Double.parseDouble(dadosLinha[1].replace(',', '.')));
				d.set(1, d.get(1)+1);
				dados.put(dadosLinha[0],d);
			}
		}
		for (String k : dados.keySet()) {
			d = dados.get(k);
			System.out.println(k+" - "+d.get(0)/d.get(1));	
		}
		System.out.println(dados.keySet());
		System.out.println("MEDIA TOTAL: "+soma/contador);
	}
}