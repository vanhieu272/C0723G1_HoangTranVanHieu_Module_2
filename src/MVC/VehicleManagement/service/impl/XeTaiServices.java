package MVC.VehicleManagement.service.impl;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement.model.XeTai;
import MVC.VehicleManagement.service.IXeTai;

import java.util.ArrayList;
import java.util.Scanner;
public class XeTaiServices implements IXeTai {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<XeTai> xeTaiList = new ArrayList<>();
    public static ArrayList<HangSanXuat> hangSXXeTai = new ArrayList<>();


    @Override
    public void themMoi() {
        XeTai xeTai = nhapThongTin();
        if(xeTai != null){
        xeTaiList.add(xeTai);
        System.out.println("\nThem thanh cong!!");
        System.out.println("Danh sach xe tai sau khi them: ");
        hienThi();
        }else {
            System.out.println("Bien so xe nay da ton tai");
        }
    }

    @Override
    public void hienThi() {
        if(xeTaiList.isEmpty()){
            System.out.println("Danh sach tai dang trong");
        }else {
            for (XeTai xeTai : xeTaiList){
                System.out.println(xeTai);
            }
        }
    }

    @Override
    public void xoa() {
        int choice;
        boolean flag = false;
        if(xeTaiList.isEmpty()){
            System.out.println("Danh sach xe tai dang trong, khong co gi de xoa!!");
        }else {
            System.out.println("Nhap bien kiem soat cua xe tai can xoa: ");
            String bienSoCanXoa = scanner.nextLine();
            for (XeTai xeTai : xeTaiList){
                if(xeTai.getBienKiemSoat().equals(bienSoCanXoa)){
                    System.out.println("Ban co muon xoa xe tai co bien kiem soat la " + bienSoCanXoa + " khong?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        xeTaiList.remove(xeTai);
                        System.out.println("Xoa thanh cong!!");
                        System.out.println("Danh sach xe tai sau khi xoa: ");
                        hienThi();
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println("Khong tim thay bien so xe ban da nhap!!");
            }
        }
    }

    @Override
    public void timKiem() {
        boolean flag = false;
        if (xeTaiList.isEmpty()){
            System.out.println("Danh sach xe tai dang trong, khong co gi de xoa");
        }else {
            System.out.println("Nhap bien kiem soat xe tai ban muon tim: ");
            String bienKiemSoatCanTim = scanner.nextLine();
            for(XeTai xeTai : xeTaiList){
                if (xeTai.getBienKiemSoat().equals(bienKiemSoatCanTim)){
                    System.out.println("Xe tai ban tim kiem: " + xeTai);
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println("Khong tim thay bien so xe can tim trong danh sach!!");
            }
        }
    }

    @Override
    public void themMaHangSanXuat(HangSanXuat hangSX) {
        hangSXXeTai.add(hangSX);
    }

    public XeTai nhapThongTin() {
        boolean flag_bienKiemSoat = true;
        boolean flag_maHangSanXuat = false;
        String maHangSanXuat;
        String tenHangSanXuat = null;
        int namSanXuat = 0;
        String chuSoHuu = null;
        int trongTai = 0;
        System.out.println("Nhap bien kiem soat: ");
        String bienKiemSoat = scanner.nextLine();
        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().equals(bienKiemSoat)) {
                flag_bienKiemSoat = false;
                break;
            }
        }
        if (flag_bienKiemSoat) {
            System.out.println("Nhap ma hang san xuat (HNO, ISU, FSO): ");
            maHangSanXuat = scanner.nextLine();
            for (HangSanXuat maHangSX : hangSXXeTai) {
                if (maHangSX.getMaHangSanXuat().equals(maHangSanXuat)) {
                    flag_maHangSanXuat = true;
                    tenHangSanXuat = maHangSX.getTenHangSanXuat();
                    break;
                }
            }
            if(!flag_maHangSanXuat){
                return null;
            }
            System.out.println("Nhap nam san xuat: ");
            namSanXuat = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap chu so huu: ");
            chuSoHuu = scanner.nextLine();
            System.out.println("Nhap so cho ngoi: ");
            trongTai = Integer.parseInt(scanner.nextLine());
            return new XeTai(bienKiemSoat, tenHangSanXuat,namSanXuat,chuSoHuu,trongTai);
        }else {
            return null;
        }

    }
}
