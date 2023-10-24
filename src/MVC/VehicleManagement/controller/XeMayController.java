package MVC.VehicleManagement.controller;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement.service.impl.XeMayServices;
import MVC.VehicleManagement.service.impl.XeOtoServices;

import java.util.Scanner;

public class XeMayController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final XeMayServices xeMay = new XeMayServices();

    public static void menuXeMay() {
        HangSanXuat honda = new HangSanXuat("HON", "Honda", "Thai Lan");
        HangSanXuat yamaha = new HangSanXuat("YMH", "Yamaha", "Trung Quoc");
        HangSanXuat ducati = new HangSanXuat("DCT", "Ducati", "Nhat Ban");
        XeMayServices.hangSXXeMay.add(honda);
        XeMayServices.hangSXXeMay.add(ducati);
        XeMayServices.hangSXXeMay.add(yamaha);
        int choice;
        do {
            System.out.println("♥♥♥ MENU QUAN LY XE MAY ♥♥♥");
            System.out.println("1. Them moi");
            System.out.println("2. Hien thi");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem theo bien kiem soat");
            System.out.println("5. Thoat");
            System.out.println("♥ Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    xeMay.themMoi();
                    break;
                case 2:
                    xeMay.hienThi();
                    break;
                case 3:
                    xeMay.xoa();
                    break;
                case 4:
                    xeMay.timKiem();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
