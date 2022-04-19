import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
public class BinaryVerifyB{
    private Scanner sc = new Scanner(System.in);

    public void Run(){
        
        System.out.println("Insisra o IP abaixo");
        String num[] = sc.next().replace("/", ".").split("\\.");
        String numBin[] = new String[4];
        //conversão dos números para binario
        for(int i = 0; i<numBin.length; i++){
            numBin[i] = Integer.toBinaryString(Integer.parseInt(num[i]));
        }
        System.out.println(Arrays.stream(numBin).collect(Collectors.joining(".")));

        // Verificação da mascara padrão
        int mascParam = Integer.parseInt(num[4]);
        if(numBin[3].endsWith("10")){
            if(mascParam != 8){
                System.out.println("a mascará correta a ser usada é 8");
            }
            System.out.println("IP classe A");
        }
        else if(numBin[3].endsWith("00")|| numBin[3].endsWith("01")){
            if(mascParam != 16){
                System.out.println("a mascará correta a ser usada é 16");
            }
            System.out.println("IP classe B");
        }
        else if(numBin[3].endsWith("11")){
            if(mascParam != 24){
                System.out.println("a mascará correta a ser usada é 24");
            }
            System.out.println("IP classe C");
        }
    }
}