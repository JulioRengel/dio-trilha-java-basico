public class ExemploForArray {
    public static void main(String[] args) {

        // En Arrays el indice siempre tiene que inicir en CERO. 
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        /*for (int x=0; x<alunos.length; x++) { // length se refiere al tamaño del Array
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }*/

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    
    }
}
