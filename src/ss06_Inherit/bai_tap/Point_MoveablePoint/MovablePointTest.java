package ss06_Inherit.bai_tap.Point_MoveablePoint;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {

        //Khoi tao 4 tham so
        MovablePoint movablePoint = new MovablePoint(1.0f, 1.0f, 2.0f, 2.0f);
        System.out.println(movablePoint);
        System.out.println("Speed = " + Arrays.toString(movablePoint.getSpeed()));
        System.out.println(movablePoint.move());
    }
}
