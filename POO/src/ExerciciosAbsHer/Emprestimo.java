package ExerciciosAbsHer;

public class Emprestimo {
    Livro[] emprestados = new Livro[1];
    
    public void emprestaLivro(Livro livro) {
        Livro[] aux = new Livro[emprestados.length+1];
        for(int i=0;i<emprestados.length;i++) {
            if(emprestados[i].equals(livro)) {
                System.out.println("O livro esta emprestado");
                //return false;
            }else if(emprestados[i].equals(null)) {
                emprestados[i] = livro;
                System.out.println("livro pode ser emprestado");
            }else if(i==emprestados.length-1) {
                //aux = new Livro[emprestados.length+1];
                for(int j=0;j<emprestados.length;j++) {
                    aux[j] = emprestados[j];
                }
                emprestados = aux;
                emprestados[emprestados.length-1] = livro;
                System.out.println("O livro pode ser emprestado");
                //return true;
            }
        }
    }
}
