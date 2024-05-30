import java.util.Random;

public class Model {
    private final Random rand;
    private int times; //Rippmenüüs saadav number (1-5)
    public Model() {
        rand = new Random();
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    /**
     * Genereerib juhusliku numbri vahemikus 5-110 k.a.
     * @return tagastab kiiruse täisarvuna
     */
    private int generateSpeed() {
        return rand.nextInt(((110 - 5) + 1) + 5);
    }

    public String getKmhResult() {
        int kmh = generateSpeed();
        double mph = convertKmh(kmh);
        return String.format("%03d kmh => %.3f mph%n", kmh, mph);
    }

    /**
     * Konverteerib kmh => mph
     * @param kmh kaasas antakse kiirus kmh
     * @return tagastab double väärtuse miili tunnis (mph)
     */
    private double convertKmh(int kmh) {
        return kmh * 0.621371;
    }

    public String getMphResult() {
        int mph = generateSpeed();
        double kmh = convertMph(mph);
        return String.format("%03d mph => %.3f  kmh%n", mph, kmh);
    }

    private double convertMph(int mph) {
        return mph * 1.609344;
    }
}
