package restfulclient;

public class EntityClassRestFulClientApp {
    
    public static void main(String[] args) {
        EntityClassRestFulClient rsclient = new EntityClassRestFulClient();
        System.out.println("Número de Clientes: " + rsclient.countREST());
    }
    
}
