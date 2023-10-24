package MVC.VehicleManagement.repository.impl;

import MVC.VehicleManagement.model.XeOto;
import MVC.VehicleManagement.repository.IXeOtoRepo;

import java.util.ArrayList;
import java.util.List;

public class XeOtoRepoImpl implements IXeOtoRepo {
    ArrayList<XeOto> xeOtoList = new ArrayList<>();

    @Override
    public void themMoiOto(XeOto oto) {
        xeOtoList.add(oto);
    }

    @Override
    public List<XeOto> hienThiXeOto() {
        return xeOtoList;
    }

    @Override
    public void xoaXeOto(XeOto oto) {
        xeOtoList.remove(oto);
    }
}
