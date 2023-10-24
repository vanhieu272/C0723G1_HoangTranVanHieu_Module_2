package ss16_IO_TextFile.bai_tap.bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {
    public static final String FILE_PATH = "D:\\Codegym\\module-2\\src\\ss16_IO_TextFile\\bai_tap\\bai2\\countries.csv";

    public static List<String> readFile(String filePath) {
        List<String> string = new ArrayList<>();
        File file = null;
        BufferedReader br = null;
        FileReader fileReader = null;
        try {
            file = new File(filePath);
            br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                string.add(line);
            }
            return string;
        } catch (IOException e) {
            e.printStackTrace();
            return string;
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return string;
        }
    }

    private static List<Country> convertCSVFile(List<String> csvLines) {
        List<Country> countries = new ArrayList<>();
        for (String line : csvLines) {
            String[] splitLine = line.split(",");
            countries.add(new Country(Integer.parseInt(splitLine[0]), splitLine[1], splitLine[2]));
        }
        return countries;
    }

    public static void displayCountry(List<String> countries) {
        try {
            List<String> list = ReadCSVFile.readFile(FILE_PATH);
            System.out.println(convertCSVFile(list));
        } catch (RuntimeException e) {
            System.out.println("Error format !!");
        }

    }

    public static void main(String[] args) {
        displayCountry(readFile(FILE_PATH));
    }
}

