package engine.logic.Vector;

import engine.logic.Points.Point2D;

public class Vector2D extends Vector {
    private Point2D start, end;

    public Vector2D(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Vector2D [end=" + end + ", start=" + start + "]";
    }

    public boolean isParallel(Vector2D v) {
        return false;
    }

    public boolean isCoincident(Vector2D v) {
        return false;
    }

    public Double[][] toArray() {
        return new Double[][] {new Double[] {start.getX(), start.getY()}, new Double[] {end.getX(), end.getY()}};
    }
}
