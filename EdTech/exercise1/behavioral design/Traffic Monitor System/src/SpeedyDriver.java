public class SpeedyDriver implements CarDriver {
    private String name;

    public SpeedyDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String alertType, String location) {
        System.out.println(
                name + " (Speedy Driver): Alert - " + alertType + " detected at " + location + ". Adjusting speed.");
    }
}
