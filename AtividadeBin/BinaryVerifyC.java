import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinaryVerifyC {
    private Scanner sc = new Scanner(System.in);

    public void Run() {

        System.out.println("Insisra o IP HOST abaixo");
        String num[] = sc.next().split("\\.");
        int numBinHost[] = new int[4];
        for (int i = 0; i < num.length; i++) {
            numBinHost[i] = Integer.parseInt(num[i]);
        }
        System.out.println("Insisra a Mascará sub rede abaixo");
        String num2[] = sc.next().replace("/", ".").split("\\.");
        int numBinSub[] = new int[4];
        for (int i = 0; i < num.length; i++) {
            numBinSub[i] = Integer.parseInt(num2[i]);
        }
        int numRede[] = new int[4];
        String convert[] = new String[4];
        for (int i = 0; i < num.length; i++) {
            numRede[i] = numBinHost[i] & numBinSub[i];
            convert[i] = Integer.toBinaryString(numRede[i]);
        }
        System.out.println(Arrays.stream(convert).collect(Collectors.joining(".")));

        for (int i = 0; i < num.length; i++) {
            numRede[i] = numBinHost[i] & numBinSub[i];
            convert[i] = Integer.toString(numRede[i]);
        }
        System.out.println(Arrays.stream(convert).collect(Collectors.joining(".")));
    }
}
