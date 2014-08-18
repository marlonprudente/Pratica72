
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
         String caminho, linha, palavra = "";
         Integer num;
         HashMap<String, Integer> lista = new HashMap<>();
         BufferedReader br;
         BufferedWriter bw;
         System.out.println("Digite o caminho do arquivo:");
         caminho = leitura.next();
         br = new BufferedReader(new FileReader(caminho));
         
         while((linha = br.readLine()) != null){
             linha = linha +" ";
             for(int i = 0; i < linha.length();i++){
                 if(Character.isAlphabetic(linha.charAt(i))){
                     palavra = palavra + linha.charAt(i);
                 }
                 else if(palavra != ""){
                     palavra = palavra.toLowerCase();
                     if(lista.containsKey(palavra)){
                         lista.replace(palavra, lista.get(palavra)+1);
                     }
                     else{
                        lista.put(palavra, 1);

                     }
                     palavra = "";
                 }
                     
             }
             System.out.println("Linha: " + linha);
             System.out.println("=> " +lista);
         }
         bw = new BufferedWriter(new FileWriter("teste_out.csv"));
         for(String j: lista.keySet()){
             bw.write(j + " - " + lista.get(j));
             bw.newLine();
         }
         br.close();
         bw.close();
    }
}
