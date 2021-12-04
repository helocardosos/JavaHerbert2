import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class TestQuestao1 {
    public static void main(String[] args) throws IOException {
        Pessoa Pessoa1 = new Pessoa();
        String n, endereco, a1, a2;
        float at;
        int a;
        Scanner sc1 = new Scanner(System.in);
        endereco = sc1.nextLine();
        BufferedReader bastaler = new BufferedReader(new FileReader(endereco));
        n = bastaler.readLine();
        a1 = bastaler.readLine();
        a2 = bastaler.readLine();        
        at= Float.parseFloat(a2);
        a = Integer.parseInt(a1);
        Pessoa1.setAno(a);
        Pessoa1.setNome(n);
        Pessoa1.setAltura(at);
        Pessoa1.getAll();
        Pessoa1.qualIdade();
        System.out.println(Pessoa1.getAltura());
        System.out.println(Pessoa1.getAno());
        System.out.println(Pessoa1.getNome());

        sc1.close();
        bastaler.close();
    }

}
