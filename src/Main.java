public class Main {
    public static void main(String[] args) {

        int amount = 15_550; //стоимость билета
        int onemile = 20; //стоимость одной бонусной мили
        int mile;

        System.out.println("С покупки Вашего билета накоплено:");
        System.out.println((mile = amount / onemile) + " бесплатных бонусных мили");


    }
}