public class SimpleStartup {

    int[] locationCells;
    int numOfHits;
    boolean[] posiciones = new boolean[3];
    int posicion;

    public String checkYourself(int guess) {
        String result = "miss";

        for (int i = 0; i < locationCells.length; i++) {
            if (guess == locationCells[i]) {
                if (posiciones[i] == true) {
                    System.out.println("Numero repetido");
                } else {
                    result = "hit";
                    numOfHits++;
                    posiciones[i] = true;
                }
                break;
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        } // end if

        System.out.println(result);
        return result;

    } // end method

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
}
