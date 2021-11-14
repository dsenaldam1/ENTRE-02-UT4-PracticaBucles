import java.util.Random;
/**
 *    
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
        long total = 0;
        int i = 0;
        int media = 0;
        int sumaImpar = 0;
        int max = Integer.MIN_VALUE;
        int aleatorio = generador.nextInt(6001)-1000; 
        while(i < n){
            String str = "";
            str += System.out.printf("%12d: ", aleatorio, obtenerNumeroSinCeros(aleatorio));
            i++;
            if (i % 5 == 0 ){
                 System.out.println();
            }
             media +=aleatorio;
            if(esImpar(aleatorio)){
                 sumaImpar += aleatorio;
             }
            else{
                if(aleatorio > max){
                   max = aleatorio; 
                }
            }
            aleatorio = generador.nextInt(6001)-1000; 
            
        }
        System.out.println();
        System.out.println("La media es: " + media);
        System.out.println("La suma de impares es: " + sumaImpar);
        System.out.println("El mayor numero es: " + max);
    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        
        return  numero % 2 != 0;
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        
        
        
        return 0;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
       System.out.println("Letra: N - Altura: " + altura);
        escribirCaracter(CARACTER, altura);

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
        String figura = "";
        for (int fila = 0; fila < n; fila++){
            figura += caracter;
            for (int diagonal = 0; diagonal < fila; diagonal++){
                figura += ESPACIO;
            }
            figura += caracter ;
            for (int col = n - fila; col > 1; col--){
               figura += ESPACIO;
            }
            figura += caracter + "\n";
        }
        System.out.println(figura);
    }

}
