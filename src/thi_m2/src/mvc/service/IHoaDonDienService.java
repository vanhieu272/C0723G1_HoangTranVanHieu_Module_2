package mvc.service;

import mvc.model.HoaDonDien;

import java.util.List;

public interface IHoaDonDienService {

    void create(HoaDonDien hoaDonDien);

    List<HoaDonDien> getAll();
}
