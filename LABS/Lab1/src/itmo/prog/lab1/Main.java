package itmo.prog.lab1;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Main res = new Main();
        res.result(17, 8,7);
    }

    void result(int k, int s1, int s2) {
        //1
        int[] a = new int[]{15,13,11,9,7,5,3,1};

        //2
        double[] x = new double[k];
        for (int i = 0; i < k; i++) {
            x[i] = Random();
        }

        //3
        double[][] a2 = new double[s1][s2];
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                if (a[i] == 5)
                    a2[i][j] = pow(2 * (pow(E, cbrt(x[j])))- 3/4, pow(pow(x[j], x[j]-1), 2));
                else if (a[i] == 1 || a[i] == 3 || a[i] == 13 || a[i] == 15)
                    a2[i][j] = pow(0.5 / (pow((0.25 * log(abs(x[j]))),2) - 1), 3);
                else
                    a2[i][j] = pow(pow(E,pow(E,pow(PI*(4+x[j]), 2))) - 1, 3);
            }
        }

        //Print array
        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                System.out.printf("%1.5f\t", a2[i][j]);
            }
	    System.out.println();
        }
    }

    /**
     * Give u a random double number
     * @return
     */
    double Random() {
        double left = -3.0;
        double right = 10.0;
        return (Math.random() * (right - left)) + left;
    }
}
