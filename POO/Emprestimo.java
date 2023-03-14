package POO;

public class Emprestimo {
	private Livro[] livroEmprestado;
	
	public void emprestaLivro(String nomeLivro) {
		for (int i = 0; i < livroEmprestado.length; i++) {
			if(livroEmprestado[i].getNome().isEmpty()) {
				livroEmprestado[i].setNome(nomeLivro);
				
			}else {
				System.out.println("Livro esta emprestado");
			}
				
						
		}
	}
}
