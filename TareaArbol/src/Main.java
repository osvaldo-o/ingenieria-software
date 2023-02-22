import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Arbol> arboles = new ArrayList<>();
        arboles.add(new Arbol("Pino",17.2f,8.0f, 42,false));
        arboles.add(new Arbol("Manzano",10.0f, 4.6f, 20,true));
        arboles.add(new Arbol("Cerezo",5.8f, 2.4f, 38,true));
        arboles.forEach((arbol)->{
            System.out.println(arbol);
        });
    }
}