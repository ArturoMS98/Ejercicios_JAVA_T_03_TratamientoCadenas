package t_03_tratamientocadenas_ej06;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 2:05:06 PM<p>                                                               *
 * <p>fecha de finalizacion: May 29, 2019 2:05:06 PM<p>                                                                 *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej06.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>6. Implementa un programa que en Java que pida al usuario una frase y una palabra. También le preguntará si       *
 * quiere o no diferenciar mayúsculas de minúsculas. Y mostrará por pantalla un mensaje informando si la palabra        *
 * introducida aparece en la frase, si es así mostrará cuántas veces, y en qué posiciones</p>                           *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 49 minutos 37 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej06 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llama al método pideFrase, y al método pidePalabra. Después llama al método buscaPalabraMayus o al método      *
    *    buscaPalabraSinMayus dependiendo de lo que el usuario prefiera.</p>                                            *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        boolean conMayusculas;
        String comprobacion;
        String frase;
        String palabra;
        Scanner in = new Scanner(System.in);
        int apariciones;
        //FRONTEND//
            //PETICION DE DATOS//
            frase = pideFrase();
            palabra = pidePalabra();
            do
            {
                System.out.println("¿Desea que se busque teniendo en cuenta las mayúsculas? SI|NO");
                comprobacion = in.nextLine();
            }while(!comprobacion.equalsIgnoreCase("si") && !comprobacion.equalsIgnoreCase("no"));
        //BACKEND//
        if(comprobacion.equalsIgnoreCase("SI"))
            buscaPalabraMayus(frase, palabra);
        else
            buscaPalabraSinMayus(frase, palabra);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una frase por pantalla y devolverla.</p>                                                                |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La frase que se ha introducido                                                                           |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String pideFrase ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        final String PETICION_FRASE = "Por favor, introduzca la cadena de caracteres";
        //CUERPO DEL METODO//
        System.out.println(PETICION_FRASE);
        return(in.nextLine());
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una palabra y comprobar que es una palabra</p>
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param                                                                                                  |
     | @return                                                                                                 |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String pidePalabra ()
    {
        //VARIABLES LOCALES//
        String palabra;
        final String ERROR_ESPACIOS = "Por favor, introduzca una palabra que no tenga espacios en blanco.";
        //CUERPO DEL METODO//
        do
        {
            palabra = pideFrase();
        }while(palabra.contains(" "));
        return palabra;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Comprueba si la palabra aparece en la frase y cuántas veces, teniendo en cuenta las mayúsculas</p>            |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param frase es la frase en la que buscar.                                                                       |
     | @param palabra es la palabra que buscar en frase.                                                                |
     | @return el número de veces que aparece la palabra                                                                |
     | ~~~~<p>Método dirigido a: FrontEnd //  BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int buscaPalabraMayus (String frase, String palabra)
    {
        //VARIABLES LOCALES//
        int contadorApariciones = 0;
        int posicionActual = 0;
        final String PALABRA_ENCONTRADA = "Encontrada la palabra comenzando en la posicion: ";
        final String PALABRA_ACABA = "La palabra acaba en la posición: ";
        final String TOTAL_APARICIONES = "Total de apariciones de la palabra: ";
        //CUERPO DEL METODO//
        while(frase.contains(palabra))
        {
            System.out.println("BUSCAMOS PALABRA...");
            contadorApariciones++;
            System.out.println(PALABRA_ENCONTRADA + (posicionActual+frase.indexOf(palabra)));
            posicionActual = posicionActual + palabra.length() + frase.indexOf(palabra);
            System.out.println(PALABRA_ACABA + (posicionActual-1));
            frase = frase.substring(frase.indexOf(palabra) + palabra.length()); //estamos en la posicion en cuestion. La mete?
            System.out.println("");
        }
        System.out.println(TOTAL_APARICIONES + contadorApariciones);
        return contadorApariciones;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p></p>
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param                                                                                                  |
     | @return                                                                                                 |
     | ~~~~<p>Método dirigido a: FrontEnd //  BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void buscaPalabraSinMayus (String frase, String palabra)
    {        
        //CUERPO DEL METODO//
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        buscaPalabraMayus(frase, palabra);
    }
}