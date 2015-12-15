package com.aqqxa.sm.basic.entity;

public class VersionedEntity extends BasicEntity{

    protected int version;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
