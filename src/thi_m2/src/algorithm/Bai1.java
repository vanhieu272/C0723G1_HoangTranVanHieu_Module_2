package algorithm;

public class Bai1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int size;
//        int [] arr;
//        do{
//            try{
//                System.out.println("Nhap do dai cua mang: ");
//                size = Integer.parseInt(scanner.nextLine().trim());
//                arr = new int[size];
//                for (int i = 0; i < arr.length; i++){
//                    System.out.println("Nhap phan tu thu " + i +": ");
//                    arr[i] = Integer.parseInt(scanner.nextLine().trim());
//                }
//                break;
//            } catch (NumberFormatException e) {
//                System.out.println("Vui long nhap size va phan tu la so nguyen!!");
//            }
//        }while (true);
//
//        System.out.println(Main.checkArray(arr));

        int [] arr1 ={0,2,4,6,8};
        int []arr2 = {5,10,15,20};
        int [] arr3 = {4,3,2,1};
        System.out.println(Bai1.checkArray(arr1));
        System.out.println(Bai1.checkArray(arr2));
        System.out.println(Bai1.checkArray(arr3));

    }

    public static boolean checkArray(int[] arr) {
        if(arr.length == 0){
            return false;
        }
        for (int i = 1; i < arr.length - 1; i++){
            if(arr[i] - arr[i - 1] != arr[i+1] - arr[i] || arr[i] - arr[i - 1] < 0){
                return false;
            }
        }
        return true;
    }
}
