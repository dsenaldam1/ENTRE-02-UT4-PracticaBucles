import java.util.Scanner;

/**
 * Incluye todo el código dentro del main()
 * No declares ningún nuevo método en esta clase ni atributos
 * 
 *  @author   David Sena
 */
public class TestPracticaBucles
{

    /**
     *  Punto de entrada a la aplicación
     *  - define y crea el teclado  
     *  - define e instancia un objeto PracticaBucles
     *  - pide al usuario la cantidad máxima de aleatorios a generar
     *    (valida que sea  un nº positivo)
     *  - muestra las estadísticas de números aleatorios
     *  - haz una pausa y borra la pantalla    
     *  
     *  - pide al usuario un valor para la altura de la letra N -
     *          Valida que este valor es correcto, es decir,
     *          está en el intervalo 3 <= altura <= 10
     *  - muestra la letra N
     *  
     */
    public static void main(String[] args)    {
        Scanner teclado = new Scanner(System.in);
        PracticaBucles test = new PracticaBucles();
        
        //se pide un numero valido para generar los aleatorios  
        System.out.println("Dame nº máximo de aleatorios a generar(n > 0): ");
        int num = teclado.nextInt();
        while(num <= 0){
            System.out.print("Dame nº máximo de aleatorios a generar(n > 0): ");
            num = teclado.nextInt();
        }
        System.out.println();
        test.generarNumeros(num);
        //tras pausar y borrar ahora se pedira el numero para la altura de la figura
        Utilidades.hacerPausa();
        Utilidades.borrarPantalla();
        
        
        System.out.println("Teclea altura de la letra N (3 <= altura <= 10): ");
        int num2 = teclado.nextInt();
                while(num2 <= 3 || num2 >=10){
            System.out.print("Altura incorrecta, Teclea altura de la letra N (3 <= altura <= 10): ");
            num2 = teclado.nextInt();
        }
        System.out.println();
        test.escribirLetraN(num2);
    }
}

