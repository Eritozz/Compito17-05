public class App {
    public static void main(String[] args) throws Exception {

        
        Semaforo s1 = new Semaforo(2);
        Spogliatoio sp1 = new Spogliatoio();

        Persona p1 = new Persona("Rei",sp1);
        Persona p2 = new Persona("Enry", sp1);
        Persona p3 = new Persona("Samu", sp1);
        Persona p4 = new Persona("Gio", sp1);
        Persona p5 = new Persona("Xiao", sp1);
        Persona p6 = new Persona("Lore", sp1);
        Persona p7 = new Persona("Leo", sp1);
        Persona p8 = new Persona("Casty", sp1);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();
    }

    
}
