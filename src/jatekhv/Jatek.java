package jatekhv;

import java.util.Random;
import java.util.Scanner;

class Jatek {
    Scanner scan = new Scanner(System.in);
    protected Karakter harcos;
    protected Karakter varazslo;

    public Jatek() {

        Random random = new Random();
        int harcosEletero = (random.nextInt(6) + 1) + 3;
        int varazsloEletero = (random.nextInt(6) + 1) + 3;

        harcos = new Harcos(harcosEletero);
        varazslo = new Varazslo(varazsloEletero);
    }

    public void lep() {
        Random random = new Random();
        int harcosLepes = random.nextInt(3);
        int varazsloLepes = random.nextInt(3);

        harcos.lep(harcosLepes);
        varazslo.lep(varazsloLepes);

        if (harcos.getPozicio() == varazslo.getPozicio()) {
            System.out.println(this);
            harcos.harcol(varazslo);
            varazslo.harcol(harcos);
        } else {
            System.out.println(this);
        }
    }

    public void jatek() {
        System.out.print("Kérem adja meg a harcos nevét: ");
        scan.nextLine();
        System.out.print("Kérem adja meg a varázsló nevét: ");
        scan.nextLine();
        System.out.println("-------A játék elindult!-------");

        while (harcos.getEletero() > 0 && varazslo.getEletero() > 0) {
            lep();
            //System.out.println(this);
        }
        //System.out.println(this);

        if (harcos.getEletero() > varazslo.getEletero()) {
            System.out.println("A harcos gyozott!");
        } else if (harcos.getEletero() < varazslo.getEletero()) {
            System.out.println("A varázsló gyozott!");
        } else {
            System.out.println("Döntetlen!");
        }
        System.out.println("-------A játéknak vége!-------");
    }

    @Override
    public String toString() {
        String mezok = "";

        switch (harcos.getPozicio()) {
            case 0:
                switch (varazslo.getPozicio()) {
                    case 0:
                        mezok = "X__";
                        break;
                    case 1:
                        mezok = "HV_";
                        break;
                    case 2:
                        mezok = "H_V";
                        break;
                }
                break;
            case 1:
                switch (varazslo.getPozicio()) {
                    case 0:
                        mezok = "VH_";
                        break;
                    case 1:
                        mezok = "_X_";
                        break;
                    case 2:
                        mezok = "_HV";
                        break;
                }
                break;
            case 2:
                switch (varazslo.getPozicio()) {
                    case 0:
                        mezok = "V_H";
                        break;
                    case 1:
                        mezok = "_VH";
                        break;
                    case 2:
                        mezok = "__X";
                        break;
                }
                break;
        }

        return mezok + " --> H:" + harcos.getEletero() + ", V:" + varazslo.getEletero();

    }
}
