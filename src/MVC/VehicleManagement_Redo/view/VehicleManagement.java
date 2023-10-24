package MVC.VehicleManagement_Redo.view;

import MVC.VehicleManagement_Redo.controller.CarController;
import MVC.VehicleManagement_Redo.controller.MotorController;
import MVC.VehicleManagement_Redo.controller.TruckController;
import MVC.VehicleManagement_Redo.model.Car;
import MVC.VehicleManagement_Redo.model.Manufacturer;
import MVC.VehicleManagement_Redo.model.Motor;
import MVC.VehicleManagement_Redo.model.Truck;

import java.util.Scanner;

public class VehicleManagement {
    private final Scanner scanner = new Scanner(System.in);
    private final CarController carController = new CarController();
    private final MotorController motorController = new MotorController();

    private final TruckController truckController = new TruckController();
    Manufacturer mercedes = new Manufacturer("MRC", "Mercedes", "Hoa Kỳ");
    Manufacturer chevrolet = new Manufacturer("CHV", "Chevrolet", "Anh");
    Manufacturer vinfast = new Manufacturer("VNF", "Vinfast", "Việt Nam");

    Manufacturer honda = new Manufacturer("HON", "Honda", "Nhật Bản");
    Manufacturer yamaha = new Manufacturer("YMH", "Yamaha", "Đức");
    Manufacturer airblade = new Manufacturer("AB", "Air Blade", "Trung Quốc");

    Manufacturer hyundai = new Manufacturer("HYD", "Hyundai", "Trung Quốc");
    Manufacturer isuzu = new Manufacturer("ISZ", "Isuzu", "Nhật Bản");
    Manufacturer fuso = new Manufacturer("FSO", "Fuso", "Singapore");
    public void manage() {
        carController.addManufacturer(mercedes);
        carController.addManufacturer(chevrolet);
        carController.addManufacturer(vinfast);

        motorController.addManufacturer(honda);
        motorController.addManufacturer(yamaha);
        motorController.addManufacturer(airblade);

        truckController.addManufacturer(hyundai);
        truckController.addManufacturer(isuzu);
        truckController.addManufacturer(fuso);
        do {
            showMainMenu();
            int choice;
            do {
                System.out.println("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 5) {
                    System.out.println("Lựa chọn không hợp lệ");
                } else {
                    break;
                }
            } while (true);

            switch (choice) {
                case 1:
                    showMenuVehicle();
                    int choice_sub1 = chooseVehicle();
                    switch (choice_sub1) {
                        case 1:
                            Car newCar = inputNewCarInfor();
                            carController.add(newCar);
                            displayCar();
                            break;
                        case 2:
                            Motor newMotor = inputNewMotorInfor();
                            motorController.add(newMotor);
                            displayMotor();
                            break;
                        case 3:
                            Truck newTruck = inputNewTruckInfor();
                            truckController.add(newTruck);
                            displayTruck();
                            break;
                    }
                    break;
                case 2:
                    showMenuVehicle();
                    int choice_sub2 = chooseVehicle();
                    switch (choice_sub2) {
                        case 1:
                            displayCar();
                            break;
                        case 2:
                            displayMotor();
                            break;
                        case 3:
                            displayTruck();
                    }
                    break;
                case 3:
                    showMenuVehicle();
                    int choice_sub3 = chooseVehicle();
                    switch (choice_sub3) {
                        case 1:
                            System.out.println("Nhập biển kiểm soát của xe ô tô muốn xoá: ");
                            String licensePlateCar = scanner.nextLine();
                            removeCar(licensePlateCar);
                            break;
                        case 2:
                            System.out.println("Nhập biển kiểm soát của xe máy muốn xoá: ");
                            String licensePlateMotor = scanner.nextLine();
                            removeMotor(licensePlateMotor);
                            break;
                        case 3:
                            System.out.println("Nhập biển kiểm soát của xe tải muốn xoá: ");
                            String licensePlateTruck = scanner.nextLine();
                            removeTruck(licensePlateTruck);
                            break;
                    }
                    break;
                case 4:
                    showMenuVehicle();
                    int choice_sub4 = chooseVehicle();
                    switch (choice_sub4){
                        case 1:
                            System.out.println("Nhập biển kiểm soát của xe ô tô muốn tìm kiếm: ");
                            String licensePlateCar = scanner.nextLine();
                            findCarByLicense(licensePlateCar);
                            break;
                        case 2:
                            System.out.println("Nhập biển kiểm soát của xe máy muốn tìm kiếm: ");
                            String licensePlateMotor = scanner.nextLine();
                            findMotorByLicense(licensePlateMotor);
                            break;
                        case 3:
                            System.out.println("Nhập biển kiểm soát của xe tải muốn tìm kiếm: ");
                            String licensePlateTruck = scanner.nextLine();
                            findTruckByLicense(licensePlateTruck);
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

    public int chooseVehicle() {
        int choice_sub;
        do {
            System.out.println("Nhập lựa chọn của bạn: ");
            choice_sub = Integer.parseInt(scanner.nextLine());
            if (choice_sub < 1 || choice_sub > 3) {
                System.out.println("Lựa chọn không hợp lệ");
            } else {
                break;
            }
        } while (true);
        return choice_sub;
    }

    public void showMainMenu() {
        System.out.println("►►►►► MENU QUẢN LÝ PHƯƠNG TIỆN ◄◄◄◄◄");
        System.out.println("1 ► Thêm mới phương tiện");
        System.out.println("2 ► Hiển thị phương tiện");
        System.out.println("3 ► Xoá phương tiện");
        System.out.println("4 ► Tìm kiếm theo biển kiểm soát");
        System.out.println("5 ► Thoát");
    }

    public void showMenuVehicle() {
        System.out.println("►►►►► MENU LỰA CHỌN PHƯƠNG TIỆN ◄◄◄◄◄");
        System.out.println("1 ► Xe ôtô");
        System.out.println("2 ► Xe máy");
        System.out.println("3 ► Xe tải");
        System.out.println("4 ► Trở về");
    }

    public String inputLicensePlate() {
        System.out.println("Nhập biển kiểm soát: ");
        return scanner.nextLine();
    }

    /*********************************************************************************************/
    public boolean checkCarLicensePlate(String licensePlate) {
        for (Car car : carController.display()) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }

    public Car inputNewCarInfor() {
        String licensePlate;
        Manufacturer manufacturer;
        String owner;
        int manufactureYear;
        int seats;
        String typeOfCar;
        /* ID */
        do {
            licensePlate = inputLicensePlate();
            if (checkCarLicensePlate(licensePlate)) {
                System.out.println("ID bạn vừa nhập đã tồn tại. Vui lòng nhập lại ID khác!!");
            } else {
                break;
            }
        } while (true);

        /* Manufacturer */
        manufacturer = setManufacturerCar();

        /* Manufacture Year */
        System.out.println("Nhập năm sản xuất: ");
        manufactureYear = Integer.parseInt(scanner.nextLine());

        /* Owner */
        System.out.println("Nhập chủ sở hữu: ");
        owner = scanner.nextLine();

        /* Seats */
        System.out.println("Nhập số chỗ ngồi: ");
        seats = Integer.parseInt(scanner.nextLine());

        /* Type of Car */
        System.out.println("Nhập loại xe: ");
        typeOfCar = scanner.nextLine();

        return new Car(licensePlate, manufacturer, manufactureYear, owner, seats, typeOfCar);
    }

    public Manufacturer setManufacturerCar() {
        Manufacturer manufacturer;
        System.out.println("► Hãng sản xuất ◄");
        System.out.println("1 ► Mercedes");
        System.out.println("2 ► Chevrolet");
        System.out.println("3 ► Vinfast");
        do {
            System.out.println("► Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice > 3 || choice < 1) {
                System.out.println("Vui lòng nhập lựa chọn hợp lệ!!");
            } else if (choice == 1) {
                manufacturer = carController.displayManufacturerList().get(0);
                break;
            } else if (choice == 2) {
                manufacturer = carController.displayManufacturerList().get(1);
                break;
            } else {
                manufacturer = carController.displayManufacturerList().get(2);
                break;
            }
        } while (true);
        return manufacturer;
    }

    public void displayCar() {
        if (carController.display().isEmpty()) {
            System.out.println("Danh sách xe ô tô đang trống!!");
            return;
        }
        for (Car car : carController.display()) {
            System.out.println(car);
        }
    }

    public void removeCar(String licensePlate) {
        if (carController.display().isEmpty()) {
            System.out.println("Danh sách xe ô tô đang trống!!");
            return;
        }
        for (Car car : carController.display()) {
            if (car.getLicensePlate().equals(licensePlate)) {
                carController.display().remove(car);
                System.out.println("Đã xoá thành công xe ô tô có biển kiểm soát " + licensePlate);
                return;
            }
            System.out.println("Không tìm thấy xe ô tô có biển kiểm soát " + licensePlate);

        }
    }

    public void findCarByLicense(String licensePlate){
        if (carController.display().isEmpty()) {
            System.out.println("Danh sách xe ô tô đang trống!!");
            return;
        }
        for(Car car : carController.display()){
            if(car.getLicensePlate().equals(licensePlate)){
                System.out.println("Tìm thấy xe ô tô có biển kiểm soát " + licensePlate);
                System.out.println(car);
                return;
            }
            System.out.println("Không tìm thấy xe ô tô có biển kiểm soát " + licensePlate);

        }
    }
    /***********************************************************************************************/

    public boolean checkMotorLicensePlate(String licensePlate) {
        for (Motor motor : motorController.display()) {
            if (motor.getLicensePlate().equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }

    public Motor inputNewMotorInfor() {
        String licensePlate;
        Manufacturer manufacturer;
        String owner;
        int manufactureYear;
        int wattage;
        /* ID */
        do {
            licensePlate = inputLicensePlate();
            if (checkMotorLicensePlate(licensePlate)) {
                System.out.println("ID bạn vừa nhập đã tồn tại. Vui lòng nhập lại ID khác!!");
            } else {
                break;
            }
        } while (true);

        /* Manufacturer */
        manufacturer = setManufacturerMotor();

        /* Manufacture Year */
        System.out.println("Nhập năm sản xuất: ");
        manufactureYear = Integer.parseInt(scanner.nextLine());

        /* Owner */
        System.out.println("Nhập chủ sở hữu: ");
        owner = scanner.nextLine();

        /* Wattage */
        System.out.println("Nhập công suất xe: ");
        wattage =Integer.parseInt( scanner.nextLine());

        return new Motor(licensePlate, manufacturer, manufactureYear, owner, wattage);
    }

    public Manufacturer setManufacturerMotor() {
        Manufacturer manufacturer;
        System.out.println("► Hãng sản xuất ◄");
        System.out.println("1 ► Honda");
        System.out.println("2 ► Yamaha");
        System.out.println("3 ► Air blade");
        do {
            System.out.println("► Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice > 3 || choice < 1) {
                System.out.println("Vui lòng nhập lựa chọn hợp lệ!!");
            } else if (choice == 1) {
                manufacturer = motorController.displayManufacturerList().get(0);
                break;
            } else if (choice == 2) {
                manufacturer = motorController.displayManufacturerList().get(1);
                break;
            } else {
                manufacturer = motorController.displayManufacturerList().get(2);
                break;
            }
        } while (true);
        return manufacturer;
    }

    public void displayMotor() {
        if (motorController.display().isEmpty()) {
            System.out.println("Danh sách xe máy đang trống!!");
            return;
        }
        for (Motor motor : motorController.display()) {
            System.out.println(motor);
        }
    }

    public void removeMotor(String licensePlate) {
        if (motorController.display().isEmpty()) {
            System.out.println("Danh sách xe ô tô đang trống!!");
            return;
        }
        for (Motor motor : motorController.display()) {
            if (motor.getLicensePlate().equals(licensePlate)) {
                motorController.display().remove(motor);
                System.out.println("Đã xoá thành công xe máy có biển kiểm soát " + licensePlate);
                return;
            }
            System.out.println("Không tìm thấy xe máy có biển kiểm soát " + licensePlate);

        }
    }

    public void findMotorByLicense(String licensePlate){
        if (motorController.display().isEmpty()) {
            System.out.println("Danh sách xe máy đang trống!!");
            return;
        }
        for(Motor motor : motorController.display()){
            if(motor.getLicensePlate().equals(licensePlate)){
                System.out.println("Tìm thấy xe máy có biển kiểm soát " + licensePlate);
                System.out.println(motor);
                return;
            }
            System.out.println("Không tìm thấy xe máy có biển kiểm soát " + licensePlate);

        }
    }
    /***********************************************************************************************/
    public boolean checkTruckLicensePlate(String licensePlate) {
        for (Truck truck : truckController.display()) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return true;
            }
        }
        return false;
    }

    public Truck inputNewTruckInfor() {
        String licensePlate;
        Manufacturer manufacturer;
        String owner;
        int manufactureYear;
        int tonnage;
        /* ID */
        do {
            licensePlate = inputLicensePlate();
            if (checkTruckLicensePlate(licensePlate)) {
                System.out.println("ID bạn vừa nhập đã tồn tại. Vui lòng nhập lại ID khác!!");
            } else {
                break;
            }
        } while (true);

        /* Manufacturer */
        manufacturer = setManufacturerTruck();

        /* Manufacture Year */
        System.out.println("Nhập năm sản xuất: ");
        manufactureYear = Integer.parseInt(scanner.nextLine());

        /* Owner */
        System.out.println("Nhập chủ sở hữu: ");
        owner = scanner.nextLine();

        /* Tonnage */
        System.out.println("Nhập công suất xe: ");
        tonnage =Integer.parseInt( scanner.nextLine());

        return new Truck(licensePlate, manufacturer, manufactureYear, owner, tonnage);
    }

    public Manufacturer setManufacturerTruck() {
        Manufacturer manufacturer;
        System.out.println("► Hãng sản xuất ◄");
        System.out.println("1 ► Hyundai");
        System.out.println("2 ► Isuzu");
        System.out.println("3 ► Fuso");
        do {
            System.out.println("► Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice > 3 || choice < 1) {
                System.out.println("Vui lòng nhập lựa chọn hợp lệ!!");
            } else if (choice == 1) {
                manufacturer = truckController.displayManufacturerList().get(0);
                break;
            } else if (choice == 2) {
                manufacturer = truckController.displayManufacturerList().get(1);
                break;
            } else {
                manufacturer = truckController.displayManufacturerList().get(2);
                break;
            }
        } while (true);
        return manufacturer;
    }

    public void displayTruck() {
        if (truckController.display().isEmpty()) {
            System.out.println("Danh sách xe ô tô đang trống!!");
            return;
        }
        for (Truck truck : truckController.display()) {
            System.out.println(truck);
        }
    }

    public void removeTruck(String licensePlate) {
        if (truckController.display().isEmpty()) {
            System.out.println("Danh sách xe ô tô đang trống!!");
            return;
        }
        for (Truck truck : truckController.display()) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                truckController.display().remove(truck);
                System.out.println("Đã xoá thành công xe tải có biển kiểm soát " + licensePlate);
                return;
            }
            System.out.println("Không tìm thấy xe tải có biển kiểm soát " + licensePlate);

        }
    }

    public void findTruckByLicense(String licensePlate){
        if (truckController.display().isEmpty()) {
            System.out.println("Danh sách xe tải đang trống!!");
            return;
        }
        for(Truck truck : truckController.display()){
            if(truck.getLicensePlate().equals(licensePlate)){
                System.out.println("Tìm thấy xe tải có biển kiểm soát " + licensePlate);
                System.out.println(truck);
                return;
            }
            System.out.println("Không tìm thấy xe tải có biển kiểm soát " + licensePlate);

        }
    }
}
