package Entitiy;

public class TopUpEntity extends TransaksiEntity {
    int nominalTopup;

    public TopUpEntity(int nominalTopup) {
        super("Top Up", nominalTopup, nominalTopup);
        this.nominalTopup = nominalTopup;
    }

    @Override
    public int getNominalHarga() {
        return nominalTopup;
    }
}
