public class Pilha
{
    Elemen top;
    int tamanho;

    public Pilha()
    {
        this.top = null;
        this.tamanho = 0;
    }

    public void push(int valor)
    {
        Elemen novo = new Elemen(valor);
        novo.proxi = this.top;
        this.top = novo;
        this.tamanho++;
    }

    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return '\0';
        }

        Elemen elem = top;
        int m = elem.valor;
        top = top.proxi;
        tamanho--;
        return m;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void print()
    {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            Elemen aux = this.top;
            while (aux != null) {
                System.out.println(aux.valor);
                aux = aux.proxi;
            }
        }
    }
}
