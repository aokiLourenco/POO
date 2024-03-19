package TestePratico;

import java.io.FileReader;
import java.time.LocalDate;

public class EventManager {
    private String nome;

    public EventManager(String nome) {
        this.nome = nome;
    }

    public EventManager(FileReader fr) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Client addClient(String nome, String localidade) {
        return new Client(nome, localidade);
    }

    public Event addEvent(Event event) {
        return event;
    }

    public char[] listClients() {
        
    }

    public char[] listEvents() {

    }

    public Event addEvent(Client client, LocalDate date) {
        return new Event(client, date);
    }

    // devolve todos os clientes com eventos agendados
    public String[] clientsWithEvents() {

    }

    public String[] nextEventsByDate() {
        
    }

    
}
