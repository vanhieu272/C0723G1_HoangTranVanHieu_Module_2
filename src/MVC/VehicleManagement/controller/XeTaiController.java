package MVC.VehicleManagement.controller;

import MVC.VehicleManagement.model.HangSanXuat;
import MVC.VehicleManagement.service.impl.XeTaiServices;
import java.util.Scanner;

public class XeTaiController {
    private static final Scanner scanner = new Scanner(System.in);

    private static final XeTaiServices xeTai = new XeTaiServices();

    public static void menuXeTai(){
        HangSanXuat hino = new HangSanXuat("HNO", "HINO", "Trung Quoc");
        HangSanXuat isuzu = new HangSanXuat("ISZ", "ISUZU", "Nhat Ban");
        HangSanXuat fuso = new HangSanXuat("FSO", "FUSO", "Viet Nam");
        XeTaiServices.hangSXXeTai.add(hino);
        XeTaiServices.hangSXXeTai.add(isuzu);
        XeTaiServices.hangSXXeTai.add(fuso);
        int choice;
        do {
            System.out.println("♥♥♥ MENU QUAN LY XE TAI ♥♥♥");
            System.out.println("1. Them moi");
            System.out.println("2. Hien thi");
            System.out.println("3. Xoa");
            System.out.println("4. Tim kiem theo bien kiem soat");
            System.out.println("5. Thoat");
            System.out.println("♥ Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    xeTai.themMoi();
                    break;
                case 2:
                    xeTai.hienThi();
                    break;
                case 3:
                    xeTai.xoa();
                    break;
                case 4:
                    xeTai.timKiem();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }
}
