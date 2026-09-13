public class Recursividades {

    public int CalcularFactorial(int num) {

        // Caso base
        if (num == 1) {
            return 1;
        }

        // Caso general
        return num * CalcularFactorial(num - 1);
    }

    public int SumarNumeros(int numero) {

        // Caso base
        if (numero == 1) {
            return 1;
        }

        // Caso general
        return numero + SumarNumeros(numero - 1);
    }
}