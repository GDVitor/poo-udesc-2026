package exercicio1oo.classes;

class TestaAluno {
    public static void main(String[] args) {

    }

    {
        Aluno GDVitor = new Aluno();

        GDVitor.matrícula = "123";
        GDVitor.nome = "GD Vitor";
        GDVitor.idade = 18;
        GDVitor.nota1 = 6;
        GDVitor.nota2 = 7;
        GDVitor.nota3 = 6;
        GDVitor.nota4 = 9;

        System.out.println("Matrícula = " + GDVitor.matrícula);
        System.out.println("Nome = " + GDVitor.nome);
        System.out.println("Idade = " + GDVitor.idade);
        System.out.println("Nota 1 = " + GDVitor.nota1);
        System.out.println("Nota 2 = " + GDVitor.nota2);
        System.out.println("Nota 3 = " + GDVitor.nota3);
        System.out.println("Nota 4 = " + GDVitor.nota4);
    }
}
