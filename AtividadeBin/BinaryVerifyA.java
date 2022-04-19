import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BinaryVerifyA {
    private Scanner sc = new Scanner(System.in);

    public void Run(){
        System.out.println("Insisra o IP abaixo");
        String num[] = sc.next().split("\\.");
        String numBin[] = new String[4];
        //Conversão dos Números para Binarios
        for(int i = 0; i<numBin.length; i++){
            numBin[i] = Integer.toBinaryString(Integer.parseInt(num[i]));
        }
        System.out.println(Arrays.stream(numBin).collect(Collectors.joining(".")));

        // Validação das Classes
        if(numBin[3].endsWith("10")){
            System.out.println("IP classe A");
        }
        else if(numBin[3].endsWith("00")|| numBin[3].endsWith("01")){
            System.out.println("IP classe B");
        }
        else if(numBin[3].endsWith("11")){
            System.out.println("IP classe C");
        }
    }
}
