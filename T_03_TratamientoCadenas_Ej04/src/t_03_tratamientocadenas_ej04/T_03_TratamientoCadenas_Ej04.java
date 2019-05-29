package t_03_tratamientocadenas_ej04;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 1:15:53 PM<p>                                                               *
 * <p>fecha de finalizacion: May 29, 2019 1:15:53 PM<p>                                                                 *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej04.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>4. Implementa un programa en Java que pida al usuario palabras o frases hasta que introduzca una que termine con  *
 *    un punto “.”</p>                                                                                                  *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 5 minutos 29 segs</p>                                                   *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej04 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar al método pideFrase mientras que la condición se cumpla.</p>                                            *
    * <p>Nota que es una copia exacta al ejercicio anterior.</p>                                                        *
    * <p>Para esto sirve hacer código de calidad. Puede que ahora sea estúpido y una pérdida de tiempo, pero estas      *
    *    costumbres, a la larga, serán una buena práctica para estar preparado a la hora de enfrentarme a verdaderos    *
    *    desafíos, y no esto que es sólo largo y tedioso.</p>                                                           *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String frase;
        
        do
        {
            //FRONTEND//
                //PETICION DE DATOS//
                frase = pideFrase();
        }while(!compruebaInicioFrase(frase));

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
        final String PETICION_FRASE = "Por favor, introduzca la frase";
        //CUERPO DEL METODO//
        System.out.println(PETICION_FRASE);
        return(in.nextLine());
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p></p>
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param                                                                                                   |
     | @return                                                                                                  |
     | ~~~~<p>Método dirigido a: FrontEnd //  BackEnd</p>~~~~                                                           |
     |_________________________________________________________________________________________________________________*/
    static boolean compruebaInicioFrase (String frase)
    {
        //VARIABLES LOCALES//
        final String COMPROBACION = "."; //PARA ESTO SIRVE PONER LOS MENSAJES Y LOS PARÁMETROS EN CONSTANTES, FUTURO BAHA
        //CUERPO DEL METODO//
        if((frase.indexOf(COMPROBACION)) == 0)
            return true;
        else
            return false;
    }
}