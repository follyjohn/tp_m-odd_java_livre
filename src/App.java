public class App {

    public static void main(String[] args) throws Exception {

        Livre livre = new Livre("Une histoire de C<>ode","@_follyjohn",404);

        System.out.println(livre);

        livre.livrePersistant.enregister(livre);
        
        livre.imprimer();
    }
}
