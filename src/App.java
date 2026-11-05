public class App {
    public static void main(String[] args) throws Exception {
         Carro c1 = new Carro("Civic" , "amarelo" , "Honda" );
         System.out.println("Nome: "+ c1.getNome());
         System.out.println("Marca: "+ c1.getMarca());
         System.out.println("Cor: "+ c1.getCor());
         c1.setVel(20);
         c1.acelerar(20);
         c1.freiar(10);
         System.out.println(c1.getVel());
        }
}
