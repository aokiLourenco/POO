package ex02;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		ArrayList<Piloto> dados = new ArrayList<Piloto>();
		Scanner sc = null;
		try {
			sc = new Scanner (new File("F12019.txt"));
		} catch (IOException err) {
			System.out.print("ERRO na leitura do Ficheiro " + err);
			System.exit(0);
		}
		sc.nextLine();
		while (sc.hasNextLine()) {
			String linha = sc.nextLine();
			String[] dadosLinha = linha.split("\t");
			dados.add(new Piloto(Integer.parseInt(dadosLinha[0]),dadosLinha[1],dadosLinha[2],dadosLinha[3],Integer.parseInt(dadosLinha[4])));
		}
		
		//Ex 1) 
		/*for (Piloto p : dados) {
			System.out.println(p);
		}*/
		
		// Ex 2)
		/*for (Piloto p : dados) {
			System.out.println(p.toStringUpper());
		}*/
		
		// Ex 3)
		/*dados.sort(new sortNacionalidade());
		for (Piloto p : dados) {
			System.out.println(p);
		}*/
		
		// Ex 4)
		dados.sort(new sortPontosDecr());
		for (Piloto p : dados) {
			System.out.println(p);
		}
	}

}
