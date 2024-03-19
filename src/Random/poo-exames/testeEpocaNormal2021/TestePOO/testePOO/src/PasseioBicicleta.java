import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PasseioBicicleta extends Atividade{
	
	private ArrayList<String> locais;
	
	public PasseioBicicleta(int id, String nome, String[] l) {
		super(id, nome);
		locais = new ArrayList<String>();
		Collections.addAll(locais, l);
	}

	public PasseioBicicleta(int id, String nome) {
		super(id,nome);
		this.locais = new ArrayList<String>();
	}

	public void addLocal(String l) {
		locais.add(l);
		
	}
	
	@Override
	public String getNomeLocais () {
		StringBuilder sb = new StringBuilder();
		for (String s : locais) {
			sb.append(s+", ");
		}
		return sb.toString();
	}
	
	
	@Override
	public int getLocais() {
		return this.locais.size();
	}
	
	
	@Override
	public Collection<String> locais() {
		Collections.sort(locais);
		return locais;
	}

}
