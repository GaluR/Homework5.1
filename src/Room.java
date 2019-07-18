public class Room {
   public double surface;
    public double temperature;
    public boolean isConditioner;

    public Room(double surface, double temperature, boolean isConditioner) {
        this.surface = surface;
        this.temperature = temperature;
        this.isConditioner = isConditioner;
    }

    public boolean lowerTemperature() {
        if (15 < temperature && isConditioner == true) {
                --temperature;
                return true;
            } else {
                return false;
            }
        }
 }
