package itmo.prog.lab1;

import java.util.Arrays;
import static java.lang.Math.*;

public class Lab1 {
    Lab1()
    {
        Build.run();
    }

    public static class Build
    {
        public static void run()
        {
            ex();
        }
    }

    public static boolean checkArr(double x, int[] arr)
    {
        for (int num:arr)
        {
            if (x == num)
                return true;
        }
        return false;
    }

     static void ex()
     {
        //1
        int[] a = new int[]{15,13,11,9,7,5,3,1};
        System.out.println(Arrays.toString(a));
        //2
        int lengthX = 17;
        double left = -3.0;
        double right = 10.0;
        double[] x = new double[lengthX];
        for (int i = 0; i < lengthX; i++)
        {
            double randomX = (random() * (right - left)) + left;
            x[i] = randomX;
        }
        System.out.println(Arrays.toString(x));

        //3
        int s1 = 8;
        int s2 = 17;
        double[][] a2 = new double[s1][s2];
        for (int i = 0; i < s1; i++)
        {
            for (int j = 0; j < s2; j++)
            {
                double x1 = x[j];
                if (a[i] == 5)
                    a2[i][j] = pow(2*(pow(E,cbrt(x1)) - (3/4)) ,pow((pow(x1, x1 - 1) / 3),2));
                else if (checkArr(a[i], new int[]{1,3,13,15}))
                    a2[i][j] = pow(0.5 / (pow((0.25 * log10(abs(x1))),2) - 1), 3);
                else
                    a2[i][j] = pow(pow(E,pow(E,pow(PI*(4+x1), 2))) - 1, 3);
            }
        }

        for (int i = 0; i < a2.length; i++)
            for (int j = 0; j < a2[i].length; j++)
                System.out.printf("%.5f\t", a2[i][j]);
     }
}
