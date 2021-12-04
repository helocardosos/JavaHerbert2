import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class TestQuestao3 {
    public static void main(String[] args) throws IOException {
        Estacionamento Park = new Estacionamento();
        String endereco, modelo, placa, in, out;
        float in2, out2;
        Scanner sc1 = new Scanner(System.in);
        endereco = sc1.nextLine();
        BufferedReader bastaler = new BufferedReader(new FileReader(endereco));
        modelo = bastaler.readLine();
        placa = bastaler.readLine();
        in = bastaler.readLine();
        out = bastaler.readLine();
        in2 = Float.parseFloat(in);
        out2 = Float.parseFloat(out);
        Park.inicializar();
        Park.setIn(in2);
        Park.setOut(out2);
        Park.setModelo(modelo);
        Park.setPlaca(placa);
        Park.escrever();
        System.out.println(Park.pagar());
        bastaler.close();
        sc1.close();

    }
}