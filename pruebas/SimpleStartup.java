public class SimpleStartup {

    int[] locationCells;
    int numOfHits;

    public String checkYourself(int guess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (guess == cell) {

                result = "hit";
                numOfHits++;
                break;
            } // end if
        } // end for

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
