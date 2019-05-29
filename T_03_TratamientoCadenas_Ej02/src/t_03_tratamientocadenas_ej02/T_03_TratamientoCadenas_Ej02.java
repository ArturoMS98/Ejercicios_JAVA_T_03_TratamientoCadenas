package t_03_tratamientocadenas_ej02;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 12:26:18 PM<p>                                                              *
 * <p>fecha de finalizacion: May 29, 2019 12:26:18 PM<p>                                                                *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej02.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>2. Implementa un programa en Java que pida al usuario dos frases y diga:                                          *
 *      (a) Si son iguales, considerando que las mayúsculas son distintas de las minúsculas.                            *
 *      (b) Si son iguales, considerando que las mayúsculas son iguales a las minúsculas.</p>                           *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 19 minutos 32 segs</p>                                                          *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej02 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar al método pideFrase 2 veces y llamar a los métodos que averiguan si son iguales                         *
    *    o distintas dependiendo de si tienen en cuenta las mayúsculas o no.</p>                                        *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String frase1;
        String frase2;
        
        //FRONTEND//
            //PETICION DE DATOS//
            frase1 = pideFrase();
            frase2 = pideFrase();
        comparaCadenaConMayusculas(frase1, frase2);
        comparaCadenasSinMayusculas(frase1, frase2);
        //BACKEND//
    }
    
    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una frase y devolverla</p>                                                                              |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La frase introducida                                                                                     |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String pideFrase ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        final String PETICION_FRASE = "Por favor, introduzca una frase:";
        //CUERPO DEL METODO//
        System.out.println(PETICION_FRASE);
        return(in.nextLine());
    }
    
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Compara las cadenas recibidas y muestra si son iguales o no teniendo en cuenta las                            |
     |    mayúsculas.</p>                                                                                               |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadena1 es una de las cadenas a comparar                                                                  |
     | @param cadena2 es una de las cadenas a comparar                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void comparaCadenaConMayusculas (String cadena1, String cadena2)
    {
        //VARIABLES LOCALES//
        final String MENSAJE_IGUALES = "Las cadenas son iguales teniendo en cuenta las mayúsculas";
        final String MENSAJE_DISTINTAS = "Las cadenas son distintas teniendo en cuenta las mayúsculas";
        //CUERPO DEL METODO//
        if(cadena1.equals(cadena2))
            System.out.println(MENSAJE_IGUALES);
        else
            System.out.println(MENSAJE_DISTINTAS);
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Compara las cadenas recibidas y muestra si son iguales o no sin tener en cuenta las                           |
     |    mayúsculas.</p>                                                                                               |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadena1 es una de las cadenas a comparar                                                                  |
     | @param cadena2 es una de las cadenas a comparar                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void comparaCadenasSinMayusculas (String cadena1, String cadena2)
    {
        //VARIABLES LOCALES//
        final String MENSAJE_IGUALES = "Las cadenas son iguales sin tener en cuenta las mayúsculas";
        final String MENSAJE_DISTINTAS = "Las cadenas son distintas sin tener en cuenta las mayúsculas";
        //CUERPO DEL METODO//
        if(cadena1.equalsIgnoreCase(cadena2))
            System.out.println(MENSAJE_IGUALES);
        else
            System.out.println(MENSAJE_DISTINTAS);
    }
}