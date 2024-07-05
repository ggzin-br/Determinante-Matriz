import java.lang.reflect.Executable;
import java.util.ArrayList;

public class Determinante extends Matriz_Type implements Interf_Run {

    public Determinante(Double[][] mat, int ordem) {
        super(mat, ordem);
    }

    /**/ // Cofator
    @Override
        protected Double[][] cofator(int linha, int coluna) {
            return super.cofator(linha, coluna);
        }
    @Override
        protected Double det2grau() {
            return super.det2grau();
        }

    /**/ // Métodos primitivos
    Double det = 0.0;
    int temp = ordem;
    private Double cofElel() {
        Determinante inst = new Determinante(mat, ordem);

        inst.printDebug();

        if (inst.ordem >= 3) {
            for (int i = 0; i < temp; i++) {
            inst = new Determinante(cofator(0, i), inst.ordem - 1);
            det += 1 * mat[0][i] * inst.cofElel();
            }
            return det;

        } else {
            return det2grau();
        }

    }

    


    /**/ // Get
    @Override
    public Double calc() {
        return cofElel();
    }
    
}
