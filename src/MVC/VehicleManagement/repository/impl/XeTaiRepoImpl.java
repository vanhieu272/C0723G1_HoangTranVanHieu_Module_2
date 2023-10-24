package MVC.VehicleManagement.repository.impl;

import MVC.VehicleManagement.model.XeMay;
import MVC.VehicleManagement.model.XeTai;
import MVC.VehicleManagement.repository.IXeTaiRepo;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepoImpl implements IXeTaiRepo {
    ArrayList<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void themMoiXeTai(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public List<XeTai> hienThiXeTai() {
        return xeTaiList;
    }

    @Override
    public void xoaXeTai(XeTai xeTai) {
        xeTaiList.remove(xeTai);
    }
}
