package POO;

public class CarroAutomatico extends Carro{
	private int voltagen;
	private boolean freioPrecionado;



	public CarroAutomatico(int numRodas, int velMax, boolean ligado, int numPortas, boolean sedam, int voltagen,
			boolean freioprecionado) {
		super(numRodas, velMax, ligado, numPortas, sedam);
		this.voltagen = voltagen;
		this.freioPrecionado = freioprecionado;
	}

	public boolean isFreioprecionado() {
		return freioPrecionado;
	}

	public void setFreioprecionado(boolean freioprecionado) {
		this.freioPrecionado = freioprecionado;
	}

	public int getVoltagen() {
		return voltagen;
	}

	public void setVoltagen(int voltagen) {
		this.voltagen = voltagen;
	}

	public void LigaCarro() {
		if(freioPrecionado) {
			super.setLigado(true);
		}
	}
}
