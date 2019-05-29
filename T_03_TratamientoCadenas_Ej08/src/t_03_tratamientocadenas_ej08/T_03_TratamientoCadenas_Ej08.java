package t_03_tratamientocadenas_ej08;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 3:52:09 PM<p>                                                               *
 * <p>fecha de finalizacion: May 29, 2019 3:52:09 PM<p>                                                                 *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej08.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>8. Ahora escribe un método que elimine todos los espacios en blanco de una cadena de texto.</p>                   *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 08 minutos 08 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej08 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar al método sustituir</p>                                                                                 *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        //VARIABLES LOCALES//
        String cadena;
        //FRONTEND//
            //PETICION DE DATOS//
            cadena = pideFrase();
        //BACKEND//
        cadena = sustituir(cadena);
        System.out.println(cadena);
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
     | <p>Sustituye la constante sustituido por la constante sustituidor</p>                                            |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadena es la cadena en la que sustituir                                                                   |
     | @return la cadena en la que se ha sustituido sustituido por sustituidor.                                         |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String sustituir(String cadena)
    {   
        //VARIABLES LOCALES//
        final String sustituido = " ";
        final String sustituidor = "";
        //CUERPO DEL METODO//
        cadena = cadena.replace(sustituido, sustituidor);
        return cadena;
    }
}