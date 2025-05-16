public class Validar {

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException ("Edad inválida");
        }
    }

    public static void validarPassword(String contraseña) throws PasswordInseguraException {
        int size = contraseña.length();

        if (size < 8){
            throw new PasswordInseguraException("La contraseña debe tener al menos 8 caracteres.");
        }

        boolean tieneMayuscula = false;
        boolean tieneNumero = false;

        for(int i = 0; i < size; i++){
            char caracter = contraseña.charAt(i);

            if (Character.isUpperCase(caracter)) tieneMayuscula = true;
            if (Character.isDigit(caracter)) tieneNumero = true;
        }

        if (!tieneMayuscula ) {
            throw new PasswordInseguraException("La contraseña debe tener al menos una mayúscula.");
        } else if (!tieneNumero) {
            throw new PasswordInseguraException("La contraseña debe tener al menos un número.");
        }
    }

    public static void validarEmail(String email) throws EmailInvalidoException {
        String formato_email = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";

        if (!email.matches(formato_email)) {
            throw new EmailInvalidoException("El correo electrónico no es válido.");
        }
    }

    public static void validarCampoVacio(String campo, String nombreCampo) throws FormatoInvalidoException {
        if (campo == null || campo.trim().isEmpty()) {
            throw new FormatoInvalidoException("El campo " + nombreCampo + " no puede estar vacío.");
        }
    }
}
