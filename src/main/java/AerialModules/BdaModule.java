package AerialModules;

import Entities.SensorType;

public class BdaModule extends Module {
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
