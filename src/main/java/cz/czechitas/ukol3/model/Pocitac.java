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


    public String toString() {
        return "Pocitac{" + "jeZapnuty=" + jeZapnuty + ", cpu=" + cpu + ", ram=" + ram + ", pevnyDisk=" + pevnyDisk + '}';
    }
}
