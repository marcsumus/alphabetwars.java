public class AlphabetWars {

    public static String woLoLoooooo(String battlefield) {

        //Single Letter Battles
        if (battlefield.equals("z") || battlefield.equals("d") || battlefield.equals("q") || battlefield.equals("m")) {
            return "Right side wins!";
        }

        if (battlefield.equals("s") || battlefield.equals("b") || battlefield.equals("p") || battlefield.equals("w")) {
            return "Left side wins!";
        }

        //Multi Letter Battles
        if (battlefield.equals("ds")) {
            return "Right side wins!";
        }

        if(battlefield.equals("wm")) {
            return "Let's fight again!";
        }

        return "Left side wins!";
    }

}
