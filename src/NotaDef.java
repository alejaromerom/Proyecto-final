import java.util.Scanner; 
public class NotaDef {
    
        // variables para cade nota 
    
        double notaPrimerCorte;
        double notaSegundoCorte ;
        double notaTercercorte ;
    
        double cal1,cal2,cal3, def; 
    
        Scanner entrada = new Scanner (System.in); 
        //metodo para capturar las notas 
    
        public void IngresarNotas()
        {
    
            System.out.println("Ingrese las notas notas del estudiante"); 
            System.out.println("Ingrese nota del primer corte:");
            notaPrimerCorte=entrada.nextDouble();
            System.out.println("Ingrese nota del segundo corte:");
            notaSegundoCorte=entrada.nextDouble();
            System.out.println("Ingrese nota del tercer corte:");
            notaTercercorte=entrada.nextDouble();
        }
            public void CalculoNotas() {
                cal1 = notaPrimerCorte*0.35;
                cal2 = notaSegundoCorte*0.35;
                cal3 = notaTercercorte*0.30;
                def = cal1 + cal2 + cal3;
            }
           
            
            public void MostrarResultados() {
                System.out.println("Nota 1: " + notaPrimerCorte);
                System.out.println("Nota 2: " + notaSegundoCorte);
                System.out.println("Nota 3: " + notaTercercorte);
                System.out.println("Acumulado nota Primer Corte: " + cal1);
                System.out.println("Acumulado nota Segundp Corte: " + cal2);
                System.out.println("Acumulado nota Tercer Corte: " + cal3);
                System.out.println("Nota definitiva: " + def);
            }
    
    
            public void Mensaje() {
                if(def >= 3 && def <=5) {
                    System.out.println ("El estudiante aprueba");
                }else {
                    if(def >= 1.9 && def <3) {
                        System.out.println("El estudiante habilita");
                    }else {
                        if(def >= 0 && def <1.9) {
                            System.out.println("El estudiante reprueba");
                        }else {
                            System.out.println("Error en las notas ingresadas");
                        }
                    }
                }
            }
}
