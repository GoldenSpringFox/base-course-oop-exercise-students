package AerialVehicles;

import AerialModules.Module;
import Entities.Coordinates;
import Tools.Printer;

import java.util.HashMap;
import java.util.List;

public abstract class UAV extends AerialVehicle {
    public UAV(List<Class<? extends Module>> possibleModules) {
        super(possibleModules);
    }

    public String hoverOverLocation(Coordinates location) {
        String log = "Hovering over: " + location.getLongitude() + ", " + location.getLatitude();
        Printer.print(log);
        return log;
    }
}
