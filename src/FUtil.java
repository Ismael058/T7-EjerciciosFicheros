import java.io.File;
public class FUtil {
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