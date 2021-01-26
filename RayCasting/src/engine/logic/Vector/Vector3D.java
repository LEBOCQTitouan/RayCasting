package engine.logic.Vector;

import engine.logic.Points.Point3D;
import engine.logicExceptions.VectorException;

public class Vector3D extends Vector2D {

    public Vector3D(Point3D start, Point3D end) {
        super(start, end);
    }

    public Point3D getStart() {
        return (Point3D)super.getStart();
    }

    public Point3D getEnd() {
        return (Point3D)super.getEnd();
    }

    @Override
    public String toString() {
        return "Vector3D [start=" + getStart() + ", end=" + getEnd() + "]";
    }
    
    public Double[][] toArray() {
        return new Double[][] {new Double[] {getStart().getX(), getStart().getY(), getStart().getZ()}, new Double[] {getEnd().getX(), getEnd().getY(), getEnd().getZ()}};
    }

    public Point3D intersect(Vector3D v) throws Exception {
        double A = this.getEnd().getX() - this.getStart().getX();
        double B = v.getStart().getX() - v.getEnd().getX();
        double C = v.getStart().getX() - this.getStart().getX();
        double D = this.getEnd().getY() - this.getStart().getY();
        double E = v.getStart().getY() - v.getEnd().getY();
        double F = v.getStart().getY() - this.getStart().getY();

        // find t and s using formula
        double t=(C*E-F*B) / (E*A-B*D);
        double s=(D*C-A*F) / (D*B-A*E);

        // check if third equation is also satisfied(we have 3 equations and 2 variable
        if ((t*(this.getEnd().getZ() - this.getStart().getZ())+s*(v.getStart().getZ()-v.getEnd().getZ()))==v.getStart().getZ()-this.getStart().getZ()) {
            if(0<=t && t<=1 && 0<=s && s<=1)
                return new Point3D(
                    this.getStart().getX() + t*(this.getEnd().getX() - this.getStart().getX()),
                    this.getStart().getY() + t*(this.getEnd().getY() - this.getStart().getY()),
                    this.getStart().getZ() + t*(this.getEnd().getZ() - this.getStart().getZ())
                    ); // intersect
        }
        throw new VectorException("There is no interesction between the vectors");
    }
}