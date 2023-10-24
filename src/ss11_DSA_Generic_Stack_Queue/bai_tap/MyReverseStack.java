package ss11_DSA_Generic_Stack_Queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class MyReverseStack {
    Stack<Integer> stackInteger = new Stack<>();
    Stack<String> stackString = new Stack<>();

    public int[] reverseInteger(int[] arrayInteger) {
        for (int element : arrayInteger) {
            stackInteger.push(element);
        }
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = stackInteger.pop();
        }
        return arrayInteger;
    }

    public String reverseString(String stringInput) {
        String stringOutput = "";
        String[] arrayWord;
        arrayWord = stringInput.split(" ");
        for (String word : arrayWord) {
            stackString.push(word);
        }
        for (int i = 0; i < arrayWord.length; i++) {
            stringOutput += stackString.pop() + " ";
        }
        return stringOutput;
    }

    public static void main(String[] args) {
        int[] arrayInteger = {1, 2, 3, 4, 5};
        MyReverseStack stackInteger = new MyReverseStack();
        System.out.println(Arrays.toString(stackInteger.reverseInteger(arrayInteger)));

        String stringTest = "Hoang Tran Van Hieu";
        MyReverseStack stackString = new MyReverseStack();
        System.out.println(stackString.reverseString(stringTest));
    }
}
