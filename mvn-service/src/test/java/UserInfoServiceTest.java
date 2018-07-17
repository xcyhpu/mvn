import com.xcy.maven.facade.api.IUserInfoService;
import com.xcy.maven.facade.api.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xuchunyang on 2018/7/17 15点04分
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-context.xml"})
public class UserInfoServiceTest {


    @Resource
    private IUserInfoService userInfoService;


    @Test
    public void testFetchUserById() {

        User user = userInfoService.getUserInfo(1l);

        System.out.println(user);

    }

    @Test
    public void testFetchUserById2() {

        User user = userInfoService.getUserInfo(1l);

        System.out.println(user);

    }


}
