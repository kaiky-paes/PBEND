public class media {
    public static void main(String[] args) {
        double r, v1, v2, v3, v4;
        v1 = 5; v2 = 7; v3 = 8; v4 = 9;
        r = (v1 + v2 + v3 + v4) / 4;
        if (r > 7) {
            System.out.println("A média foi de " + r + "e o aluno está aprovado!");
        }else{
            System.out.println("A média foi de " + r + "e o aluno esta reporvado!");
        }
    }
}