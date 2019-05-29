package t_03_tratamientocadenas_ej07;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: May 29, 2019 3:33:34 PM<p>                                                               *
 * <p>fecha de finalizacion: May 29, 2019 3:33:34 PM<p>                                                                 *
 * <p>nombre del proyecto: T_03_TratamientoCadenas_Ej07.java<p>                                                         *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_03_TratamientoCadenas.git">GIT</a></p>             *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>7. Basándote en los métodos que hemos visto para el tratamiento de cadenas, reescribe el método trim().</p>       *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 17 minutos 35 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_03_TratamientoCadenas_Ej07 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Llamar al sustitutoTrim() y comprobar que funciona</p>                                                         *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        String cadena = " soy una cadena  ";
                    
        //BACKEND//
        cadena = sustitutoTrim(cadena);
        System.out.println(cadena);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Borrar todos los espacios en blanco del principio y del final de una cadena</p>                               |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param cadena es la cadena a la que quitar los espacios en blanco.                                               |
     | @return La cadena sin espacios en blanco iniciales o finales.                                                    |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static String sustitutoTrim (String cadena)
    {
        //VARIABLES LOCALES//
        final String cadenaSustituir = " ";
        //CUERPO DEL METODO//
        while(cadena.indexOf(cadenaSustituir) == 0)
            cadena = cadena.substring(cadenaSustituir.length());
        while(cadena.lastIndexOf(cadenaSustituir) == (cadena.length()-1))
        {
            cadena = cadena.substring(0, (cadena.length()-1-cadenaSustituir.length()));
        }
        return cadena;
    }
}