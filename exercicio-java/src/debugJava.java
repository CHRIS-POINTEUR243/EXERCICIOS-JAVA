public class debugJava {
    /* programa que testa o debug com Thread.dumpStack */

    public static void metodo_a() {
        System.out.println("Entrei no metodo a ");
        metodo_b();
        System.out.println("Sai no metodo a");
    }

    public static void metodo_b() {
        System.out.println("Entrei no metodo b");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        metodo_c();
        System.out.println("Sai no metodo b");
    }

    public static void metodo_c() {
        System.out.println("Entrei no metodo c");
         Thread.dumpStack();
        System.out.println("Sai no metodo c");
    }
    public static void main(String[] args) {
        metodo_a(); // Chamando metodo_a diretamente, pois agora é estático
    }
}
