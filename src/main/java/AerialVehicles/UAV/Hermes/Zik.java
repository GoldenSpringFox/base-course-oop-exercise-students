package AerialVehicles.UAV.Hermes;

import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;

import java.util.Arrays;

public class Zik extends Hermes {
    public Zik() {
        super(Arrays.asList(BdaModule.class, IntelligenceModule.class));
    }
}