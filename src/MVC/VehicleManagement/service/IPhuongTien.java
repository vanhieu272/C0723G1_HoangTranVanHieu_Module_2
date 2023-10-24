package MVC.VehicleManagement.service;

import MVC.VehicleManagement.model.HangSanXuat;

public interface IPhuongTien {
    void themMoi();
    void hienThi();
    void xoa();
    void timKiem();
    void themMaHangSanXuat(HangSanXuat hangSx);
}
