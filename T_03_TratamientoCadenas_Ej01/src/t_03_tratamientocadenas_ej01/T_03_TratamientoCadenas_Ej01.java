package t_03_tratamientocadenas_ej01;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 12:13:18 PM<p>                                                              *
 * <p>fecha de finalizacion: May 29, 2019 12:13:18 PM<p>                                                                *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej01.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 * <p>Para una mejor visualización del documento: Right Margin: 121                                                     *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>1. Implementa un programa en Java que pida al usuario una frase y diga cuál es su                                 *
 * longitud.</p>                                                                                                        *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 11 minutos 42 segs</p>                                                          *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej01 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar al método que pide la frase y después al método que da su longitud.</p>                                 *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String frase;

        //FRONTEND//
            //PETICION DE DATOS//
            frase = pideFrase();
        muestraLongitud(frase);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Pedir una frase y devolverla</p>                                                                              |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return La frase pedida                                                                                          |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    private static String pideFrase ()
    {
        //VARIABLES LOCALES//
        Scanner in = new Scanner(System.in);
        final String PETICION_FRASE = "Introduzca la frase: ";
        
        //CUERPO DEL METODO//
        System.out.println(PETICION_FRASE);
        return(in.nextLine());
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Mostrar un mensaje que de la cantidad de caracteres que hay en la frase recibida</p>                          |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param frase es la frase recibida por parámetro                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void muestraLongitud (String frase)
    {
        //VARIABLES LOCALES//
        final String MENSAJE_LONGITUD_FRASE = "La longitud de la frase es: ";
        //CUERPO DEL METODO//
        System.out.println(MENSAJE_LONGITUD_FRASE + frase.length());
    }
}