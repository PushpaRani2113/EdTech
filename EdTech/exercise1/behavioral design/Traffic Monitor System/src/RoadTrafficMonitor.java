public interface RoadTrafficMonitor {
    void addDriver(CarDriver driver);

    void removeDriver(CarDriver driver);

    void detectIssue(String alertType, String location);
}
