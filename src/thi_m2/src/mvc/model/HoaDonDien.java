package mvc.model;

public class HoaDonDien {
    String maHoaDon;
    String hoTenKH;
    String type;
    int dinhMuc;

    public HoaDonDien(String maHoaDon, String hoTenKH, String type, int dinhMuc) {
        this.maHoaDon = maHoaDon;
        this.hoTenKH = hoTenKH;
        this.type = type;
        this.dinhMuc = dinhMuc;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getHoTenKH() {
        return hoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        this.hoTenKH = hoTenKH;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDinhMuc() {
        return dinhMuc;
    }

    public void setDinhMuc(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "HoaDonDien{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", hoTenKH='" + hoTenKH + '\'' +
                ", loaiKH='" + type + '\'' +
                ", dinhMuc=" + dinhMuc +
                '}';
    }
}
