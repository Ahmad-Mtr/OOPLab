package CheatSheet;

public class MainCS {
    public static void main(String[] aa){
        ConsoleColors colors = new ConsoleColors();
        CheatSheet x = new CheatSheet();
        x.read_AllData();

        System.out.println("\n " + colors.BLUE_BACKGROUND + colors.RESET + "Cheat Sheet" +
                colors.GREEN + " PRINTED");

    }
}
