package AerialVehicles;

import AerialModules.Module;

import java.util.HashMap;
import java.util.List;

public abstract class Haron extends UAV {
    private final int hoursOfFlightBeforeHasToBeRepaired = 150;

    public Haron(List<Class<? extends Module>> possibleModules) {
        super(possibleModules);
    }

    @Override
    public int getHoursOfFlightBeforeHasToBeRepaired() {
        return hoursOfFlightBeforeHasToBeRepaired;
    }
}
