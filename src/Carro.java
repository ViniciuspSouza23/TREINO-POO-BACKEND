public class Carro{
    //atributos
    private String nome;
    private String cor;
    private String marca;
    private int vel;

   public Carro(String nome , String cor , String marca){
        this.nome = nome;
        this.cor = cor;
        this.marca = marca;
    }
    public String getCor(){
        return cor;
    }
    public String getNome(){
        return nome;
    }
    public String getMarca(){
        return marca;
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
       public void setVel(int vel){
        this.vel = vel;
        if(vel < 0){
            System.out.println("VELOCIDADE NEGATIVA!");
        }
        else{
            System.out.println("Velocidade aceita");
        }

       }
    }