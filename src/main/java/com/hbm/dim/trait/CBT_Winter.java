package com.hbm.dim.trait;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;

public class CBT_Winter extends CelestialBodyTrait{

    public float winash;

    public CBT_Winter()  {
        this.winash = 20;
    }

    public CBT_Winter(float winash) { this.winash = winash; }

    @Override
    public void writeToNBT(NBTTagCompound nbt) { nbt.setFloat("win", winash); }

    @Override
    public void readFromNBT(NBTTagCompound nbt) { winash = nbt.getFloat("win"); }

    @Override
    public void writeToBytes(ByteBuf buf) { buf.writeFloat(winash); }

    @Override
    public void readFromBytes(ByteBuf buf) { winash = buf.readFloat(); }

}
