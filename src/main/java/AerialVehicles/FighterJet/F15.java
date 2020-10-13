package AerialVehicles.FighterJet;

import AerialModules.AttackModule;
import AerialModules.IntelligenceModule;

import java.util.Arrays;

public class F15 extends FighterJet {
    public F15() {
        super(Arrays.asList(AttackModule.class, IntelligenceModule.class));
    }
}
