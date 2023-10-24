package ss17_IO_Binary_and_Serialization.bai_tap.optional;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFileBinaryUseStream {
    private static final String SOURCE_PATH = "D:\\Codegym\\module-2\\src\\ss17_IO_Binary_and_Serialization\\bai_tap\\optional\\source.dat";
    private static final String TARGET_PATH = "D:\\Codegym\\module-2\\src\\ss17_IO_Binary_and_Serialization\\bai_tap\\optional\\target.dat";

    public static ArrayList<Character> readFileText(String filePath) throws FileNotFoundException {
        ArrayList<Character> arrayList = new ArrayList<>();
        File file = new File(filePath);
        InputStream inputStream = new FileInputStream(file);
        try {

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            int line;
            while ((line = inputStream.read()) != -1) {
                arrayList.add((char) line);
            }

        } catch (Exception e) {
            System.err.println("File not found or error format");
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static void writeFile(String filePath, ArrayList<Character> arrayList) throws FileNotFoundException {
        File file = new File(filePath);
        OutputStream outputStream = new FileOutputStream(file);
        try {
            int count = 0;
            for (Character character : arrayList) {
                outputStream.write(character);
                count++;
            }
            System.out.println("Number of bytes: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFile(String filePath, String filePathTarget) throws FileNotFoundException {
        writeFile(filePathTarget, readFileText(filePath));
    }

    public static void main(String[] args) throws FileNotFoundException {
        CopyFileBinaryUseStream.copyFile(SOURCE_PATH, TARGET_PATH);
    }
}


