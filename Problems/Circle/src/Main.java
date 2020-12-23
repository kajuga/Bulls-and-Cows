class Circle {
    boolean b1 = true;
    boolean b2 = true;
    boolean b3 = true;
//    public Circle(){}

    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;

        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;
        System.out.println(result);
    }

    double radius;

    // write methods here

//    pdouble getLength() {
//        return Math.PI * 2 * this.radius;
//    }
//
//    double getArea() {
//        return Math.PI * (this.radius * this.radius);
//    }
}