package AerialVehicles.FighterJet;

import AerialModules.AttackModule;
import AerialModules.BdaModule;
import AerialVehicles.FighterJet.FighterJet;

import java.util.Arrays;

public class F16 extends FighterJet {
    public F16() {
        super(Arrays.asList(AttackModule.class, BdaModule.class));
    }
}
