public class Trapesium {
    private double base1;
    private double base2;
    private double height;

    public Trapesium(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getEdge1() {
        return base1;
    }

    public double getEdge2() {
        return base2;
    }

    public double hitungTinggi() {
        return height;
    }

    public double hitungLuas() {
        return 0.5 * (base1 + base2) * height;
    }

    public double hitungKeliling() {
        return base1 + base2 + 2 * Math.sqrt(Math.pow((base1 - base2) / 2, 2) + height * height);
    }
}

