package resolTeste20;

public class Serie extends Produto {
	public static final int IVA = 23;
	
	private String titulo;
	
	public Serie(double preco) {
		super("S", preco);
	}

	@Override
	public double precoVendaAoPublico() {
		return this.getPreco()*(1+IVA/100);
	}

	@Override
	public String getDescricao() {
		return titulo;
	}
}
