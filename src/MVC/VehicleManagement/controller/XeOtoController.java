package MVC.VehicleManagement.controller;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement.service.impl.XeOtoServices;


import java.util.Scanner;

public class XeOtoController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final XeOtoServices oto = new XeOtoServices();


    public static void menuXeOto() {
        HangSanXuat hyundai = new HangSanXuat("HYD", "HyunDai", "Trung Quoc");
        HangSanXuat suzuki = new HangSanXuat("SZK", "Suzuki", "Nhat Ban");
        HangSanXuat vinfast = new HangSanXuat("VNF", "Vinfast", "Viet Nam");
        XeOtoServices.hangSXXeOto.add(hyundai);
        XeOtoServices.hangSXXeOto.add(suzuki);
        XeOtoServices.hangSXXeOto.add(vinfast);
        int choice;
        do {
            System.out.println("♥♥♥ MENU QUAN LY OTO ♥♥♥");
            System.out.println("1. Them moi");
            System.out.println("2. Hien thi");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem theo bien kiem soat");
            System.out.println("5. Thoat");
            System.out.println("♥ Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    oto.themMoi();
                    break;
                case 2:
                    oto.hienThi();
                    break;
                case 3:
                    oto.xoa();
                    break;
                case 4:
                    oto.timKiem();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
