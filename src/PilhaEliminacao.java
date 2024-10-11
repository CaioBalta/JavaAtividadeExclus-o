public class PilhaEliminacao
{

    public static void removeMaiorEMenor(Pilha pilha)
    {
        Pilha auxiliar = new Pilha();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (!pilha.isEmpty())
        {
            int valor = pilha.pop();
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            auxiliar.push(valor);
        }

        while (!auxiliar.isEmpty()) {
            int valor = auxiliar.pop();
            if (valor != maior && valor != menor) {
                pilha.push(valor);
            }
        }
    }
}
