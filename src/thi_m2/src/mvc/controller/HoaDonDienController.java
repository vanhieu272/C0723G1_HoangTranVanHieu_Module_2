
package mvc.controller;

import mvc.model.HoaDonDien;
import mvc.service.HoaDonDienServiceImpl;
import mvc.service.IHoaDonDienService;

import java.util.List;

public class HoaDonDienController {

    private final IHoaDonDienService hoaDonDienService = new HoaDonDienServiceImpl();

    public void create(HoaDonDien hoaDonDien) {
        hoaDonDienService.create(hoaDonDien);
    }

    public List<HoaDonDien> getAll() {
        return hoaDonDienService.getAll();
    }
}
