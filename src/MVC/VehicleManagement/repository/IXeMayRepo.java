package MVC.VehicleManagement.repository;

import MVC.VehicleManagement.model.XeMay;

import java.util.List;

public interface IXeMayRepo {
    void themMoiXeMay (XeMay xeMay);

    List<XeMay> hienThiXeMay();

    void xoaXeMay(XeMay xeMay);
}
