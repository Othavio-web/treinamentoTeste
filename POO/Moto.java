package POO;

public class Moto extends Automovel{
	private int silindradas;

	public Moto(int numRodas, int velMax, boolean ligado, int silindradas) {
		super(numRodas, velMax, ligado);
		this.silindradas = silindradas;
	}

	public int getSilindradas() {
		return silindradas;
	}

	public void setSilindradas(int silindradas) {
		this.silindradas = silindradas;
	}
}
