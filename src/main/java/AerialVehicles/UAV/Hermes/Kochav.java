package AerialVehicles.UAV.Hermes;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;

import java.util.Arrays;

public class Kochav extends Hermes {
    public Kochav() {
        super(Arrays.asList(AttackModule.class, BdaModule.class, IntelligenceModule.class));
    }
}
