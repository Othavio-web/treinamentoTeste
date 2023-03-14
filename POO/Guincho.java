package POO;

public class Guincho extends Automovel{
	private Automovel Carregado;

	public Guincho(int numRodas, int velMax, boolean ligado, Automovel carregado) {
		super(numRodas, velMax, ligado);
		Carregado = carregado;
	}

	public Automovel getCarregado() {
		return Carregado;
	}

	public void setCarregado(Automovel carregado) {
		Carregado = carregado;
	}
}
