package com.epam.course.dao;

import com.epam.course.model.User;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * DAO interface.
 */
public interface UserDao {

    /**
     * Get all users list.
     *
     * @return all users list
     */
    List<User> getAllUsers() throws DataAccessException;

    /**
     * Get user by Id.
     *
     * @param userId user identifier.
     * @return user.
     */
    User getUserById(Integer userId) throws DataAccessException;

    /**
     * Get user by login.
     *
     * @param userLogin user login.
     * @return user
     * @throws DataAccessException
     */
    User getUserByLogin(String userLogin) throws DataAccessException;

    /**
     * Create new user.
     *
     * @param user user.
     * @return new user Id.
     * @throws DataAccessException
     */
    Integer addUser(User user) throws DataAccessException;

    /**
     * Update user.
     *
     * @param user user.
     * @throws DataAccessException
     */
    void updateUser(User user) throws DataAccessException;

    /**
     * Delete user.
     *
     * @param userId user id.
     * @throws DataAccessException
     */
    void deleteUser(Integer userId) throws DataAccessException;
}