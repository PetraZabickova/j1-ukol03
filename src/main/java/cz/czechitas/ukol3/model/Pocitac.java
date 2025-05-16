package cz.czechitas.ukol3.model;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public void zapniSe() {
        if (cpu == null || ram == null || pevnyDisk == null) {
            throw new IllegalStateException("Počítač nemá všechny povinné součásti.");
        }
        if (jeZapnuty) {
            throw new IllegalStateException("Počítač už je zapnutý.");
        }
        jeZapnuty = true;
    }

    public void vypniSe() {
        jeZapnuty = false;
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty) {
            throw new IllegalStateException("Počítač není zapnutý.");
        }
        if (pevnyDisk.getVyuziteMisto() + velikost > pevnyDisk.getKapacita()) {
            System.err.println("Chyba: Soubor o velikosti " + velikost + " bajtů se nevejde na disk.");
            return;
        }

        long noveVyuziti = pevnyDisk.getVyuziteMisto() + velikost;

        pevnyDisk.setVyuziteMisto(noveVyuziti);
        System.out.println("Soubor o velikosti " + velikost + " bajtů byl vytvořen.");
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (!jeZapnuty) {
            throw new IllegalStateException("Počítač není zapnutý.");
        }

        long aktualniVyuziti = pevnyDisk.getVyuziteMisto();

        pevnyDisk.setVyuziteMisto(aktualniVyuziti - velikost);
        System.out.println("Soubory o velikosti " + velikost + " bajtů byly smazány.");
    }


    public String toString() {
        return "Pocitac{" + "jeZapnuty=" + jeZapnuty + ", cpu=" + cpu + ", ram=" + ram + ", pevnyDisk=" + pevnyDisk + '}';
    }
}
