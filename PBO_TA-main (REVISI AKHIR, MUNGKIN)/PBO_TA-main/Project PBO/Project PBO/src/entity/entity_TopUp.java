package entity;

public class entity_TopUp {
    String nama_TopUp, jenis;
    int harga;
    public entity_TopUp(String nama_Topup, String jenis, int harga)
    {
        this.harga=harga;
        this.nama_TopUp= nama_Topup;
        this.jenis=jenis;
    }

    public String getNama_TopUp() {
        return nama_TopUp;
    }

    public String getJenis() {
        return jenis;
    }

    public int getHarga() {
        return harga;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNama_TopUp(String nama_TopUp) {
        this.nama_TopUp = nama_TopUp;
    }

}
