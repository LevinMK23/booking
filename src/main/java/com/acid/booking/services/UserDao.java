package com.acid.booking.services;

import java.util.List;

import com.acid.booking.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

    private static final String GET_USER_BY_ID =
            "select * from user_info where user_id = :id";

    private static final String INSERT_USER = "insert into user_info " +
            "(name, surname, birth_date, login, password) " +
            "values (:name, :surname, :birthDate, :login, :password)";

    private static final RowMapper<User> ROW_MAPPER = (rs, num) -> User.builder()
            .id(rs.getInt("user_id"))
            .name(rs.getString("name"))
            .surname(rs.getString("surname"))
            .birthDate(rs.getString("birth_date"))
            .login(rs.getString("login"))
            .password(rs.getString("password"))
            .build();

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public UserDao(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getUsersList() {
        return jdbcTemplate.query("select * from user_info", ROW_MAPPER);
    }

    public User getUserById(int id) {
        return jdbcTemplate.query(GET_USER_BY_ID,
                new MapSqlParameterSource()
                        .addValue("id", id),
                ROW_MAPPER
        ).stream()
                .findAny()
                .orElse(null);
    }

    public void addNewUser(User user) {
        jdbcTemplate.update(INSERT_USER,
                new MapSqlParameterSource()
                        .addValue("name", user.getName())
                        .addValue("surname", user.getSurname())
                        .addValue("birthDate", user.getBirthDate())
                        .addValue("login", user.getLogin())
                        .addValue("password", user.getPassword())
        );
    }

}
