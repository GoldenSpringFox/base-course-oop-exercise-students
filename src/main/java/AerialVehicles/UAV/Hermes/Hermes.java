package AerialVehicles.UAV.Hermes;

import AerialModules.Module;
import AerialVehicles.UAV.UAV;

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
