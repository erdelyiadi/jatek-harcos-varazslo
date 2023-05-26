package jatekhv;

abstract class Karakter implements Harcol {

    protected int eletero;
    protected int pozicio;

    public Karakter(int eletero) {
        this.eletero = eletero;
        this.pozicio = pozicio;
    }

    public void lep(int lepes) {
        pozicio = lepes;

    }

    public int getPozicio() {
        return pozicio;

    }

    public int getEletero() {
        return eletero;
    }

    public void serul(int sebzes) {
        eletero -= sebzes;
        if (eletero < 0) {
            eletero = 0;
        }
    }
}
