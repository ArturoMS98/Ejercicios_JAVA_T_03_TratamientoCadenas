package t_03_tratamientocadenas_ej05;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 1:22:21 PM<p>                                                               *
 * <p>fecha de finalizacion: May 29, 2019 1:22:21 PM<p>                                                                 *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej05.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>. Escribe un programa en Java que pida al usuario una palabra o frase y realice las siguientes sustituciones:</p> *
 * <p> Carácter Sustitución</p>                                                                                         *
 * <p>    a         4      </p>   ¿Esto debería ir en una tabla html no?                                                *
 * <p>    e         3      </p>   Debería dejar de usar los párrafos tanto! me estoy volviendo dependiente!             *
 * <p>    i         1      </p>   Como con determinados amigos, Dependiente == Débil                                    *
 * <p>    o         0      </p>                                                                                         *
 * <p>    t         7      </p>                                                                                         *
 * <p>    s         5      </p>                                                                                         *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 12 minutos 55 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej05 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar al método que pide una frase y al método que sustituye determinados caracteres de dicha frase por</p>   *
    * <p>números</p> ¿Debería poner así los párrafos para que se visualice mejor en JavaDoc?                            *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String frase;
        
        //FRONTEND//
            //PETICION DE DATOS//
            frase = pideFrase();
        frase = codificaFrase(frase);
        System.out.println(frase);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Recibe un String y codifica determinados caracteres a números</p>                                             |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param frase es la frase a codificar                                                                             |
     | @return La frase codificada                                                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String codificaFrase (String frase)
    {
        //VARIABLES LOCALES//
        final char SUSTITUTOa = '4';
        final char SUSTITUTOe = '3';
        final char SUSTITUTOo = '0';
        final char SUSTITUTOt = '7';
        final char SUSTITUTOs = '5';
        
        //CUERPO DEL METODO//
        frase = frase.replace('a', SUSTITUTOa);
        frase = frase.replace('3', SUSTITUTOe);
        frase = frase.replace('0', SUSTITUTOo);
        frase = frase.replace('t', SUSTITUTOt);
        frase = frase.replace('s', SUSTITUTOs);
        return frase.toUpperCase();
    }
    
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
        final String PETICION_FRASE = "Por favor, introduzca la frase";
        //CUERPO DEL METODO//
        System.out.println(PETICION_FRASE);
        return(in.nextLine());
    }
}