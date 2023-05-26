
package jatekhv;

import java.util.Random;

class Varazslo extends Karakter implements Harcol {
    public Varazslo(int eletero) {
        super(eletero);
    }

    @Override
    public void harcol(Karakter ellenfel) {
        Random random = new Random();
        int sebzes = random.nextInt(6) + 1;
        ellenfel.serul(sebzes);
        System.out.println(" (Varazslo sebzese: " + sebzes +"): H:" + ellenfel.getEletero() + ", V:" + eletero);
    }
}