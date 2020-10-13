package AerialVehicles.UAV.Haron;

import AerialModules.AttackModule;
import AerialModules.IntelligenceModule;
import AerialVehicles.UAV.Haron.Haron;

import java.util.Arrays;

public class Eitan extends Haron {
    public Eitan() {
        super(Arrays.asList(AttackModule.class, IntelligenceModule.class));
    }
}
