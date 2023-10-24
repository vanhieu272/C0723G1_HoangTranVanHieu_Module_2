package MVC.VehicleManagement.repository;

import MVC.VehicleManagement.model.XeOto;

import java.util.List;

public interface IXeOtoRepo {
    void themMoiOto(XeOto oto);

    List<XeOto> hienThiXeOto();

    void xoaXeOto(XeOto oto);
}
