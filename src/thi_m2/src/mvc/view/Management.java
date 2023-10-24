
package mvc.view;

import mvc.controller.HoaDonDienController;
import mvc.model.HoaDonDien;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Management {
    private final HoaDonDienController hoaDonDienController = new HoaDonDienController();
    private final String regexID = "MHD-[0-9]{4}";
    private final Scanner scanner = new Scanner(System.in);

    public boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public void manage() {
        do {
            showMenu();
            int choice = choiceOption(1, 5);
            switch (choice) {
                case 1:
                    HoaDonDien hoaDonDien = addHoaDon();
                    if (hoaDonDien != null) {
                        hoaDonDienController.create(hoaDonDien);
                        System.out.println("Add successful !!");
                    }
                    break;
                case 2:
                    displayTicket();
                    break;
            }
        }while (true);
    }

    private void showMenu(){
        System.out.println("=====Quan ly hoa don tien dien=====");
        System.out.println("1. Them hoa don");
        System.out.println("2. Hien thi danh sach hoa don");
    }

    private String inputMaHoaDon() {
        String maHoaDon;
        do {
            System.out.println("Nhap ma hoa don(MHD-XXXX): ");
            maHoaDon = scanner.nextLine();
            if (!validate(maHoaDon, regexID)) {
                System.out.println("Ma hoa don khong dung dinh dang. Vui long nhap lai!!");
            } else {
                return maHoaDon;
            }
        } while (true);
    }

    private boolean checkMaHoaDon(String maHoaDon) {
        List<HoaDonDien> hoaDonDiens = hoaDonDienController.getAll();
        for (HoaDonDien hoaDonDien : hoaDonDiens) {
            if (hoaDonDien.getMaHoaDon().equals(maHoaDon)) {
                return true;
            }
        }
        return false;
    }

    private int choiceOption(int low, int high) {
        int choice = 0;
        do {
            try {
                System.out.println("Nhap lua chon: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < low || choice > high) {
                    System.out.println("Khong hop le. Vui long nhap lai!!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Khong hop le !!");
            }
        } while (choice < low || choice > high);
        return choice;
    }

    private String inputTenHoaDon() {
        String tenHoaDon;
        do {
            try {
                System.out.println("Nhap ten KH: ");
                tenHoaDon = scanner.nextLine().trim();
                if(!tenHoaDon.equals("")){
                    return tenHoaDon;
                }else {
                    System.out.println("Ten khong duoc de trong");
                }
            } catch (NullPointerException e) {
                System.out.println("Ten khong the trong");
            }
        } while (true);
    }

    private String chooseType() {

        while (true) {
            System.out.println("Chon loai khach hang: ");
            System.out.println("1. Sinh Hoat");
            System.out.println("2. Kinh Doanh");
            int choice = choiceOption(1, 2);
            switch (choice) {
                case 1:
                    return "Sinh Hoat";
                case 2:
                    return "Kinh Doanh";
            }
        }
    }

    private String inputKW(){
        String dinhMucTieuThu;
        do {
            try {
                System.out.println("Nhap dinh muc tieu thu: ");
                dinhMucTieuThu = scanner.nextLine().trim();
                if(Integer.parseInt(dinhMucTieuThu) < 0){
                    System.out.println("Dinh muc tieu thu khong the < 0");
                }else if(!dinhMucTieuThu.equals("")){
                    return dinhMucTieuThu;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap so nguyen ");
            }
        } while (true);
    }

    private HoaDonDien addHoaDon() {
        String maHoaDon = inputMaHoaDon();
        if (checkMaHoaDon(maHoaDon)) {
            System.out.println("Ma hoa don nay da ton tai");
            return null;
        } else {
            return new HoaDonDien(maHoaDon, inputTenHoaDon(), chooseType(), Integer.parseInt(inputKW()));
        }
    }

    private void displayTicket() {
        List<HoaDonDien> hoaDonDiens = hoaDonDienController.getAll();
            if (hoaDonDiens.isEmpty()) {
            System.out.println("Danh sach dang trong");
        } else {
            for (HoaDonDien hoaDonDien : hoaDonDiens) {
                System.out.println(hoaDonDien);
                System.out.println("Tong tien hoa don: " + hoaDonDien.getDinhMuc() * 2500);
            }

        }
    }
}
