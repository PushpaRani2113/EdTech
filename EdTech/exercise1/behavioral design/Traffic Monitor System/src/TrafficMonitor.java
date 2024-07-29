import java.util.ArrayList;
import java.util.List;

public class TrafficMonitor implements RoadTrafficMonitor {
    private List<CarDriver> drivers = new ArrayList<>();
    private String alertType;
    private String location;

    @Override
    public void addDriver(CarDriver driver) {
        drivers.add(driver);
    }

    @Override
    public void removeDriver(CarDriver driver) {
        drivers.remove(driver);
    }

    public void notifyDrivers() {
        for (CarDriver driver : drivers) {
            driver.update(alertType, location);
        }
    }

    @Override
    public void detectIssue(String alertType, String location) {
        this.alertType = alertType;
        this.location = location;
        notifyDrivers();
    }
}
