package teste20;

public abstract class Produto implements PVP {
    private static int proximoCodigo = 1000;
    
    private String codigo;
    private int quantidade;
    private Double precoBase;
    
    public Produto(String codigo, int quantidade, Double precoBase) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoBase = precoBase;
    }

    public Produto(String start, double preco) {
        this.codigo = start + String.valueOf(proximoCodigo);
        proximoCodigo += 2;
        
        this.quantidade = 0;
        this.precoBase = preco;
    }

    public static int getProximoCodigo() {
        return proximoCodigo;
    }

    public static void setProximoCodigo(int proximoCodigo) {
        Produto.proximoCodigo = proximoCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(Double precoBase) {
        this.precoBase = precoBase;
    }

    
}
