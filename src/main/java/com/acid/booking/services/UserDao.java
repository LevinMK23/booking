package com.acid.booking.services;

import java.util.List;

import com.acid.booking.model.User;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDao {

//    private static final String GET_USER_BY_ID =
//            "select * from booking.users where id = :id";
//
//    private static final String INSERT_USER = "insert into booking.users " +
//            "(name, surname, birth_date) " +
//            "values (:name, :surname, :birthDate)";
//
//    private static final String USER_AUTH = "update booking.users " +
//            "set auth = :isAuth where id = :userId;";
//
//    private static final RowMapper<User> ROW_MAPPER = (rs, num) -> User.builder()
//            .id(rs.getInt("id"))
//            .name(rs.getString("name"))
//            .surname(rs.getString("surname"))
//            .birthDate(rs.getDate("birth_date"))
//            .build();
//
//    private final NamedParameterJdbcTemplate jdbcTemplate;
//
//    public UserDao(NamedParameterJdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<User> getUsersList() {
//        return jdbcTemplate.query("select * from booking.users", ROW_MAPPER);
//    }
//
//    public void authUser(int id) {
//        jdbcTemplate.update(USER_AUTH,
//                new MapSqlParameterSource("isAuth", true)
//                        .addValue("userId", id));
//    }
//
//    public void logoutUser(int id) {
//        jdbcTemplate.update(USER_AUTH,
//                new MapSqlParameterSource("isAuth", false)
//                        .addValue("userId", id));
//    }
//
//    public User getUserById(int id) {
//        return jdbcTemplate.query(GET_USER_BY_ID,
//                new MapSqlParameterSource()
//                        .addValue("id", id),
//                ROW_MAPPER
//        ).stream()
//                .findAny()
//                .orElse(null);
//    }
//
//    public void addNewUser(User user) {
//        jdbcTemplate.update(INSERT_USER,
//                new MapSqlParameterSource()
//                        .addValue("name", user.getName())
//                        .addValue("surname", user.getSurname())
//                        .addValue("birthDate", user.getBirthDate())
//        );
//    }

}
