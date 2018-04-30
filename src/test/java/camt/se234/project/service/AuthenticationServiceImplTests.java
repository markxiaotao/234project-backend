package camt.se234.project.service;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import org.junit.Before;
import org.junit.Test;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceImplTests {
    AuthenticationServiceImpl authenticationService;
    UserDao userDao;
    @Before
    public void setup(){
        userDao = mock(UserDao.class);
        authenticationService = new AuthenticationServiceImpl();
        authenticationService.setUserDao(userDao);
    }

    @Test
    public void testAuthenticate(){
        User user = new User(000001L,"IWannaQuit","HardWeek","Staff");
        when(userDao.getUser("IWannaQuit","HardWeek")).thenReturn(user);
        assertThat(userDao.getUser("IWannaQuit","HardWeek"),is(user));
    }
}
