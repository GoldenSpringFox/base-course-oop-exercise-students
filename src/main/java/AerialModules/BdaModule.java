package AerialModules;

import Entities.SensorType;

public class BdaModule extends Module {
    private SensorType sensor;

    public BdaModule(SensorType sensor) {
        this.sensor = sensor;
    }

    public SensorType getSensor() {
        return sensor;
    }

    public void setSensor(SensorType sensor) {
        this.sensor = sensor;
    }
}
