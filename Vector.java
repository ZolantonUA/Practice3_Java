public class Vector {
    // Три приватных поля
    private double x;
    private double y;
    private double z;

    // С тремя параметрами
    public Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static double square(double a)
    {
        double qwe = a * a;

        return qwe;
    }
    public double length()
    {
        return Math.sqrt(square(x) + square(y) + square(z));
    }
    @Override
    public String toString()
    {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}