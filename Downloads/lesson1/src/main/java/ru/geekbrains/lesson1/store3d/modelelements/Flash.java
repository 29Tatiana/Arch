package ru.geekbrains.lesson1.store3d.modelelements;

public class Flash {
    public void rotate(Angle3D newAngle) {
        this.angle = newAngle;
    }

    public void move(Point3D newLocation) {
        this.location = newLocation;
    }

    public Flash(Point3D location, Angle3D angle, Color color, double power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Flash(Point3D location, Angle3D angle, double power) {
        this.location = location;
        this.angle = angle;
        this.power = power;
    }

}
    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private double power;
