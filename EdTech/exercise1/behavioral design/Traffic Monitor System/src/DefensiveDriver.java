public class DefensiveDriver implements CarDriver {
    private String name;

    public DefensiveDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String alertType, String location) {
        System.out.println(name + " (Defensive Driver): Alert - " + alertType + " detected at " + location
                + ". Proceeding with caution.");
    }
}
