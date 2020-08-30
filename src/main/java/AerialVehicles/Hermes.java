package AerialVehicles;

public abstract class Hermes extends UAV {
    private final int hoursOfFlightBeforeHasToBeRepaired = 100;

    @Override
    public int getHoursOfFlightBeforeHasToBeRepaired() {
        return hoursOfFlightBeforeHasToBeRepaired;
    }
}
