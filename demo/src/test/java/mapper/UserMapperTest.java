package mapper;

import com.wenxin.BootDemoApplication;
import com.wenxin.Service.UserService;
import com.wenxin.mapper.UserMapper;
import com.wenxin.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootDemoApplication.class)
public class UserMapperTest {
    @Autowired
    private UserService userservice;
    @Test
    public void testQuery(){
        User wx=new User();
        wx.setUsername("wen");
        User user=userservice.selectUserbyname(wx);
        System.out.println("user="+user);
    }

}