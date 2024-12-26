package Task1;

public class AnonymClass {
    public static void main(String[] args) {

        Printer anonimPrinter = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        anonimPrinter.print("Анонимный класс");

        //Лямбда выражение
        Printer lambdaPrinter = message -> System.out.println(message);
        lambdaPrinter.print("Лямбда выражение");

        // Улучшенное лямбда-выражение
        Printer enhancedLambdaPrinter = message -> {
            System.out.println(message);
            System.out.println("Длина сообщения – " + message.length());
        };
        enhancedLambdaPrinter.print("Улучшенное лямбда выражение");
    }
}
