package aulas.aula11.ex2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;

public class Voo {

    private String hora;
    private String companhia;
    private String id;
    private String origem;
    private String obs;
    private String atraso;

    private static HashMap<String, String> companhias = new HashMap<>();

    private String getPrevisao(){
        int horaPrevisaoInt = Integer.parseInt(this.hora.substring(0, 2))+ Integer.parseInt(this.atraso.substring(0, 2));
        int minutoPrevisaoInt = Integer.parseInt(this.hora.substring(3, 5)) + Integer.parseInt(this.atraso.substring(3, 5));

        if(minutoPrevisaoInt >= 60){
            horaPrevisaoInt += 1;
            minutoPrevisaoInt -= 60;
        }

        if(horaPrevisaoInt >= 24){
            horaPrevisaoInt -= 24;
        }

        return String.format("%02d:%02d", horaPrevisaoInt, minutoPrevisaoInt);
    }

    public Voo(String hora, String id, String origem, String atraso) throws IOException{
        this.hora = hora;
        this.origem = origem;
        this.atraso = atraso;
        this.id = id;
        
        if(this.atraso == ""){
            this.obs = "";
        } else {
            this.obs = "Previsto: " + this.getPrevisao();
        }
        this.companhia = getCompanhias().get(id.substring(0, 2));
    }

    public String getHora(){
        return hora;
    }

    public String getCompanhia(){
        return companhia;
    }

    public String getId(){
        return id;
    }

    public String getOrigem() {
        return origem;
    }

    public String getAtraso() {
        return atraso;
    }
    
    public String getObs() {
        return obs;
    }
    
    public int getAtrasoSegundos() {
        return Integer.parseInt(this.getAtraso().substring(0, 2))*3600 + Integer.parseInt(this.getAtraso().substring(3, 5))*60; 
    }

    @Override
    public String toString() {
        return String.format("%-7s %-8s %-20s %-21s %-7s %-20s", this.hora, this.id, this.companhia, this.origem, this.atraso, this.obs);
    }

    private HashMap<String, String> getCompanhias() throws IOException {
        if (companhias.isEmpty()) {
            Scanner txtCompanhias = new Scanner(new FileReader("src/aula11/ex2/companhias.txt"));
            txtCompanhias.nextLine();
            while (txtCompanhias.hasNext()) {
                String[] companhia = txtCompanhias.nextLine().split("\t");
                companhias.put(companhia[0], companhia[1]);
            }
        }
        return companhias;
    }
    
}
