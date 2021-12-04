import java.lang.Math;

public class Estacionamento {
    String placa, modelo;
    float incarro, outcarro;

    public void inicializar() {
        this.incarro = 0;
        this.outcarro = 0;
        this.placa = "";
        this.modelo = "";
    }

    public void setPlaca(String pc1) {
        this.placa = pc1;
    }

    public void setModelo(String m1) {
        this.modelo = m1;
    }

    public void setIn(float in1) {
        this.incarro = in1;
    }

    public void setOut(float out1) {
        this.outcarro = out1;
    }

    public void escrever() {
        System.out.println(this.placa);
        System.out.println(this.modelo);
        System.out.println(this.incarro);
        System.out.println(this.outcarro);
    }

    public double pagar() {
        double diferenca;
        double a1, a2;
        int k, j;
        k = Math.round(this.incarro);
        j = Math.round(this.outcarro);
        a1 = this.incarro - k;
        a2 = this.outcarro - j;
        a2 = a2 * 0.6;
        a1 = a1 * 0.6;
        diferenca = (j - k) + (a1 - a2);
        diferenca = diferenca * 1.5;

        return diferenca;
    }
}
