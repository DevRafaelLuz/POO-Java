public class TesteBicicleta {
    public static void main(String[] args) throws Exception {
        Bicicleta bike = new Bicicleta();
        bike.nome = "Caloi";
        bike.marcha = 5;
        bike.modelo = "ABC-123";

        bike.imprimir();
    }
}
