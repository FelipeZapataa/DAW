public class Clase3 {
    public static void main(String[] args) {
        
    // If Else y Switch
        
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Enhorabuena! eres mayor de edad");
        } else { 
            System.out.println("Aún te queda un porquito disfruta de tus " + edad + " años");
        }
        
        // Existe la opción de else if para anidar if, es como el elif de python

        switch (edad) {
            case 18:
                System.out.println("Eres mayor de edad");
                break;
            case 10:
                System.out.println("No eres mayor de edad");
            default:
                break;
        }
        
        // 


        int contador = 0;

        while(contador < 12) {
            System.out.println(contador);
            contador++;
        }
        contador = 0;

        do {
            System.out.println(contador);
            contador++;
        } while (contador < 12);

        contador = 10;

        for (int i=0; i < 18; i++){
            System.out.println(i);
        }
    }
}
