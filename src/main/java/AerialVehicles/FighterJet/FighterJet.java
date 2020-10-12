package AerialVehicles.FighterJet;

import AerialModules.Module;
import AerialVehicles.AerialVehicle;

import java.util.HashMap;
import java.util.List;

public abstract class FighterJet extends AerialVehicle {
    private final int hoursOfFlightBeforeHasToBeRepaired = 250;

    public FighterJet(List<Class<? extends Module>> possibleModules) {
        super(possibleModules);
    }

    @Override
    public int getHoursOfFlightBeforeHasToBeRepaired() {
        return hoursOfFlightBeforeHasToBeRepaired;
    }
}
