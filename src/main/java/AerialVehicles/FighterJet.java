package AerialVehicles;

public abstract class FighterJet extends AerialVehicle {
    private final int hoursOfFlightBeforeHasToBeRepaired = 250;

    @Override
    public int getHoursOfFlightBeforeHasToBeRepaired() {
        return hoursOfFlightBeforeHasToBeRepaired;
    }
}
