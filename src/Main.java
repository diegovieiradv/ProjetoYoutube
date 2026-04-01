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

        System.out.println(video[0].toString());
        System.out.println(gafanhoto[0].toString());
    }
}