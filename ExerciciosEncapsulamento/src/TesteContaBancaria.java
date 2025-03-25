public class TesteContaBancaria {
    public static void main(String[] args) throws Exception {
        ContaBancaria cb = new ContaBancaria();
        System.out.println(cb.depositar(100.0));

        System.out.println(cb.getSaldo());

        System.out.println(cb.sacar(50.0));

        System.out.println(cb.getSaldo());
    }
}
