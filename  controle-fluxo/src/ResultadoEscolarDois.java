/*Condicionais encadeadas */
public class ResultadoEscolarDois {
    public static void main(String[] args) {
        int nota = 4;

	if (nota >= 6)
		System.out.println("Aprovado");
	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
