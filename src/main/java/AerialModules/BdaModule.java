package AerialModules;

public class BdaModule extends Module {
    public enum SensorType {INFRARED, DISTANCE}
    private SensorType sensor;
    private final String moduleName;

    public BdaModule() {
        this.moduleName = "bda";
    }

    @Override
    public String getModuleType() {
        return moduleName;
    }

    public SensorType getSensor() {
        return sensor;
    }

    public void setSensor(SensorType sensor) {
        this.sensor = sensor;
    }
}
