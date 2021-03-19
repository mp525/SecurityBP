package Persistence.DAO;

import Models.User;

public interface ILoginDao {
    public boolean verifyCredentials(User user);
}
