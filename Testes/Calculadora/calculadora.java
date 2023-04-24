public class calculadora {
    public static void main(String[] args){
        Double x = Double.parseDouble(args[1]);//transformar strings em inteiros
        Double y = Double.parseDouble(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);

        } else if (args[0].equals("subtrair")) {
            minus(x, y);

        } else if (args[0].equals("dividir")) {
            divide(x, y);

        } else if (args[0].equals("multiplicar")) {
            times(x, y);

        } else {
            System.out.println("Nenhum comando intruído.");
        }
    }

    static void sum(double x, double y) {
        System.out.println(x + y);
    }
    
    static void minus(double x, double y) {
        System.out.println(x - y);

    }

    static void divide(double x, double y) {
        
        if (y == 0) {
            System.out.println("Não foi possível dividir, pois o dividendo é zero ");
        }else {

            double z = (x / y);
            System.out.println(z);

        }
        
    }

    static void times(double x, double y) {
        System.out.println(x * y);

    }
}
