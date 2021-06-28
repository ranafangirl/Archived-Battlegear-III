package com.rainbowdestiny.battlegear.main.util;

import java.util.UUID;

import net.minecraft.entity.ai.attributes.RangedAttribute;

public interface Attributes {

    UUID penetrateArmourUUID = UUID.fromString("db3f55d3-645c-4f38-a497-9c13a33db5cf");

    RangedAttribute armourPenetrate = new RangedAttribute(null, 0.0D, 0.0D, Double.MAX_VALUE);

    UUID dazeUUID = UUID.fromString("927f0df6-946e-4e78-a479-c2c13034edb5");

    RangedAttribute daze = new RangedAttribute(null, 0.0D, 0.0D, 1.0D);

    UUID extendReachUUID = UUID.fromString("fb557a05-866e-4017-990b-aab8450bf41b");
 
    RangedAttribute extendedReach = (RangedAttribute) new RangedAttribute(null, 0.0D, -5.0D, Double.MAX_VALUE).setShouldWatch(true);

    UUID attackSpeedUUID = UUID.fromString("4833af8b-40f2-44c5-8405-735f7003b1be");

    RangedAttribute attackSpeed = new RangedAttribute(null, 0.0D, -10.0D, 10.0D);

    UUID mountedBonusUUID = UUID.fromString("fd234540-d099-4a05-a4ac-0ad7c11a8b65");

    RangedAttribute mountedBonus = new RangedAttribute(null, 0.0D, 0.0D, Double.MAX_VALUE);
}
