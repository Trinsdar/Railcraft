/*******************************************************************************
 * Copyright (c) CovertJaguar, 2011-2016
 * http://railcraft.info
 *
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 ******************************************************************************/
package mods.railcraft.common.blocks.tracks.instances;

import mods.railcraft.common.blocks.tracks.EnumTrack;
import mods.railcraft.common.util.misc.Game;

public class TrackHolding extends TrackLockingBase {

    @Override
    public EnumTrack getTrackType() {
        return EnumTrack.HOLDING;
    }


    @Override
    public void update() {
        if (Game.isHost(getWorld()))
            migrateTrack(TrackNextGenLocking.LockingProfileType.HOLDING);
    }

}