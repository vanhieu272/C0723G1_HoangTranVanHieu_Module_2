package MVC.VehicleManagement.repository.impl;

import MVC.VehicleManagement.model.XeMay;
import MVC.VehicleManagement.repository.IXeMayRepo;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepoImpl implements IXeMayRepo {
    ArrayList<XeMay> xeMayList = new ArrayList<>();


    @Override
    public void themMoiXeMay(XeMay xeMay) {
        xeMayList.add(xeMay);
    }

    @Override
    public List<XeMay> hienThiXeMay() {
        return xeMayList;
    }

    @Override
    public void xoaXeMay(XeMay xeMay) {
        xeMayList.remove(xeMay);
    }
}
