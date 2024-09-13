package com.hbm.dim.trait;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;

public class CBT_Winter extends CelestialBodyTrait{

    public float winter;

    public CBT_Winter()  {
        this.winter = 20;
    }

    public CBT_Winter(float winter) { this.winter = winter; }

    @Override
    public void writeToNBT(NBTTagCompound nbt) { nbt.setFloat("winter", winter); }

    @Override
    public void readFromNBT(NBTTagCompound nbt) { winter = nbt.getFloat("winter"); }

    @Override
    public void writeToBytes(ByteBuf buf) { buf.writeFloat(winter); }

    @Override
    public void readFromBytes(ByteBuf buf) { winter = buf.readFloat(); }

}
