//
// Decompiled by Jadx - 627ms
//
package com.unisound.vui.transport.out;

public class OutputEvent<T> {
    private T data;
    private int type;

    public OutputEvent(int i) {
        this.type = i;
    }

    public OutputEvent(int i, T t) {
        this.type = i;
        this.data = t;
    }

    public T getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public void setData(T t) {
        this.data = t;
    }

    public void setType(int i) {
        this.type = i;
    }
}
