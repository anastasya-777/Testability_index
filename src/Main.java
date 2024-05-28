public class Main {
    public static void main(String[] args) {
        BmiService BmiService = new BmiService();
        double height = 1.68;
        double mass = 69.3;
        double index = BmiService.calculate(height, mass);
        System.out.println((int) index);
    }
}
