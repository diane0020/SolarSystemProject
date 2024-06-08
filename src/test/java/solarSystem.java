public class solarSystem {
    public static void main(String[] args) {
        solarSystemBase solar = new solarSystemBase();
        solar.sun = "1";
        solar.moon = "2";
        solar.star = "3";

        System.out.println("the solar system is ready");

        //
        planet2 mars = new planet2();
        mars.color = "red";
        mars.size = "20km";
        mars.radius = "6km";

    }
}
