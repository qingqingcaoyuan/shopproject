package shopproject;

import java.io.InputStream;
import java.math.BigDecimal;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.custom.ab.model.Book;
import com.custom.ab.service.BookService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:beans.xml"})
public class BookTest {
	@Autowired
	BookService bookService;
	
	SqlSessionFactory sqlSessionFactory;
	
//	@Before
	public void setUp() throws Exception {
		String sqlMapConfig = "spring-Mybatis.xml";
		//读取mybatis的核心配置文件
		InputStream in = Resources.getResourceAsStream(sqlMapConfig);
		//实例化会话工厂
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
	}
	
	@Test
	public void addBook(){
		Book book = new Book();
		book.setCategory("数学");
		book.setName("abcMath");
		book.setPrice(new BigDecimal(38.00));
		int rtn = bookService.addBook(book);
		System.out.println(rtn);
	}
	
	@Test
	public void testAddBook(){
		//打开会话
		SqlSession session = sqlSessionFactory.openSession();
		try{
			Book book = new Book();
			book.setCategory("数学");
			book.setName("abcMath");
			book.setPrice(new BigDecimal(38.00));
			
			int rtn = session.insert("com.custom.ab.model.Book", book);
			System.out.println(rtn);
		}finally{
			session.close();
		}
	}
}
