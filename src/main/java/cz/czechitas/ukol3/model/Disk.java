package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacita;
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if (vyuziteMisto > kapacita) {
            throw new IllegalArgumentException("Využité místo nemůže být větší než kapacita disku.");
        }
        this.vyuziteMisto = vyuziteMisto;
    }

    public boolean plnyDisk() {
        return kapacita > 0 && vyuziteMisto >= kapacita;
    }


    public String toString() {
        return "Disk{" + "kapacita=" + kapacita + " B, " + "vyuziteMisto=" + vyuziteMisto + "B, " + "plnyDisk=" + plnyDisk() + '}';
    }
}
