package ss10_DSA_List.thuc_hanh;

public class MyListTest {
    public static void main(String[] args) {
        MyList <Integer> listInt = new MyList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);

   for(int i = 0; i < listInt.getSize(); i++){
       System.out.println(listInt.get(i));
   }

//        System.out.println("Element 6: "+listInteger.get(6));
//        System.out.println("element -1: " + listInteger.get(-1));

    }
}
