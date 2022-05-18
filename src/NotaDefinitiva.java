import java.util.Scanner;

public class NotaDefinitiva{ 
    public static void main(String[] args) throws Exception {
        NotaDef fc = new NotaDef(); 
        fc.IngresarNotas();
        fc.CalculoNotas();
        fc.MostrarResultados();
        fc.Mensaje();
    }
}
