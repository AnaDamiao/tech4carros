import model.Carro;

public class App {
    public static void main(String[] args) {
        
        
        Carro gol = new Carro("BSD6432", 1664);
        //gol.setPlaca("BSD6432");
        //gol.setNumChassi(1664);

        System.out.printf("Carro contém a placa %s e o número do chassi %d",  gol.getPlaca(),gol.getNumChassi());

        

    }
}