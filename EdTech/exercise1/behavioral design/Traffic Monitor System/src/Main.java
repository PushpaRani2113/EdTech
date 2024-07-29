public class Main {
    public static void main(String[] args) {
        RoadTrafficMonitor roadMonitor = new TrafficMonitor();
        CarDriver defensiveDriver = new DefensiveDriver("Pushpa");
        CarDriver speedyDriver = new SpeedyDriver("Rani");
        roadMonitor.addDriver(defensiveDriver);
        roadMonitor.addDriver(speedyDriver);
        roadMonitor.detectIssue("Accident", "NRKR Road");
        roadMonitor.detectIssue("Roadwork", "Middle Street");
    }
}
