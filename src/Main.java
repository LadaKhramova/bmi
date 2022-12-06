public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        int weight = 85; /* вес в кг*/
        double height = 1.75; /* рост в м*/

        double bmi = service.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmi);
    }
}
