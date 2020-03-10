import java.util.Arrays;

public class FelderUndMehr {
    public static void main(String[] args) {
        // schauen wir uns ein altbekanntes array an
        int []feld = new int[] {1, 2, 3};

        // es gibt eine hilfsmethode die ein array ausgibt
        System.out.println(Arrays.toString(feld));
        System.out.println("-------------------");

        // 2 dimensionales array (array in array)
        int [][] feld2dim = new int [3][4];

        // einem element etwas zuweisen
        feld2dim[1][2] = 42;

        System.out.println(Arrays.toString(feld2dim));
        System.out.println(Arrays.toString(feld2dim[0]));
        System.out.println(Arrays.toString(feld2dim[1]));
        System.out.println(Arrays.toString(feld2dim[2]));

        // andere initialisierung
        int [][] feld2dim2 = new int [][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.toString(feld2dim2[0]));
        System.out.println(Arrays.toString(feld2dim2[1]));

        // ganz kur input string
        String str = "Hallo ZAM";
        System.out.println(str.length());

        // strins dürfen nicht mit == vergleichen werden (macht was anderses - cliffhanger)
        // aber equals kann verwendet werden
        System.out.println(str.equals("Hallo ZAM"));


    }
}
