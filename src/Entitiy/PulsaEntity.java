package Entitiy;

import Utility.NumericString;

public class PulsaEntity extends TransaksiEntity {
    private VoucherPulsaEntitiy vcrPulsa;
    private String kodeVcr;
    private int nominalPulsaPurchase;
    public PulsaEntity(VoucherPulsaEntitiy vcrPulsa, int totalPayment) {
        super("Pembelian pulsa", vcrPulsa.getHarga(), totalPayment);
        this.vcrPulsa = vcrPulsa;
        this.kodeVcr = NumericString.generate(16);
        this.nominalPulsaPurchase = vcrPulsa.getHarga();
    }

    @Override
    public int getNominalHarga() {
        return nominalPulsaPurchase;
    }

    public VoucherPulsaEntitiy getVcrPulsa() {
        return vcrPulsa;
    }

    public void setVcrPulsa(VoucherPulsaEntitiy vcrPulsa) {
        this.vcrPulsa = vcrPulsa;
    }

    public String getKodeVcr() {
        return kodeVcr;
    }

    public void setKodeVcr(String kodeVcr) {
        this.kodeVcr = kodeVcr;
    }
}
