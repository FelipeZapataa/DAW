import java.util.Scanner;

public class NegativosPositivos {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        
        int numbers, contadorNegativos, contadorPositivos;

        contadorNegativos = 0;
        contadorPositivos = 0;

        do {

            System.out.print("Número (0 para salir): ");
            numbers = lector.nextInt();

            if (numbers > 0 ){
                contadorPositivos++;
            } else if (numbers < 0){
                contadorNegativos++;
            }
        } while(numbers != 0); 

        System.out.println("Hay " + contadorPositivos + " número positivos y " + contadorNegativos + " negativos ");

    }
}