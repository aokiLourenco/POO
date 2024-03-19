package TestePratico;

public class Sport extends Activity{

    public static Modality Modality;
    private int participants;

    public Sport(int preco, Client client, Modality Modality, int participants) {
        super(preco, client);
        this.participants = participants;
        Sport.Modality = Modality;
    }

    public Sport(Modality modality, int participants) {
        this(0, null, modality, participants);
    }

    public static Modality getModality() {
        return Modality;
    }

    public static void setModality(Modality modality) {
        Modality = modality;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    

    
}
