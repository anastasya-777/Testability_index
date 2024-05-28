public class BmiService {
    public double calculate (double height,double mass) {
        double result;
        result = mass / Math.pow(height, 2);
        return result;
    }
}
