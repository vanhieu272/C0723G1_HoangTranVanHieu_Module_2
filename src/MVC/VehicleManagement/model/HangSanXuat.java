package MVC.VehicleManagement.model;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHangSanXuat;
    private String quocGia;

    public HangSanXuat(String maHangSanXuat, String tenHangSanXuat, String quocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.quocGia = quocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "Hang san xuat: " + tenHangSanXuat + ", Ma so hang: " + maHangSanXuat
                + ", Quoc gia: " + quocGia;
    }
}
