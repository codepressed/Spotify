package codepressed.spotify.service;

import codepressed.spotify.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
}
