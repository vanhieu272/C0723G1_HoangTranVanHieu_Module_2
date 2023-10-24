package MVC.VehicleManagement.repository;

import MVC.VehicleManagement.model.XeMay;
import MVC.VehicleManagement.model.XeOto;
import MVC.VehicleManagement.model.XeTai;

import java.util.List;

public interface IXeTaiRepo {

    void themMoiXeTai(XeTai xeTai);

    List<XeTai> hienThiXeTai();

    void xoaXeTai(XeTai xeTai);
}
