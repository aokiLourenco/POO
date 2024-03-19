import java.util.HashSet;
import java.util.TreeSet;

public class AgenciaTuristica {
	private String nome;
	private String endereco;

	private HashSet<Atividade> atividades;
	
	public AgenciaTuristica(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		this.atividades = new HashSet<Atividade>();
	}

	public void add(Atividade ps) {
		atividades.add(ps);
	}
	
	public HashSet<Atividade> atividades() {
		return atividades;
	}

	public void setAtividades(HashSet<Atividade> atividades) {
		this.atividades = atividades;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atividades == null) ? 0 : atividades.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgenciaTuristica other = (AgenciaTuristica) obj;
		if (atividades == null) {
			if (other.atividades != null)
				return false;
		} else if (!atividades.equals(other.atividades))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public int totalItems() {
		int counter=0;
		for (Atividade a: atividades) {
			counter+= a.getLocais();
		}
		return counter;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("AGENCIA: "+this.nome+"\n");
		sb.append("Atividades: [");
		for (Atividade a : atividades) {
			sb.append(a);
			sb.append(", ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	public TreeSet<String> getAllItems(){
		TreeSet<String> tmp = new TreeSet<String>();
		for (Atividade a: atividades) {
			tmp.add(a.getNomeLocais());
		}
		return tmp;
	}
	
}
