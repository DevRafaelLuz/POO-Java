import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Teste {
    public static void main(String[] args) throws IOException {
        // Propriedades
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("file.separator"));
        
        File dir = new File("..\\POO-Java\\Arquivos");

        if (!dir.exists()) {
            System.out.println("Criando diretório " + dir.getName());
            dir.mkdir();
        }

        File file = new File(dir, "dados.txt");

        if (!file.exists()) {
            System.out.println("Criando arquivo");
            file.createNewFile();
        }    

        // Escrevendo informações no arquivo
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        System.out.println("Iniciando a escrita dos dados");
        for (int i = 0; i < 10; i++) {
            printWriter.println(String.format("Linha %d" , i));
        }
        printWriter.close();
        System.out.println("Escrita dos dados realizada com sucesso");

        // Fazendo leitura dos dados do arquivo
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linha = "";
        while ((linha = bufferedReader.readLine()) != null) {
            System.out.println(linha);
        }

        /*
        // Renomeando o nome do arquivo
        File file2 = new File(dir, "Rename.txt");
        file.renameTo(file2);

        // Deletando o diretório e os arquivos
        System.out.println(file.delete());
        System.out.println(file2.delete());
        System.out.println(dir.delete());
        
        // Lista todos os arquivos  (Dir ou File) de um endereço
        File all = new File("C:\\");
        for (File f : all.listFiles()) {
            if (f.isDirectory()) {
                System.out.println(f.getName()  + " é um DIR");
                continue;
            }
            System.out.println(f.getName() + " é um FILE");
        } */
    }
}
