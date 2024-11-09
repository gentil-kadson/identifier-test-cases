package testIdentifier;

public class IdentifierMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Uso: IdentifierMain <string>");
        } else {
            Identifier id = new Identifier();
            if (id.validadeIdentifier(args[0])) {
                System.out.println("Valido");
            } else {
                System.out.println("Invalido");
            }
        }
    }
}
