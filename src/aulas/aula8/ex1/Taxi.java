package aulas.aula8.ex1;

public abstract class Taxi extends Veiculo {
    private int numero_da_licenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int numero_do_quadro) {
        super(matricula, marca, modelo, potencia);
        this.setNumeroDaLicenca(numero_da_licenca);
    }

    public int getNumeroDaLicenca() {
        return numero_da_licenca;
    }

    public void setNumeroDaLicenca(int numero_da_licenca) {
        if (numero_da_licenca <= 0)
            throw new IllegalArgumentException("numero da licença invalido");
        this.numero_da_licenca = numero_da_licenca;
    }

}
