package MVC.VehicleManagement.service.impl;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement.model.XeMay;
import MVC.VehicleManagement.service.IXeMay;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayServices implements IXeMay {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<XeMay> xeMayList = new ArrayList<>();
    public static ArrayList<HangSanXuat> hangSXXeMay = new ArrayList<>();

    @Override
    public void themMoi() {
        XeMay xeMay = nhapThongTin();
        if (xeMay != null) {
            xeMayList.add(xeMay);
            System.out.println("\nThem thanh cong!!");
            System.out.println("Danh sach xe oto sau khi them: ");
            hienThi();
        } else {
            System.out.println("Bien so xe nay da ton tai");
        }
    }

    @Override
    public void hienThi() {
        if (xeMayList.isEmpty()) {
            System.out.println("Danh sach oto dang trong");
        } else {
            for (XeMay xeMay : xeMayList) {
                System.out.println(xeMay);
            }
        }
    }

    @Override
    public void xoa() {
        int choice;
        boolean flag = false;
        if (xeMayList.isEmpty()) {
            System.out.println("Danh sach xe may dang trong, khong co gi de xoa!!");
        } else {
            System.out.println("Nhap bien kiem soat cua xe may can xoa: ");
            String bienSoCanXoa = scanner.nextLine();
            for (XeMay xeMay : xeMayList) {
                if (xeMay.getBienKiemSoat().equals(bienSoCanXoa)) {
                    System.out.println("Ban co muon xoa xe may co bien kiem soat la " + bienSoCanXoa + " khong?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        xeMayList.remove(xeMay);
                        System.out.println("Xoa thanh cong!!");
                        System.out.println("Danh sach xe may sau khi xoa: ");
                        hienThi();
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Khong tim thay bien so xe ban da nhap!!");
            }
        }
    }

    @Override
    public void timKiem() {
        boolean flag = false;
        if (xeMayList.isEmpty()) {
            System.out.println("Danh sach xe may dang trong, khong co gi de xoa");
        } else {
            System.out.println("Nhap bien kiem soat xe may ban muon tim: ");
            String bienKiemSoatCanTim = scanner.nextLine();
            for (XeMay xeMay : xeMayList) {
                if (xeMay.getBienKiemSoat().equals(bienKiemSoatCanTim)) {
                    System.out.println("Xe may ban tim kiem: " + xeMay);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Khong tim thay bien so xe can tim trong danh sach!!");
            }
        }
    }

    @Override
    public void themMaHangSanXuat(HangSanXuat hangSx) {

    }

    public XeMay nhapThongTin() {
        boolean flag_bienKiemSoat = true;
        boolean flag_maHangSanXuat = false;
        String maHangSanXuat;
        String tenHangSanXuat = null;
        int namSanXuat = 0;
        String chuSoHuu = null;
        int congSuat = 0;
        System.out.println("Nhap bien kiem soat: ");
        String bienKiemSoat = scanner.nextLine();
        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienKiemSoat().equals(bienKiemSoat)) {
                flag_bienKiemSoat = false;
                break;
            }
        }
        if (flag_bienKiemSoat) {
            System.out.println("Nhap ma hang san xuat (HON, YMH, SZK): ");
            maHangSanXuat = scanner.nextLine();
            for (HangSanXuat maHangSX : hangSXXeMay) {
                if (maHangSX.getMaHangSanXuat().equals(maHangSanXuat)) {
                    flag_maHangSanXuat = true;
                    tenHangSanXuat = maHangSX.getTenHangSanXuat();
                    break;
                }
            }
            if (!flag_maHangSanXuat) {
                return null;
            }
            System.out.println("Nhap nam san xuat: ");
            namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap chu so huu: ");
            chuSoHuu = scanner.nextLine();
            System.out.println("Nhap cong suat: ");
            congSuat = Integer.parseInt(scanner.nextLine());
            return new XeMay(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, congSuat);
        } else {
            return null;
        }

    }
}
