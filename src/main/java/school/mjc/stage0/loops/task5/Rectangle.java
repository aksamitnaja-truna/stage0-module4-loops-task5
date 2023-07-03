package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int y = 0; y < height; y++){
            for (int x = 0; x < length; x++){
                if ((x == 0 || y == 0) || (x + 1 == length || y + 1 == height))
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
