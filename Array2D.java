class Array2D {
    public static void main (String args [])  
    {  
        double darray [][]= {{1,1,1,1},{2,2,2,2},{3,3,3,3}};  
        int i,j;  
        System.out.println("Elements of darray are as below.");
        for (i = 0; i<3; i++)  
        {
            for (j = 0; j<4; j++)  
                System.out.print(darray [i][j] + " ");
            System.out.println();}  
            System.out.println("Length of darray = " + darray.length);  
            System.out.println("Length of darray[1] = " + darray[1]. length);
            System.out.println("Length of darray[2] = " + darray[2]. length);
            System.out.println("Elements of darray after squaring are as below.");  
            for (i = 0; i<3; i++)  
            {
                for (j = 0; j<4; j++)  // squaring each element of array before output  
                    System.out.print(Math.pow(darray[i][j], 2.0) + " ");  
                System.out.println();
        }
    }
}
