
public class Operador extends Trabalhador implements Comparable<Trabalhador>{
	private Caixa caixa;
	public Operador(int num, String nome, Caixa c) {
		super(num,nome);
		caixa = c;
	}
	public Caixa getCaixa() {
		return caixa;
	}
	public void setCaixa(Caixa caixa) {
		this.caixa = caixa;
	}
	@Override
	public String toString() {
		return "Operador [num="+this.getNum()+", nome="+this.getNome()+"] na Caixa "+this.caixa.getNum();
	}
	
	
}
