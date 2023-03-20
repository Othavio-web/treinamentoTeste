package IO;

import java.io.File;
import java.io.IOException;

public class Exemplo {
    public static void exemplifica() {
        // criando pasta
        File diretorio = new File("pastaTeste");
        if(!diretorio.exists()) {
            boolean criou = diretorio.mkdir();
            System.out.println(criou);
        }else {
            System.out.println(diretorio.getAbsolutePath());
        }
        // criando arquivo
        File arquivo = new File(diretorio.getPath()+File.separator+"arquivoTeste.txt");
        if(!arquivo.exists()) {
            
            try {
                boolean criou = arquivo.createNewFile();
            } catch (IOException e) {
                //TODO: Catch deve ter tratamento.
            }
            System.out.println(criou);
        } else {
            System.out.println(arquivo.getAbsolutePath());
        }
        // listando conteudo do diretório
        String[] conteudoDoDiretorio = diretorio.list();
        for (String item : conteudoDoDiretorio) {
            System.out.println(item);
        }
        File arquivoOrigem = new File(diretorio.getPath()+File.separator+"arquivoTeste.txt");
        File arquivoDest = new File(diretorio.getPath()+File.separator+"arquivoTeste10.txt");
        arquivoOrigem.renameTo(arquivoDest);
        // Deletando um arquivo
        System.out.println(arquivoDest.delete());
    } 
}
