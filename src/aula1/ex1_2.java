public class ex1_2 {

    public static boolean isInteger(String yStr) {

        for (int i = 0; i < yStr.length(); i++) {
            if (yStr.charAt(i) < '0' || yStr.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    public static int parseInteger(String yStr) {

        int xResultado = 0;

        for (int i = 0; i < yStr.length(); i++) {

            xResultado = xResultado * 10 + (yStr.charAt(i) - '0');
            }
        return xResultado;
    }

    public static void main(String[] args) {

        int inteiros = 0;
        int naoInteiros = 0;
        int somatorio = 0;

        for (String arg : args) {
            if (isInteger(arg)) {
                inteiros++;
                somatorio += parseInteger(arg);
            } else {
                naoInteiros++;
            }
        }

        System.out.println("Encontrei " + inteiros + " inteiros");
        System.out.println("Encontrei " + naoInteiros + " termos não inteiros");
        System.out.println("Somatorio dos inteiros: " + somatorio);
    }

}

