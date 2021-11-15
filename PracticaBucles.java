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
        double media = 0;
        int sumaImpar = 0;
        int max = Integer.MIN_VALUE;
        int aleatorio = generador.nextInt(6001)-1000;
        System.out.println("Nº maximo de aleatorios a generar " + n + "\no hasta que salga el 0 \n");
        
        while(i < n && aleatorio != 0){
            String str = "";
            str += System.out.printf("%12d: %5d", aleatorio, obtenerNumeroSinCeros(aleatorio));
            i++;
            if (i % 5 == 0 ){
                 System.out.println();
            }
             media += aleatorio;
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
        media /= n;
        System.out.println();
        System.out.println();
        System.out.printf("%25s%10.2f\n", "Media:", media);
        System.out.printf("%25s%10d\n", "Suma impar:", sumaImpar);
        System.out.printf("%25s%10d\n", "Máximo pares:", max);
        
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
        int sinCero = 0;
        int cifra = 0;
        int cifras = 1;
        int potencia =  0;
        while(numero != 0){
            cifra  = numero % 10;
            numero = numero/ 10;
            potencia = (int) Math.pow(10, cifras - 1);
            if(cifra != 0){
                sinCero += cifra * Math.pow(10, cifras - 1);
                cifras++;
            }
        }
        return sinCero;
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
