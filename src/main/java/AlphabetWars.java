public class AlphabetWars {

    public static final String RIGHT_WINS = "Right side wins!";
    public static final String LEFT_WINS = "Left side wins!";
    public static final String FIGHT_AGAIN = "Let's fight again!";

    // TODO:
    // - Add support for priests
    // - checkPriest has too many conditionals
    // - checkPriest shouldn't need to iterate through the entire battlefield
    // - Make fighter a class?
    // - Not checking if a fighter is protected by a priest


    public static String woLoLoooooo(String battlefield) {

        int leftSideTotal = 0;
        int rightSideTotal = 0;

        // Check for priests
        battlefield = checkPriest(battlefield, 't');
        battlefield = checkPriest(battlefield, 'j');

        for (int i = 0; i < battlefield.length(); i++) {
            char fighter = battlefield.charAt(i);

            int power = getPower(fighter);

            boolean leftSideFighter = isLeftSideFighter(fighter);

            if (leftSideFighter) {
                leftSideTotal += power;
            } else {
                rightSideTotal += power;
            }
        }

        if (leftSideTotal > rightSideTotal) {
            return LEFT_WINS;
        } else if (rightSideTotal > leftSideTotal) {
            return RIGHT_WINS;
        }
        return FIGHT_AGAIN;
    }

    private static String checkPriest(String battlefield, char priest) {

        int location = battlefield.indexOf(priest);
        if (location < 0) { // Priest not found
            return battlefield;
        }

        StringBuilder result = new StringBuilder(battlefield);

        int leftOfPriestLocation = location - 1;
        int rightOfPriestLocation = location + 1;

        if (leftOfPriestLocation >= 0) { // Location is valid
            result.setCharAt(leftOfPriestLocation, convert(priest, result.charAt(leftOfPriestLocation)));
        }

        if (rightOfPriestLocation < result.length()) {
            result.setCharAt(rightOfPriestLocation, convert(priest, result.charAt(rightOfPriestLocation)));
        }

        return result.toString();
    }

    private static char convert(char priest, char fighter) {

        if (priest == 'j') {
            return convertLeftToRight(fighter);
        } else {
            return convertRightToLeft(fighter);
        }
    }

    private static char convertLeftToRight(char fighter) {
        switch (fighter) {
            case 'w':
                return 'm';
            case 'p':
                return 'q';
            case 'b':
                return 'd';
            case 's':
                return 'z';
            default:
                return fighter;
        }
    }

    private static char convertRightToLeft(char fighter) {
        switch (fighter) {
            case 'm':
                return 'w';
            case 'q':
                return 'p';
            case 'd':
                return 'b';
            case 'z':
                return 's';
            default:
                return fighter;
        }
    }

    private static boolean isLeftSideFighter(char fighter) {
        switch (fighter) {
            case 'w':
            case 'p':
            case 'b':
            case 's':
            case 't':
                return true;
            default:
                return false;
        }
    }

    private static int getPower(char letter) {
        switch (letter) {
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
