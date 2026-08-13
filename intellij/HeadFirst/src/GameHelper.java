import java.util.*;

public class GameHelper {
    private static final String ALPHABET = "abcdefg";
    private static final int GRID_LENGTH = 7;
    private static final int GRID_SIZE = 49;
    private static final int MAX_ATTEMPTS = 200;
    static final int HORIZONTAL_INCREMENT = 1; // A better way to represent these two
    static final int VERTICAL_INCREMENT = GRID_LENGTH; // things is an enum (see Appendix B)

    private final int[] grid = new int[GRID_SIZE];
    private final Random random = new Random();
    private int startupCount = 0;

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toLowerCase();
    } // end getUserInput

  public ArrayList<String> placeStartup(int startupSize) {
    // holds index to grid (0 - 48)
    int[] startupCoords = new int[startupSize];        // current candidate co-ordinates
    int attempts = 0;                                  // current attempts counter
    boolean success = false;                           // flag = found a good location?

    startupCount++;                                    // nth Startup to place
    int increment = getIncrement();                    // alternate vert & horiz alignment

    while (!success & attempts++ < MAX_ATTEMPTS) {     // main search loop
      int location = random.nextInt(GRID_SIZE);        // get random starting point

      for (int i = 0; i < startupCoords.length; i++) { // create array of proposed coords
        startupCoords[i] = location;                   // put current location in array
        location += increment;                         // calculate the next location
      }
      // System.out.println("Trying: " + Arrays.toString(startupCoords));

      if (startupFits(startupCoords, increment)) {     // startup fits on the grid?
        success = coordsAvailable(startupCoords);      // ...and locations aren't taken?
      }                                                // end loop
    }                                                  // end while
    savePositionToGrid(startupCoords);                 // coords passed checks, save
    ArrayList<String> alphaCells = convertCoordsToAlphaFormat(startupCoords);
    // System.out.println("Placed at: "+ alphaCells);
    return alphaCells;
  }
// end placeStartup
