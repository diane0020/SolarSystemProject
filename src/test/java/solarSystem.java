public class solarSystem {
    public static void main(String[] args) {
        solarSystemBase solar = new solarSystemBase();
        solar.sun = "1";
        solar.moon = "2";
        solar.star = "3";

        System.out.println("the solar system is ready");

        //
        planet1 renox = new planet1();
        renox.color = "grey";
        renox.size = "10km";
        renox.radius = "5m";

    }
}
