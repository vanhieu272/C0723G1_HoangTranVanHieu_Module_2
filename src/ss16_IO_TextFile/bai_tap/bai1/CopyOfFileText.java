package ss16_IO_TextFile.bai_tap.bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyOfFileText {
    private static final String SOURCE_PATH = "D:\\Codegym\\module-2\\src\\ss16_IO_TextFile\\bai_tap\\bai1\\source.txt.txt";
    private static final String TARGET_PATH = "D:\\Codegym\\module-2\\src\\ss16_IO_TextFile\\bai_tap\\bai1\\target.txt";
    public static List<String> readFile(String filePath) {
        List<String> string = new ArrayList<>();
        File file = null;
        FileReader fileReader = null;
        BufferedReader br = null;
        try {
            file = new File(filePath);
            if(!file.exists()){
                return new ArrayList<>();
            }
            fileReader = new FileReader(file);
            br = new BufferedReader(fileReader);
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

    public static void writeFile(String filePath, List<String> strings) {
        File file = null;
        BufferedWriter bw = null;
        FileWriter fileWriter = null;
        try {
            file = new File(filePath);
            bw = new BufferedWriter(new FileWriter(file));
            for (String data : strings) {
                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
                if ( fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static int countCharacters(String filePath) {
        int count = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        writeFile(TARGET_PATH, readFile(SOURCE_PATH));
        System.out.println("Number of characters: ");
        System.out.println(countCharacters(TARGET_PATH));
    }

}
