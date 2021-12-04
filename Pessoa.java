public class Pessoa {
    private String n;
    private float at;
    private int a;

    public String getNome() {
        return n;
    }

    public int getAno() {
        return a;
    }

    public float getAltura() {
        return at;
    }

    public void setNome(String nome) {
        this.n = nome;
    }

    public void setAno(int ano) {
        this.a = ano;
    }

    public void setAltura(float altura) {
        this.at = altura;
    }

    public void getAll() {
        System.out.println(n);
        System.out.println(at);
        System.out.println(a);
    }

    public void qualIdade() {
        int i = 2021 - this.a;
        System.out.println(i);
    }
}