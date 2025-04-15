public class TesteHeranca {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Honda", "City", 4);
        Hatch hatch = new Hatch("Uno", "Fiat", 2);

        System.out.println(carro.getMarca() + " - " + carro.getModelo() + " - " + carro.getPortas());
        System.out.println(hatch.getMarca() + " - " + hatch.getModelo() + " - " + hatch.getPortas());
    }
}
