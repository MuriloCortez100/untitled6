import java.util.Scanner;
public class ATjava {
    public static void main(String[] args) {
        int tamanho;
        int valormaximo = 1;
        float soma1 = 0;
        float media1;
        float soma = 0;
        float media;
        int pos1, pos2, novovalor1, novovalor2;
        System.out.println("Digite o tamanho do vetor: ");
        Scanner scanner = new Scanner(System.in);
        tamanho = scanner.nextInt();
        int[] vet1 = new int [tamanho];
        System.out.println("Informe os valores que estarão no vetor.");
        for (int i = 0; i < tamanho; i ++){
            vet1[i] = scanner.nextInt();

        }
        for (int i = 0;i < tamanho; i++) {
            System.out.println(vet1[i]);
            soma = soma + vet1[i];
        }
        System.out.println("O valor da soma dos elementos é: " + soma);

        media = soma/tamanho;
        System.out.println("O valor da média desses elementos é: " + media);
        int maior = vet1[0];
        for(int i = 1; i < tamanho; i ++){
            if (vet1[i] > maior){
                maior = vet1[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maior);
        int menor = vet1[0];
        for(int i = 1; i < tamanho;i ++){
            if(vet1[i] < menor){
                menor = vet1[i];
            }
        }
        System.out.println("O menor valor do vetor é: " + menor);
        System.out.println("Digite a primeira posição do vetor que será substituída");
        pos1 = scanner.nextInt();
        System.out.println("Digite o novo valor: ");
        novovalor1 = scanner.nextInt();

        System.out.println("Digite a segunda posição do vetor que será substituída:");
        pos2 = scanner. nextInt();
        System.out.println("Digite o novo valor: ");
        novovalor2 = scanner.nextInt();

        vet1[pos1] = novovalor1;
        vet1[pos2] = novovalor2;

        for (int i = 0;i < tamanho; i++) {
            System.out.println(vet1[i]);
            soma1 = soma1 + vet1[i];
        }
        System.out.println("A nova soma é: " + soma1);
        media1 = soma1/ tamanho;
        System.out.println("A nova média é: " + media1);

    }
}
