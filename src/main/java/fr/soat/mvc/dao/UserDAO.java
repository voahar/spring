package fr.soat.mvc.dao;

import fr.soat.mvc.dao.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by formation on 25/03/2014.
 */
public interface UserDAO extends CrudRepository<User, Integer> {
}
