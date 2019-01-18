

public class DrawChessTable {
    public static void main(String[] args) {
        for (int j = 0; j < 4; j = j + 1) {
            for (int i = 0; i < 4; i = i + 1) {
                System.out.print("%");
                System.out.print(" ");
            }
            System.out.println();
            for (int i = 0; i < 4; i = i + 1) {
                System.out.print(" ");
                System.out.print("%");
            }
            System.out.println();

            }
        }
    }
