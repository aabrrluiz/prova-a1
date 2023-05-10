import java.util.Scanner; 
public class ProvaA1{
    public static void main(String[] args) {
        String nome;
        Double peso, aguaTomada, idealConsumodeAguaporDia, quantidadeQueFaltaIngerir;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o seu nome: ");
        nome = scanner.next();
        System.out.println("Informe o seu peso atual em quilos: ");
        peso = scanner.nextDouble();
        System.out.println("Informe a quantidade de água ingerida durante o dia em litros:  ");
        aguaTomada = scanner.nextDouble();
        
        idealConsumodeAguaporDia = Math.ceil((peso * 35)/1000);
        quantidadeQueFaltaIngerir = idealConsumodeAguaporDia - aguaTomada;
        
        System.out.println("\nNome: " + (nome));
        System.out.println("Seu peso atual é: " + peso);
        System.out.println("\nA quantidade de água ingerida no dia foi de: " + (aguaTomada) + " Litros");
        System.out.println("A quantidade ideal de água que você deve ingerir é: " + (idealConsumodeAguaporDia) + " Litros");
        
        if (quantidadeQueFaltaIngerir <= 0)
        System.out.println("Parabéns! Você atingiu a meta de hidratação diária.");
        else
        System.out.println("Continue focado em se hidratar por hoje, ainda faltam " + quantidadeQueFaltaIngerir + " de Litros");
        scanner.close();
    }
}