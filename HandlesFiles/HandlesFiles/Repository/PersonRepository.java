
package Repository;

import DataAcess.PersonDAO;

public class PersonRepository implements IPersonRepository {
    @Override
    public void findPersonInfo() {
        PersonDAO.Instance().findPersonInfo();
    }

    @Override
    public void copyNewFile() {
        PersonDAO.Instance().copyNewFile();
    }
}
