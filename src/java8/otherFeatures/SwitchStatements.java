package java8.otherFeatures;

/**
 * SwitchStatements class showing string in switch
 */
public class SwitchStatements {
    public static void main(String[] args) {
        String name = "Odho";
        switch (name){
            case "Odho":
                System.out.println("Odho found");
                break;
            case "Abro":
                System.out.println("Abro found");
                break;
            default:
                System.out.println("No Match Found");
        }
    }
}
