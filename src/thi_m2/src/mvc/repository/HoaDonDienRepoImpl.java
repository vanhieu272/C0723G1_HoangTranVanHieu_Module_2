package mvc.repository;

import mvc.model.HoaDonDien;
import mvc.repository.IHoaDonDienRepo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class HoaDonDienRepoImpl implements IHoaDonDienRepo {
    private final String LIST_HOA_DON_PATH = "D:\\Codegym\\thi_m2\\src\\mvc\\data\\list_hoa_don.csv";
    private final String COMMA = ",";




    @Override
    public void create(HoaDonDien hoaDonDien) {
            boolean flag = false;
            List<HoaDonDien> hoaDonDiens = readHoaDonFromFile();
            for(HoaDonDien hoaDonDien1 : hoaDonDiens){
                if(hoaDonDien1.getMaHoaDon().equals(hoaDonDien.getMaHoaDon())){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                hoaDonDiens.add(hoaDonDien);
            }
            writeHoaDonToFile(hoaDonDiens);
        }

    @Override
    public List<HoaDonDien> getAll() {
        return readHoaDonFromFile();
    }

    public List<String> readFile(String pathName) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(pathName);
            if (!file.exists()) {
                return new ArrayList<>();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            List<String> data = new ArrayList<>();
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                data.add(str);
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void writeFile(String pathName, List<String> data) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(pathName);
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String str : data) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public List<String> convertOBJToString(List<HoaDonDien> hoaDonDiens) {
        List<String> data = new ArrayList<>();
        for (HoaDonDien hoaDonDien : hoaDonDiens) {
            data.add(hoaDonDien.getMaHoaDon()
                    + COMMA + hoaDonDien.getHoTenKH()
                    + COMMA + hoaDonDien.getType()
                    + COMMA + hoaDonDien.getDinhMuc());
        }
        return data;
    }

    public List<HoaDonDien> convertStringToObj(List<String> data) {
        List<HoaDonDien> students = new ArrayList<>();
        for (String str : data) {
            String[] splittedStr = str.split(COMMA);
            students.add(new HoaDonDien(splittedStr[0], splittedStr[1], splittedStr[2],
                    Integer.parseInt(splittedStr[3])));
        }
        return students;
    }

    public List<HoaDonDien> readHoaDonFromFile() {
        List<String> data = readFile(LIST_HOA_DON_PATH);
        return convertStringToObj(data);
    }

    public void writeHoaDonToFile(List<HoaDonDien> movieTickets) {
        List<String> data = convertOBJToString(movieTickets);
        writeFile(LIST_HOA_DON_PATH, data);
    }
}
