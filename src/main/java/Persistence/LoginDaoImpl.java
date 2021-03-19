package Persistence;

import Dependencies.IMysqlConnection;
import Dependencies.MysqlConnection;
import Models.User;
import Persistence.DAO.ILoginDao;

public class LoginDaoImpl implements ILoginDao {

    private IMysqlConnection imc;

    public LoginDaoImpl() {
        this.imc = new MysqlConnection(); // loose coupling
    }

    @Override
    public boolean verifyCredentials(User user) {
        return false;
    }


}
