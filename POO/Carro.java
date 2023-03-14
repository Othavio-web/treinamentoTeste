package POO;

public class Carro extends Automovel{
	private int numPortas;
	private boolean sedam;
	public Carro(int numRodas, int velMax, boolean ligado, int numPortas, boolean sedam) {
		super(numRodas, velMax, ligado);
		this.numPortas = numPortas;
		this.sedam = sedam;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public boolean isSedam() {
		return sedam;
	}
	public void setSedam(boolean sedam) {
		this.sedam = sedam;
	}	
}
