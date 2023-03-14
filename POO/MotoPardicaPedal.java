package POO;

public class MotoPardicaPedal extends Moto{
	private boolean aceleradorPuxado;

	public MotoPardicaPedal(int numRodas, int velMax, boolean ligado, int silindradas, boolean aceleradorPuxado) {
		super(numRodas, velMax, ligado, silindradas);
		this.aceleradorPuxado = aceleradorPuxado;
	}

	public boolean isAceleradorPuxado() {
		return aceleradorPuxado;
	}

	public void setAceleradorPuxado(boolean aceleradorPuxado) {
		this.aceleradorPuxado = aceleradorPuxado;
	}
	
	public void LigaMoto() {
		if(aceleradorPuxado) {
			super.setLigado(true);
		}
	}

}
