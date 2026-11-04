public class App {
    public static void main(String[] args) throws Exception {
         Carro c1 = new Carro("Civic" , "amarelo" , "Honda", 40);
         c1.acelerar(20);
         c1.freiar(10);
         System.out.println("Nome: "+ c1.nome);
         System.out.println("Marca: "+ c1.marca);
         System.out.println("Cor: "+ c1.cor);
         System.out.println(c1.getVel());
    }
}
