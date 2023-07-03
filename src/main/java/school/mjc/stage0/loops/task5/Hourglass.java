package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int y = 0; y < height; y++){
            for (int x = 0; x < height; x++){
                if ((x >= y && x + y <= height - 1) || (x <= y && x + y >= height - 1))
                    System.out.print("8");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
