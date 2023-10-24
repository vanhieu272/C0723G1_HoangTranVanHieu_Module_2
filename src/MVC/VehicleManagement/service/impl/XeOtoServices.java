package MVC.VehicleManagement.service.impl;

import java.util.ArrayList;
import java.util.Scanner;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement.model.XeOto;
import MVC.VehicleManagement.service.IXeOto;


public class XeOtoServices implements IXeOto {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<XeOto> xeOtoList = new ArrayList<>();
    public static ArrayList<HangSanXuat> hangSXXeOto = new ArrayList<>();


    @Override
    public void themMoi() {
        XeOto xeOto = nhapThongTin();
        if (xeOto != null) {
            xeOtoList.add(xeOto);
            System.out.println("\nThem thanh cong!!");
            System.out.println("Danh sach xe oto sau khi them: ");
            hienThi();
        } else {
            System.out.println("Bien so xe nay da ton tai");
        }
    }

    @Override
    public void hienThi() {
        if (xeOtoList.isEmpty()) {
            System.out.println("Danh sach oto dang trong");
        } else {
            for (XeOto oto : xeOtoList) {
                System.out.println(oto);
            }
        }
    }

    @Override
    public void xoa() {
        int choice;
        boolean flag = false;
        if (xeOtoList.isEmpty()) {
            System.out.println("Danh sach xe oto dang trong, khong co gi de xoa!!");
        } else {
            System.out.println("Nhap bien kiem soat cua xe oto can xoa: ");
            String bienSoCanXoa = scanner.nextLine();
            for (XeOto oto : xeOtoList) {
                if (oto.getBienKiemSoat().equals(bienSoCanXoa)) {
                    System.out.println("Ban co muon xoa xe oto co bien kiem soat la " + bienSoCanXoa + " khong?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                        xeOtoList.remove(oto);
                        System.out.println("Xoa thanh cong!!");
                        System.out.println("Danh sach oto sau khi xoa: ");
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
        if (xeOtoList.isEmpty()) {
            System.out.println("Danh sach xe oto dang trong, khong co gi de xoa");
        } else {
            System.out.println("Nhap bien kiem soat xe oto ban muon tim: ");
            String bienKiemSoatCanTim = scanner.nextLine();
            for (XeOto oto : xeOtoList) {
                if (oto.getBienKiemSoat().equals(bienKiemSoatCanTim)) {
                    System.out.println("Xe oto ban tim kiem: " + oto);
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
    public void themMaHangSanXuat(HangSanXuat hangSX) {
        hangSXXeOto.add(hangSX);
    }

    public XeOto nhapThongTin() {
        boolean flag_bienKiemSoat = true;
        boolean flag_maHangSanXuat = false;
        String maHangSanXuat;
        String tenHangSanXuat = null;
        int namSanXuat = 0;
        String chuSoHuu = null;
        int soChoNgoi = 0;
        String kieuXe = null;
        System.out.println("Nhap bien kiem soat: ");
        String bienKiemSoat = scanner.nextLine();
        for (XeOto oto : xeOtoList) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                flag_bienKiemSoat = false;
                break;
            }
        }
        if (flag_bienKiemSoat) {
            System.out.println("Nhap ma hang san xuat (HYD, SZK, VNF): ");
            maHangSanXuat = scanner.nextLine();
            for (HangSanXuat maHangSX : hangSXXeOto) {
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
            System.out.println("Nhap so cho ngoi: ");
            soChoNgoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap kieu xe: ");
            kieuXe = scanner.nextLine();
            return new XeOto(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        } else {
            return null;
        }

    }
}
