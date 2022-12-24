package com.psj;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.psj.dao.UserDao;
import com.psj.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mybatisplus02DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        // ---------------条件查询-三种使用方式----------------
        //方式一：非lambda格式
//        QueryWrapper qw = new QueryWrapper();
//        qw.lt("age",18);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

        //方式二：lambda格式之QueryWrapper
//        QueryWrapper<User> qw = new QueryWrapper<User>();
//        qw.lambda().lt(User::getAge, 10);
//        List<User> userList = userDao.selectList(qw);
//        System.out.println(userList);

        //方式三：lambda格式之LambdaQueryWrapper(常用)
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge, 10);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
        // ---------------条件查询-三种使用方式----------------

        // ---------------条件查询-并且与或者关系----------------
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //并且关系：10到30岁之间
//        //lqw.lt(User::getAge, 30).gt(User::getAge, 10);
//        //或者关系：小于10岁或者大于30岁
//        lqw.lt(User::getAge, 10).or().gt(User::getAge, 30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
        // ---------------条件查询-并且与或者关系----------------

        // ---------------条件查询-null判定----------------
        //模拟页面传递过来的查询数据
//        UserQuery uq = new UserQuery();
//        uq.setAge(10);
//        uq.setAge2(30);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.lt(User::getAge, uq.getAge2());
          // 如果uq.getAge不为null才会将lqw.gt连在lqw.lt后面
//        if( null != uq.getAge()) {
//            lqw.gt(User::getAge, uq.getAge());
//        }
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //先判定第一个参数是否为true，如果为true连接当前条件
////        lqw.lt(null != uq.getAge2(),User::getAge, uq.getAge2());
////        lqw.gt(null != uq.getAge(),User::getAge, uq.getAge());
          // 使用链式也可
//        lqw.lt(null != uq.getAge2(),User::getAge, uq.getAge2())
//           .gt(null != uq.getAge(),User::getAge, uq.getAge());
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
        // ---------------条件查询-null判定----------------

        //------------------查询投影-查询指定字段-----------------
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        lqw.select(User::getId,User::getName,User::getAge);
//        QueryWrapper<User> lqw = new QueryWrapper<User>();
//        lqw.select("id","name","age","tel");
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
        //------------------查询投影-查询指定字段-----------------

        //------------------查询投影-聚合和分组查询-----------------
//        QueryWrapper<User> lqw = new QueryWrapper<User>();
//        lqw.select("count(*) as count, tel");
//        lqw.groupBy("tel");
//        List<Map<String, Object>> userList = userDao.selectMaps(lqw);
//        System.out.println(userList);  // 输出[{count=2,tel=123456},{count=2,tel=111234},...]
        //------------------查询投影-聚合和分组查询-----------------

        //------------------查询条件--------------------
//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //等同于=
//        lqw.eq(User::getName,"Jerry").eq(User::getPassword,"jerry");
//        User loginUser = userDao.selectOne(lqw);
//        System.out.println(loginUser);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //范围查询 lt le gt ge eq between
//        lqw.between(User::getAge,10,30);
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);

//        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
//        //模糊匹配 like
//        lqw.likeLeft(User::getName,"J");
//        List<User> userList = userDao.selectList(lqw);
//        System.out.println(userList);
        //------------------查询条件--------------------
    }
}
