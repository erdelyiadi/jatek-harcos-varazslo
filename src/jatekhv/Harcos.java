
package jatekhv;

import java.util.Random;

class Harcos extends Karakter  {
    public Harcos(int eletero) {
        super(eletero);
    }

    @Override
    public void harcol(Karakter ellenfel) {
        Random random = new Random();
        int sebzes = random.nextInt(6) + 1;
        ellenfel.serul(sebzes);
        System.out.println("Egy mezore léptek, harc következik:\n (Harcos sebzese: " + sebzes +"): H:" + super.getEletero() + ", V:" + ellenfel.getEletero());
    }
}