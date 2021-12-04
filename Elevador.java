
public class Elevador {
    int andarAt, numAndares, capac, quantosAt;

    public void inicio(int c1, int t1) {
        this.andarAt = 0;
        this.quantosAt = 0;
        this.numAndares = t1;
        this.capac = c1;
    }

    public void sobepessoas() {
        if (andarAt < numAndares) {
            andarAt = andarAt + 1;
        } else {
            System.out.println(">>Último andar<<");
        }
    }

    public void descepessoas() {
        if (andarAt > 0) {
            andarAt = andarAt - 1;
        } else {
            System.out.println(">>Terreo<<");
        }
    }

    public void entrapessoas() {
        if (quantosAt < capac) {
            quantosAt = quantosAt + 1;
        } else {
            System.out.println(">>O elevador está cheio<<");
        }
    }

    public void saipessoas() {
        if (quantosAt > 0) {
            quantosAt = quantosAt - 1;
        } else {
            System.out.println(">>O elevador está vazio<<");
        }
    }

    public int getAndarAt() {
        return andarAt;
    }

    public int getNumero() {
        return numAndares;
    }

    public int getCAtual() {
        return quantosAt;
    }

    public int getCapac() {
        return capac;
    }

    public void setCapac(int x) {
        this.capac = x;
    }

    public void setNumero(int x) {
        this.numAndares = x;
    }

    public void setCAtual(int x) {
        this.quantosAt = x;
    }

    public void setAndarAt(int x) {
        this.andarAt = x;
    }

}
