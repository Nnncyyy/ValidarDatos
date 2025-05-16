import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
            
        System.out.println("------ Formulario de Registro ------");
        System.out.println();

        boolean validarEdad = false;

        while (!validarEdad){
        
            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            try{
                Validar.validarEdad(edad);
                validarEdad = true;  
            } catch (EdadInvalidaException e){
                System.err.println("ERROR: " + e.getMessage());
                validarEdad = false;
            }
        }
        
        boolean validarContraseña = false;

        while (!validarContraseña){ 
            
            System.out.print("Contraseña: ");
            String contraseña = scanner.nextLine();
            
            try{
                    
                Validar.validarCampoVacio(contraseña, "contraseña");
                Validar.validarPassword(contraseña);   
                validarContraseña = true;  
            } catch (FormatoInvalidoException | PasswordInseguraException e){
                System.err.println("ERROR: " + e.getMessage());
                validarContraseña = false;
            }
                    
        } 
        
        boolean validarEmail = false;

        while (!validarEmail){
            System.out.print("Email: ");
            String email= scanner.nextLine();

            try{
                Validar.validarCampoVacio(email, "email");
                Validar.validarEmail(email);
                validarEmail = true; 
            } catch (FormatoInvalidoException | EmailInvalidoException e){
                System.err.println("ERROR: " + e.getMessage());
                validarEmail = false;
            }
        }

        System.out.println("Formulario registrado con éxito!!!! :D");
    }
}