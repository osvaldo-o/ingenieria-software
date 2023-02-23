
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Asiento[][] teatro = new Asiento[10][8];

        Random reservado = new Random();
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 8; j++){
                if (i < 4){
                    teatro[i][j] = new Asiento(10,"Vip",reservado.nextBoolean());
                }else{
                    teatro[i][j] = new Asiento(6,"Regular",reservado.nextBoolean());
                }
            }
        }

        for (int i = 0; i < teatro.length; i++){
            System.out.print("Fila "+(i+1)+": ");
            Arrays.stream(teatro[i]).forEach(asiento -> {
                System.out.print("| "+asiento+" ");
            });
            System.out.print("|\n");
        }
    }
}