package AerialVehicles;

import AerialModules.Module;

import java.util.HashMap;
import java.util.List;

public abstract class Hermes extends UAV {
    private final int hoursOfFlightBeforeHasToBeRepaired = 100;

    public Hermes(List<Class<? extends Module>> possibleModules) {
        super(possibleModules);
    }

    @Override
    public int getHoursOfFlightBeforeHasToBeRepaired() {
        return hoursOfFlightBeforeHasToBeRepaired;
    }
}
