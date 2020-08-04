package effectivejava.enume;

public enum Planet {
    MERCUY(3.302e+23,2.439e6),
    VENUS(4.869e+24,6.052e6),
    EARth(5.975e+24,6.378e6),
    MARS(6.419e+23,3.393e6);


    private final double mass; //IN kilograms 质量
    private final double radius;//In meters 半径
    private final double surfaceGravity;//表面重量
    private static  final double G = 6.67300E-11;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass;
    }

    public double mass(){
        return mass;
    }

    public double radius(){
        return  radius;
    }

    public double sufaceGravity(){
        return surfaceGravity;
    }

    public double surfaceWeight(double mass){
        return mass * surfaceGravity;//F = ma;
    }
}
