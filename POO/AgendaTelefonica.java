package POO;

//import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelefonica {
	private Scanner s = new Scanner(System.in);
	
	private String newNum, newNome;
	private String[][] lista = new String[50000][50000];
	public void preencheLista(String numeroNome) {
		String[] temp = new String[2];
		temp = numeroNome.split("-");
		if(temp[0].contains("3")) {
			newNum = temp[0];
			newNome = temp[1];
		}else {
			newNome = temp[0];
			newNum = temp[1];
		}
		/*for(int i =0;i<lista.length;i++) {
			for (int j = 0; j < lista.length; j++) {
				if(lista[i].) {}
				
			}
		}*/
	}
	/*private ArrayList<String> telefone = new ArrayList<String>();
	public AgendaTelefonica(ArrayList<String> telefone) {
		super();
		this.telefone = telefone;
	}
	
	public void preencheLista() {
		
		System.out.println("Digite o Nome e o numero de telefone");
		newNum = s.next();
		telefone.add(newNum);
	}*/
}
