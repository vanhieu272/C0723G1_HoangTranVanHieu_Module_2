package mvc.service;

import mvc.model.HoaDonDien;
import mvc.repository.HoaDonDienRepoImpl;
import mvc.repository.IHoaDonDienRepo;

import java.util.List;

public class HoaDonDienServiceImpl implements IHoaDonDienService{
    private final IHoaDonDienRepo hoaDonDienRepo = new HoaDonDienRepoImpl();
    @Override
    public void create(HoaDonDien hoaDonDien) {
        hoaDonDienRepo.create(hoaDonDien);
    }

    @Override
    public List<HoaDonDien> getAll() {
        return hoaDonDienRepo.getAll();
    }

}
