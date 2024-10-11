public class App
{
    public static void main(String[] args)
    {
        Pilha pilha = new Pilha();
        
        pilha.push(30);
        pilha.push(10);
        pilha.push(20);
        pilha.push(50);
        pilha.push(40);

        System.out.println("Pilha original:");
        pilha.print();

        PilhaEliminacao.removeMaiorEMenor(pilha);

        System.out.println("Pilha após remover maior e menor:");
        pilha.print();
    }
}