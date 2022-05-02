package ch07_adapter;

import ch01_introduction.Engine;

public class AlternateSGEAdapter implements Engine {

    private SuperGreenEngine sge;

    public AlternateSGEAdapter(SuperGreenEngine sge) {
        this.sge = sge;
    }

    @Override
    public int getSize() {
        return this.sge.getEngineSize();
    }

    @Override
    public boolean isTurbo() {
        return false;
    }
}
