package com.w2x.ssm.mapper;

import com.w2x.ssm.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {
    @Insert("insert into users values(#{id}, #{username}, #{age}, #{gender})")
    void addUser(User user);

    @Delete("delete from users where id = #{id}")
    void delUser(int id);

    @Update("update users set id = #{id}, username = #{username}, age = #{age}, gender = #{gender} where id = #{id}")
    void updateUser(User user);

    @Select("select * from users")
    List<User> findAll();
}
