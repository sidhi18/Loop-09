public class Loops_09 {
    public static void main(String[] args) {
        // PATTERN PRINTING
        // 1--> Solid Rectangle
        int n = 4; // number of rows
        int m = 5; // number of columns
        // outer loop for rows
        for (int i=1;i<=n;i++){
            //  inner loop
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // 2--> Hollow Rectangle
        // outer loop for rows
        for (int a=1;a<=n;a++){
            // inner loop
            for (int b=1;b<=m;b++){
                if (a==1 || b==1 || a==n || b==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        //3--> Half Pyramid \ Right Angle Triangle
        // outer loop
        for (int c=1;c<=n;c++){
            //inner loop
            for (int d=1;d<=c;d++){
                System.out.print("*");
            }
            System.out.println();
        }


        //4-->Inverted Half Pyramid
        for (int e=n;e>=1;e--){
            for (int f=1;f<=e;f++){
                System.out.print("*");
            }
            System.out.println();
        }


        //5--> Inverted Half Pyramid (180) degree
        // for rows
        for (int g=1;g<=n;g++){
            // for spaces
            for (int h=g;h<=n-1;h++){
                System.out.print(" ");
            }
            // for star
            for (int h=1;h<=g;h++){
                System.out.print("*");
            }
            System.out.println();
        }


        //6--> Inverse Inverted Half Pyramid (180) degree
        for (int k = n; k >= 1; k--) {
            for (int l = 1; l <= n - k; l++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7--> Number Pyramid
        for (int o=1;o<=5;o++){
            for (int p=1;p<o+1;p++){
                System.out.print(p+" ");
            }
            System.out.println();
        }

        // 7(B)--> Inverse Number Pyramid
        for (int o1=5;o1>=1;o1--){
            for (int p=1;p<o1+1;p++){
                System.out.print(p+" ");
            }
            System.out.println();
        }


        // 8--> Floyd's Triangle
        int num = 1;
        for (int q=1;q<=5;q++) {
            for (int r = 1; r <=q; r++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }


        // 9--> 0-1 Triangle
        for (int s=1;s<=5;s++){
            for (int t=1;t<=s;t++){
                int sum = s+t;
                if (sum%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }



    }

    }

