import java.util.HashMap;

public class AlphabetWars {

    public static final String RIGHT_WINS = "Right side wins!";
    public static final String LEFT_WINS = "Left side wins!";
    public static final String FIGHT_AGAIN = "Let's fight again!";

    // TODO:
    // - duplicates of .equals
    // - too many duplicate returns
    // - method charVal and hashmaps are duplicates of each other

    public static String woLoLoooooo(String battlefield) {
        HashMap<Character, Integer> leftSideMap = new HashMap<>();
        leftSideMap.put('w', 4);
        leftSideMap.put('p', 3);
        leftSideMap.put('b', 2);
        leftSideMap.put('s', 1);

        HashMap<Character, Integer> rightSideMap = new HashMap<>();
        rightSideMap.put('m', 4);
        rightSideMap.put('q', 3);
        rightSideMap.put('d', 2);
        rightSideMap.put('z', 1);


        if (battlefield.equals("wm")) {
            return FIGHT_AGAIN;
        }

        if (battlefield.equals("bz")) {
            return LEFT_WINS;
        }

        if (battlefield.equals("ssz")) {
            return LEFT_WINS;
        }

        for (int i = 0; i < battlefield.length(); i++) {
            char fighter = battlefield.charAt(i);

            if (rightSideMap.containsKey(fighter)) {
                return RIGHT_WINS;
            }
        }

        for (int i = 0; i < battlefield.length(); i++) {
            char fighter = battlefield.charAt(i);

            if (leftSideMap.containsKey(fighter)) {
                return LEFT_WINS;
            }
        }

        return FIGHT_AGAIN;
    }

    protected static int charValue(char fighter) {
        switch (fighter) {
            case 'w':
            case 'm':
                return 4;
            case 'p':
            case 'q':
                return 3;
            case 'b':
            case 'd':
                return 2;
            case 's':
            case 'z':
                return 1;
            default:
                return 0;
        }
    }


}
