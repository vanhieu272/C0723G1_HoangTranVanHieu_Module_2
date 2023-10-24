package ss16_IO_TextFile.thuc_hanh.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
        br.close();

        } catch (Exception e) {
            System.out.println("File not found or error format!!");
        }
        return numbers;
    }

    public static void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath,true);
            BufferedWriter bufferedReader = new BufferedWriter(writer);
            bufferedReader.write("Max value: " + max);
            bufferedReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int findMax (List<Integer> numbers){
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> numbers = ReadAndWriteFile.readFile("D:\\Codegym\\module-2\\src\\ss16_IO_TextFile\\thuc_hanh\\bai2\\numbers.txt ");
        int maxValue = findMax(numbers);
        ReadAndWriteFile.writeFile("D:\\Codegym\\module-2\\src\\ss16_IO_TextFile\\thuc_hanh\\bai2\\result.txt", maxValue);
    }
}
