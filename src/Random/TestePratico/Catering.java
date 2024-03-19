package TestePratico;

public class Catering extends Activity {

    public static Options Option;
    private int participants;

    public Catering(int preco, Client client, Options Option, int participants) {
        super(22, client);
        Catering.Option = Option;
    }

    public Catering(Options options, int participants) {
        this(0, null, options, participants);
    }

    public static Options getOption() {
        return Option;
    }

    public static void setOption(Options option) {
        Option = option;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    
    
}
