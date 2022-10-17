public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        int expected = 150;
        long actual = service.calculate(1_000_000, false);

        System.out.println(expected + "== ? ==" + actual);
    }
}
