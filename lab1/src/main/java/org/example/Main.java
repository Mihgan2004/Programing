package org.example;

public class Main {
    public static void main(String[] args) {
        float [] x = new float[19];
        short[] a = new short [19];
        float[][] a1 = new float[19][9];

        for( int i = 0; i < x.length; i++){
            x[i] = (float)((Math.random() * 25) - 6);
        }

        for (int i = 1; i < a.length; i += 2) {
            a[i] = (short) (i + 2);
        }

        for( int i= 0; i < 19; i++){
            for (int j = 0; j < 9; j++){
                if (a[i] == 19){
                    a1[i][j] = (float) Math.pow(Math.tan(x[j])/(0.5 - ((x[j]/2)*(x[j]/2))), 3);
                } else if (a[i] == 9 || a[i] == 12 || a[i] == 15 || a[i] == 17) {
                    a1[i][j] = (float) Math.pow((0.5 * (1 - Math.asin(Math.cos(x[j])))), 3);
                }else {
                    a1[i][j] = (float) Math.sin( Math.pow(Math.pow( Math.cos((double) x[j]), 2), 2));
                }
            }
        }
        for( float i[] : a1) {
            for (float j : i) {
                System.out.printf("%.2f", j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}