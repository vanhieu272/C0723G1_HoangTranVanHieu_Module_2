package mvc.repository;

import mvc.model.HoaDonDien;

import java.util.List;

public interface IHoaDonDienRepo {
    void create(HoaDonDien hoaDonDiens);

    List<HoaDonDien> getAll();
}
