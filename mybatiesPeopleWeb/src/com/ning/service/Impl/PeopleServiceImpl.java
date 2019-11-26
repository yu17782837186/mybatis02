package com.ning.service.Impl;

        import com.ning.pojo.People;
        import com.ning.service.PeopleService;
        import org.apache.ibatis.io.Resources;
        import org.apache.ibatis.session.SqlSession;
        import org.apache.ibatis.session.SqlSessionFactory;
        import org.apache.ibatis.session.SqlSessionFactoryBuilder;


        import javax.annotation.Resource;
        import java.io.IOException;
        import java.io.InputStream;
        import java.util.List;
/*
 * 在数据访问层处理异常和控制器中处理异常，在service中值抛出异常
 *
 * */
public class PeopleServiceImpl implements PeopleService {
    @Override
    public List<People> show() throws IOException {
//        InputStream is = (InputStream) Resources.getResourceAsStream("mybatis.xml");
//        //前面是工厂       实例化工厂对象时使用的是  构建者设计模式   名称标志:后面有Builder
//        //构建者设计模式意义: 简化对象实例化过程
//        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//        SqlSession session = factory.openSession();
//        List<People> list = session.selectList("com.ning.mapper.PeopleMapper.selAll");
//        session.close();
//        return list;

        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        List<People> list = session.selectList("com.ning.mapper.PeopleMapper.selAll");
        session.close();
        return list;
    }
}
