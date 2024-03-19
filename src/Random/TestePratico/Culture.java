package TestePratico;

public class Culture extends Activity {

    public static Options Option;
    private int participants;

    public Culture(int preco, Client client, Options Option, int participants) {
        super(22, client);
        Culture.Option = Option;
    }

    public Culture(Options options, int participants) {
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
