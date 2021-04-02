
public class Main {
    public static void main(String[] args) {
        Mug classic = new Mug(1.2);

        PlasticMug plastic = new PlasticMug(1.2, "polycarbonat");
        System.out.println(classic.equals(plastic));
        System.out.println(plastic.equals(classic));
    }
}
