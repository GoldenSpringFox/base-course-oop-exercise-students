package AerialVehicles.UAV.Haron;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialModules.IntelligenceModule;

import java.util.Arrays;

public class Shoval extends Haron {
    public Shoval() {
        super(Arrays.asList(AttackModule.class, BdaModule.class, IntelligenceModule.class));
    }
}

