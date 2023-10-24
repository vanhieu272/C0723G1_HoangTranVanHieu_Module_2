package MVC.VehicleManagement.view;

import MVC.VehicleManagement.controller.XeOtoController;
import MVC.VehicleManagement.controller.XeMayController;
import MVC.VehicleManagement.controller.XeTaiController;

import java.util.Scanner;

public class MainApp {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        System.out.println("♥♥♥ Chon phuong tien quan ly ♥♥♥");
        System.out.println("1. Oto");
        System.out.println("2. Xe may");
        System.out.println("3. Xe tai");
        System.out.println("4. Thoat");
        do{
            System.out.println("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
        }while (choice < 1 || choice > 4);
        switch (choice){
            case 1:
                XeOtoController.menuXeOto();
                break;
            case 2:
                XeMayController.menuXeMay();
                break;
            case 3:
                XeTaiController.menuXeTai();
                break;
            case 4:
                System.exit(0);
        }
    }
}
