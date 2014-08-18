
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná DAINF - Departamento
 * Acadêmico de Informática IF62C - Fundamentos de Programação 2
 *
 * Template de projeto de programa Java usando Maven.
 *
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica72 {
    static final Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {
         String caminho, linha;
         Integer num;
         HashMap<String, Integer> lista = new HashMap<>();
         BufferedReader br;
         BufferedWriter bw;
         System.out.println("Digite o caminho do arquivo:");
         caminho = leitura.next();
         br = new BufferedReader(new FileReader(caminho));
         
         while((linha = br.readLine()) != null){
             System.out.println("=> " +linha);
         }
         

    }
}
