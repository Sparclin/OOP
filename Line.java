/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
class Line implements Relation {
    private final double x1;
    private final double x2;

    private final double y1;
    private final double y2;

    public Line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength() {
        double length = Math.sqrt((x1 - x2) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }

    @Override
    public boolean isGreater(Object a, Object b) {
        double aLen = ((Line) a).getLength();
        double bLen = ((Line) b).getLength();
        return (aLen > bLen);
    }

    @Override
    public boolean isLess(Object a, Object b) {
        double aLen = ((Line) a).getLength();
        double bLen = ((Line) b).getLength();
        return (aLen < bLen);
    }
}

