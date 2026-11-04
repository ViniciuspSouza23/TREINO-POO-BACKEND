public class Carro{
    //atributos
    String nome;
    String cor;
    String marca;
    private int vel;

   public Carro(String nome , String cor , String marca , int vel){
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
        this.vel = vel;
    }

    //metodos 
   public void acelerar(int aceleracao){
        vel+=aceleracao;
    }

        public void freiar(int parar){
            vel-=parar;
        }
        public int getVel(){
            return vel;
        }
    }