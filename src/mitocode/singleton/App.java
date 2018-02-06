package mitocode.singleton;

public class App {
    public static void main(String[] args) {

       /* CountryDAOImpl countryDAO = new CountryDAOImpl();
        for(Object obj : countryDAO.getCountry()){
            System.out.println(((Country)obj).getName());
        }*/

        //Con Singleton: Permite tener una única instancia de la clase, con esta se puede acceder a todos los métodos de la clase.
        // Se accede cuando tenemos la instancia como static y los métodos static.

        CountryDAOImpl dao = CountryDAOImpl.getInstancia();
        for(Object object : dao.getCountry()){
            System.out.println(((Country)object).getName());
        }
    }
}
