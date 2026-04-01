//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Video video[] = new Video[3];
         video[0] = new Video("Aula de POO");
         video[1] = new Video("Aula de Java");
         video[2] = new Video("Aula de JavaScript");

         Gafanhoto gafanhoto[] = new Gafanhoto[2];
         gafanhoto[0] = new Gafanhoto("João", 22, "M", "Jão123");
         gafanhoto[1] = new Gafanhoto("Maria", 30, "F", "Maria123");

        System.out.println(video[1].toString());
        System.out.println(gafanhoto[1].toString());

        Visualizacao v1[] = new Visualizacao[5];
        v1[0] = new Visualizacao(gafanhoto[0], video[1]);
        v1[1] = new Visualizacao(gafanhoto[0], video[2]);
        v1[2] = new Visualizacao(gafanhoto[1], video[1]);
        v1[3] = new Visualizacao(gafanhoto[1], video[2]);
        v1[4] = new Visualizacao(gafanhoto[0], video[0]);

        v1[0].avaliar();
        v1[0].avaliar(88.9f);
        v1[0].avaliar(10);
        v1[2].avaliar();
        v1[2].avaliar(88.9f);
        v1[2].avaliar(10);


        System.out.println(v1[0].toString());
    }
}