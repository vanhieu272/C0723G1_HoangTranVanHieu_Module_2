package ss10_DSA_List.bai_tap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);

        //getSize()
        System.out.println("Size = " + myList.getSize());
        //add(index, value)
        myList.add(0, 0);
        myList.add(1,1);
        myList.add(2,3);
        System.out.print("Array = ");
        for (int i = 0; i < myList.getSize(); i++){
            System.out.print(myList.getElement(i) + "\t");
        }
        System.out.println("\n============================");

        //remove
        System.out.println("Array after remove element at index = 0: ");
        myList.remove(0);
        for (int i = 0; i < myList.getSize(); i++){
            System.out.print(myList.getElement(i) + "\t");
        }
        System.out.println("\n============================");

        //indexOf
        System.out.println("Index of '1': " + myList.indexOf(1));
        System.out.println("============================");

        //clone
        System.out.println("Create cloneList clone myList: ");
        MyList<Integer> cloneList = myList.clone();
        for (int i = 0; i < cloneList.getSize(); i++){
            System.out.print(cloneList.getElement(i) + "\t");
        }
        System.out.println("\n============================");

        //contains
        System.out.println("Check myList contains element '1' or not:");
        System.out.println(myList.contains(1));
        System.out.println("============================");

        //add (bool)
        System.out.println("Add element '5' into myList: ");
        myList.add(5);
        for (int i = 0; i < myList.getSize(); i++){
            System.out.print(myList.getElement(i) + "\t");
        }
        System.out.println("\n============================");

        //getElement(index)
        System.out.print("Get element at index = 2: ");
        System.out.println(myList.getElement(2));
        System.out.println("============================");

        //clear
        myList.clear();
        System.out.print("myList after clear: ");
        for (int i = 0; i < myList.getSize(); i++){
            System.out.print(myList.getElement(i) + "\t");
        }
    }
}
