public class TestePonto2D {
    public static void main(String[] args) {
        Ponto2D ponto2d = new Ponto2D();
        ponto2d.definirCoordenadas(100.0, 300.0);

        for (double valor : ponto2d.obterCoordenadas()) {
            System.out.println(valor);
        }
    }
}
