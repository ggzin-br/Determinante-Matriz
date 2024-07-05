public class Main {

    public static void main(String[] args) {
        Determinante mat = new Determinante( new Double[][] {
                                                           {2.0, 1.0, 2.0, 5.6}, 
                                                           {2.0, 3.0, 5.0, 1.5}, 
                                                           {1.0, 1.0, 1.0, 7.0},
                                                           {4.6, 1.9, 6.0, 5.7},
                                                          },
                                                           
                                                           4 );

        System.out.println(mat.calc());

        
    }
}