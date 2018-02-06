package mitocode.java8.interface_funtional;

@FunctionalInterface
public interface Operacion {
    double calcular(double n1, double n2);
    //int calcular2(); Si descomento esto, se mostraría un error ya que es una interfaz funcional, a menos
                        // que no use expresiones Lambdas
}
