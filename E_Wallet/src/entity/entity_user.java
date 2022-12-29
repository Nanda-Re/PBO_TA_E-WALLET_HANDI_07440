package entity;
public class entity_user extends orang {
    public entity_user(String nama, String alamat, String ttl) {
        super(new String[]{nama}, alamat, ttl);
    }
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    @Override
    public String getNama() {
        return super.getNama();
    }
    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }
    @Override
    public String getAlamat() {
        return super.getAlamat();
    }
    @Override
    public void setTtl(String ttl) {
        super.setTtl(ttl);
    }
    @Override
    public String getTtl() {
        return super.getTtl();
    }
}