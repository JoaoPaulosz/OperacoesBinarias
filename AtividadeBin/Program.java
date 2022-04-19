public class Program {
    public static void main(String[] args) {
        System.out.println("PRIMEIRA QUESTÃO:");
        BinaryVerifyA calc = new BinaryVerifyA();
        calc.Run();
        System.out.println("---------------------------------");
        System.out.println("SEGUNDA QUESTÃO:");
        BinaryVerifyB verfi = new BinaryVerifyB();
        verfi.Run();
        System.out.println("---------------------------------");
        System.out.println("TERCEIRA QUESTÃO");
        BinaryVerifyC verifyC = new BinaryVerifyC();
        verifyC.Run();

    }
}