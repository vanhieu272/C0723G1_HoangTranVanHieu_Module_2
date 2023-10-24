package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProductRepo<O> implements IIOFileByStream<O> {
    @Override
    public List<O> readByByteStream(String pathName) {
        File file = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            file = new File(pathName);
            if(!file.exists()){
                return new ArrayList<>();
            }

            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<O>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error!!");
        } finally {
            try{
                if(objectInputStream != null){
                    objectInputStream.close();
                }

                if(fileInputStream != null){
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.err.println("Error");;
            }
        }
        return new ArrayList<>();
    }


    @Override
    public void writeByByteStream(String pathName, List<O> data) {
        File file = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try{
            file = new File(pathName);
            if(!file.exists()){
                file.createNewFile();
            }

            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(data);

        } catch (IOException e) {
            System.err.println("Error!!");
        } finally {
            try{
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }

                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
