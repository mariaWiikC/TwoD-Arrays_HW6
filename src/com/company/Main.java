package com.company;

import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        int n = 5;
        int[][] p = new int[n][n];
        int z = 1, top = 0, bottom = 4, left = 0, right = 4;
        while (z <= n * n)
        {
            for (int i = left; i <= right; i++)
            {
                p[top][i] = z;
                z++;
            }
            top++;
            for (int j = top; j <= bottom; j++)
            {
                p[j][right] = z;
                z++;
            }
            right--;
            for (int i = right; i >= left; i--)
            {
                p[bottom][i] = z;
                z++;
            }
            bottom--;
            for (int j = bottom; j >= top; j--)
            {
                p[j][left] = z;
                z++;
            }
            left++;
        }
        for (int[] a : p)
            System.out.println(Arrays.toString(a) + " ");
    }
}
