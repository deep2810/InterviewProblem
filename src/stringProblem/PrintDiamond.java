package stringProblem;

public class PrintDiamond {
	
	public static void main(String[] args) {
		int size=5;
		if (size % 2 != 0) {
            int spaceCount = size / 2;
            int starCount = 1;
            while (spaceCount >= 0) {
                for (int i = 0; i < spaceCount; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < starCount; j++) {
                    System.out.print("*");
                }
                starCount = starCount + 2;
                spaceCount--;
                System.out.println();
            }
            starCount = size - 2;
            spaceCount = 1;
            while (starCount > 0) {
                for (int i = 0; i < spaceCount; i++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < starCount; j++) {
                    System.out.print("*");
                }
                starCount = starCount - 2;
                spaceCount++;
                System.out.println();
            }
        }
	}
}
