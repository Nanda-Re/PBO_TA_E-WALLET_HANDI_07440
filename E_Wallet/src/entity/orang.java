package entity;

public class orang {
    protected String nama,alamat,ttl;
    public orang(String[] nama, String alamat, String ttl)
    {
        this.nama= String.valueOf(nama);
        this.alamat=alamat;
        this.ttl=ttl;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
    public String getTtl() {
        return ttl;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return alamat;
    }
}