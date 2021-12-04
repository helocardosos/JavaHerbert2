import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class TestQuestao2 {
    public static void main(String[] args) throws IOException {
        // declarações
        Elevador el = new Elevador();
        String a, b, c, d, endereco;
        int atual, qualAt, capacidade, num;
        Scanner sc1 = new Scanner(System.in);
        endereco = sc1.nextLine();
        BufferedReader bastaler = new BufferedReader(new FileReader(endereco));
        // inicio
        a = bastaler.readLine();
        b = bastaler.readLine();
        c = bastaler.readLine();
        d = bastaler.readLine();
        atual = Integer.parseInt(a);
        qualAt = Integer.parseInt(b);
        capacidade = Integer.parseInt(c);
        num = Integer.parseInt(d);
        el.inicio(capacidade, num);
        // subir e descer
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.sobepessoas();
        el.entrapessoas();
        el.entrapessoas();
        el.entrapessoas();
        el.entrapessoas();
        el.entrapessoas();
        el.entrapessoas();
        el.saipessoas();
        el.saipessoas();
        el.saipessoas();
        el.saipessoas();
        el.saipessoas();
        el.saipessoas();

        // gets e sets
        System.out.println(el.getAndarAt());
        System.out.println(el.getCAtual());
        System.out.println(el.getCapac());
        System.out.println(el.getNumero());
        el.setAndarAt(atual);
        el.setCAtual(qualAt);

        bastaler.close();
        sc1.close();
    }
}
