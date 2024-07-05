import java.util.ArrayList;

public abstract class Matriz_Type extends Def {

    public Matriz_Type(Double[][] mat, int ordem) {
        this.mat = mat;
        this.ordem = ordem;
    } 

    /**/ // Get
    // Matriz 
    protected Double[][] cofator(int linha, int coluna) {
        return cofatorItem(linha, coluna);
    }
    protected Double det2grau() {
        return (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
    }

    /**/ // Métodos primitivos
    // ArrayList para Double[][]
    private Double[][] writeArray(ArrayList<Double> list) {
        Double[][] mat_temp = new Double[ordem - 1][ordem - 1];
        int i_list = 0;
        for (int i = 0; i < ordem - 1; i++) {
            for (int j = 0; j < ordem - 1; j++) {
                mat_temp[i][j] = list.get(i_list);
                i_list++;
            }
        }
    return mat_temp;
    }
    // Cofator
    private Double[][] cofatorItem(int linha, int coluna) {
        ArrayList<Double> mat_list = new ArrayList<>();
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                if (linha != i && coluna != j)
                    mat_list.add(mat[i][j]);
            }
        }
    return writeArray(mat_list);
    }

    public void printDebug() {
        System.out.printf("\n");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("|%.1f|", mat[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

}
