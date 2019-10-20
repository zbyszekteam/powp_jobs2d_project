package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.powp.jobs2d.AbstractDriver;
import edu.kis.powp.jobs2d.features.DrawerFeature;
import edu.kis.powp.jobs2d.features.LineGeneratorFeature;

import java.awt.*;

public class AbstractAdapter extends AbstractDriver {

    private int startX = 0, startY = 0;

    public AbstractAdapter() {
        super(0, 0);
    }

    @Override public void operateTo(int x, int y) {
        ILine line = new LineGeneratorFeature(Color.RED, 4.0f, false);
        line.setStartCoordinates(this.getX(), this.getY());
        line.setEndCoordinates(x, y);
        this.setPosition(x, y);
        DrawerFeature.getDrawerController().drawLine(line);
    }

    @Override
    public String toString() {
        return "Jane";
    }
}