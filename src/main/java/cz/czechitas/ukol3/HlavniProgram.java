package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Procesor;
import cz.czechitas.ukol3.model.Pocitac;

public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Funguje mi to?");

        Pocitac pocitac = new Pocitac();

        Procesor procesor = new Procesor();
        procesor.setRychlost(3_490_000_000L);
        procesor.setVyrobce("Lenovo");

        Pamet pamet = new Pamet();
        pamet.setKapacita(24_000_000_000L);

        Disk disk = new Disk();
        disk.setKapacita(994_662_584_320L);
        disk.setVyuziteMisto(94_662_584_320L);

        pocitac.setCpu(procesor);
        pocitac.setRam(pamet);
        pocitac.setPevnyDisk(disk);

        System.out.println(pamet);
        System.out.println(disk);
        System.out.println(procesor);
        System.out.println(pocitac);

        pocitac.zapniSe();

        System.out.println("Počítač byl úspěšně zapnut.");
        System.err.println("Chyba při zapínání počítače:");

        pocitac.vytvorSouborOVelikosti(100_000_000L);
        pocitac.vytvorSouborOVelikosti(900_000_000_000L); // Should fail

        pocitac.vymazSouboryOVelikosti(50_000_000L);
        pocitac.vymazSouboryOVelikosti(200_000_000L); // Should not go below 0

        pocitac.vypniSe();
        System.out.println("Počítač byl vypnut.");
    }
}
