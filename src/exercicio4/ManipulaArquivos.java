package exercicio4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManipulaArquivos {
    private File file;
    private BufferedWriter bw;
    private BufferedReader br;

    List<String> listaPessoa = new ArrayList<>();

    public void lerArquivo() throws IOException{
        FileOutputStream fos;
        FileInputStream fis;

        try{
            FileReader fr = new FileReader("arquivoPessoas.txt");
            BufferedReader br = new BufferedReader(fr);

            String conteudo;
            while ((conteudo = br.readLine()) != null) {
                listaPessoa.add(conteudo);
            }

        } catch (IOException e) {
            System.out.println("Arquivo não encontrado!");
        }

        listaPessoa.forEach((a) -> System.out.println(a.toString()));
        System.out.println("-----------------");
        listaPessoa = listaPessoa.stream().sorted().collect(Collectors.toList());
        listaPessoa.forEach((a) -> System.out.println(a.toString()));
        gravarArquivo(listaPessoa);

    }

    private void gravarArquivo(List<String> listaPessoa) throws IOException {

        FileOutputStream fos = new FileOutputStream("arquivoPessoasOrdenado.txt");
        OutputStreamWriter osw = new  OutputStreamWriter(fos);
        bw = new BufferedWriter(osw);
        for(int i = 0; i < listaPessoa.size(); i++ ){
            bw.write(listaPessoa.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
