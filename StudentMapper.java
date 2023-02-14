package com.lcy.mapper;

import com.lcy.PoJo.Student;
import com.lcy.PoJo.User;
import org.apache.ibatis.annotations.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
      List<Student> selectAll();


      List<Student> selectByID(int ID);

               //多条件
      //方法有多个参数 使用@Param("sql参数占位符名称")
    //List<Student> condition(@Param("ID")int ID,@Param("NAME")String NAME,@Param("PERSON")String PERSON);

    //List<Student> condition(Student student);

    List<Student> condition(Map map);

    //单条件
    List<Student> conditionSingle(Student stu);

      //添加数据
      void add(Student student);

      //修改数据
      int update(Student student);

      //删除数据
     void deleteByID(int ID);

     //批量删除数据
    //void deleteByIDs(@Param("IDs")int[] IDs);

    void deleteByIDs(int[] IDs);

   //多参数 封装为Map 注解@Param 会替换map的arg键名
   // put(arg0,"参数1")
   // put(param1,"参数1")
    //put(arg1,"参数2")
    //put(param2,"参数2")
    //单参数 1.POJO类型 直接使用 属性名 参数占位符 一样
    //2.Map  直接使用 键名 参数占位符 一样
    //3.colletcion 封装Map put("arg0",collect集合) put("collection",collection集合)
    //4.Array 封装Map put("arg0",数组) put("array",数组)
    //5.其他类型 直接使用
    
//    User selectData(@Param("Username")String Username,String passwd);

    User selectData(Collection collections);

    @Select("select * from student")
  Student select_1();
}
