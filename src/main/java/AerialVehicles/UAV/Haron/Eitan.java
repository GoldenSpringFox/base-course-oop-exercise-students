package AerialVehicles.UAV.Haron;

import AerialModules.AttackModule;
import AerialModules.IntelligenceModule;

import java.util.Arrays;

public class Eitan extends Haron {
    public Eitan() {
        super(Arrays.asList(AttackModule.class, IntelligenceModule.class));
    }
}
