public class BottleSongTestDrive {
    public static void main(String[] args) {

        int bottlesNum = 10;
        String word = "botellas verdes, colgadas de la pared";

        while (bottlesNum > 0) {

            System.out.println(bottlesNum + " " + word);
            System.out.println(bottlesNum + " " + word);
            System.out.println("Y si una botella verde se cayera sin querer,");

            bottlesNum = bottlesNum - 1;

            if (bottlesNum == 1) {
                word = "botella verde, colgada de la pared"; // singular
            }

            if (bottlesNum > 0) {
                System.out.println("Quedarán " + bottlesNum + " " + word);
            } else {
                System.out.println("No quedará ninguna botella verde, colgada de la pared");
            }

        } // end while loop
    }
}
