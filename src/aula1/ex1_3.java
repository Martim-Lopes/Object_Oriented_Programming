import java.util.Scanner;

public class ex1_3{

    public static boolean compare(String [] yArgs, String yarg){

        for(int i = 0; i < yArgs.length; i++){
            if(yArgs[i].equals(yarg)) return true;
        }
        return false;
    }

    public static void main( String[] yArgs){

        String yResult = "";
        System.out.println("Frase: ");
        Scanner xScan = new Scanner(System.in);
        String yFrase = xScan.nextLine();
        String[] yPalavras = yFrase.split(" ");

        for(String yPalavra : yPalavras){

            if(!compare(yArgs, yPalavra)){
                yResult = yResult + yPalavra + " ";
            }
        }
        System.out.println("Filtrada: " + yResult);

        xScan.close();
        }

    }
