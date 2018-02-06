package mitocode.singleton;

import java.util.ArrayList;
import java.util.List;

//Patrón Singleton es poseer una única instancia de una clase en particular, en este caso es la clase CountryDAOImpl.
public class CountryDAOImpl {

    //1. paso tener una instancia statica
    public static CountryDAOImpl instancia = null;
    private List countries = null;

    //2. paso tener un constructor privado
    private CountryDAOImpl() {
    }

    //3. Paso Un método que me retorne una única instancia a la clase.

    public static CountryDAOImpl getInstancia() {
        if (instancia == null) {
            instancia = new CountryDAOImpl();
        }
        return instancia;
    }


    public List getCountry() {

        if (countries == null) {
            countries = new ArrayList();
            Country country = new Country("COLOMBIA");
            Country country2 = new Country("PERU");
            Country country3 = new Country("MEXICO");

            countries.add(country);
            countries.add(country2);
            countries.add(country3);
        }
        return countries;
    }
}
