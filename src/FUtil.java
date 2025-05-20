
import java.io.File;

	/*
	 * Esta clase es la que usamos para comprobar si un archivo existe o no
	 * @author isnag
	 */
public class FUtil {
    /**
     * Verifica si un archivo con el nombre especificado existe en el sistema de archivos.
     * 
     * @param filename El nombre del archivo. No puede estar vacío ni en blanco.
     * @return true si el archivo existe y false si no existe.
     * @throws IllegalArgumentException Si el nombre del archivo está vacío o tiene solo espacios.
     */
    public static boolean existe(String filename) throws IllegalArgumentException {
        if(filename.isBlank()||filename.isEmpty()) {
            throw new IllegalArgumentException("No válido");
        }
        File file = new File(filename);
        if (file.exists()) {
            return true;
        }
        return false;
    }
}