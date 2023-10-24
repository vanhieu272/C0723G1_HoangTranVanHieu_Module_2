package ss17_IO_Binary_and_Serialization.bai_tap.ProducManagement.mvc.repository;

import java.util.List;

public interface IIOFileByStream<O> {

    List<O> readByByteStream(String pathName);

    void writeByByteStream(String pathName, List<O> data);
}
