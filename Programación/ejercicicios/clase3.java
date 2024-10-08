package ejercicicios;

public class clase3 {
    public static void main(String[] args) {
        int contador, num1, num2, num3;
        
        contador = 10;
        num1 = 1;
        num2 = 1;

        while (contador > 0) {
            num3 = num2;
            System.out.println("Número 1: " + num1 + " Número 2: " + num2);
            num2 += num1;
            System.out.println("Número 1: " + num1 + " Número 2: " + num2);
            num3 = num1;
            contador--;
        }
        
    }
}
