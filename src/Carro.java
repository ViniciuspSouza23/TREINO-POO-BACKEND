public class Carro{
    //atributos
    String nome;
    String cor;
    String marca;
    int vel;

   public Carro(String nome , String cor , String marca , int vel){
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
        this.vel = vel;
    }

    //metodos 
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }

        void freiar(int parar){
            vel-=parar;
        }
    }