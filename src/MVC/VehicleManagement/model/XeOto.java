package MVC.VehicleManagement.model;

public class XeOto extends AbsPhuongTien{
    private int soChoNgoi;
    private String kieuXe;

    public XeOto(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public XeOto(String bienKiemSoat, String tenHangSanXuat,
                 int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Xe Oto {" + super.toString()
                + ", so cho ngoi: " + soChoNgoi
                + ", kieu xe: " + kieuXe
                + "}";
    }
}
