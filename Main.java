public class Main {

    public static void main (String [] args) {

        System.out.println("Hello world!");

        calculo(10, 30);

        int param1 = 10;
        int param2 = 30;

        var valor = suma(param1, param2);
        System.out.println(valor);

        Potato miPotato = new Potato();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        miPotato.QuitarBrazo();
        System.out.println(miPotato.brazos);

    }

    public static void calculo(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static class Potato {
        public int brazos = 0;

        public void QuitarBrazo() {
            this.brazos--;
        }

    }
}
