package AerialVehicles.UAV.Haron;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;
import AerialVehicles.UAV.Haron.Haron;

import java.util.Arrays;

public class Shoval extends Haron {
    public Shoval() {
        super(Arrays.asList(AttackModule.class, BdaModule.class, IntelligenceModule.class));
    }
}

