package POO;

public class Automovel {
	private int numRodas;
	private int velMax;
	private boolean ligado;
	public Automovel(int numRodas, int velMax, boolean ligado) {
		super();
		this.numRodas = numRodas;
		this.velMax = velMax;
		this.ligado = ligado;
	}
	public int getNumRodas() {
		return numRodas;
	}
	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
	}
	public int getVelMax() {
		return velMax;
	}
	public void setVelMax(int velMax) {
		this.velMax = velMax;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
}
