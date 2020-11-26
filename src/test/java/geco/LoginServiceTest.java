package geco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    private  LoginService listLogin;
    @Before
    public void setUp() throws Exception {
             String[] ListTest = {"Ilyes","Max"};
            listLogin = new LoginService(ListTest);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loginExistsTrue() {
        boolean exist = this.listLogin.loginExists("Ilyes");
        assertTrue(exist);

    }

    @Test
    public void loginExistsFalse() {
        boolean exist = this.listLogin.loginExists("Lea");
        assertFalse(exist);

    }

    @Test
    public void addLogin() {
        this.listLogin.addLogin("Lea");
        boolean exist = this.listLogin.loginExists("Lea");
        assertTrue(exist);


    }

    @Test
    public void findAllLoginsStartingWith() {
        List<String> list = this.listLogin.findAllLoginsStartingWith("Il");
        List<String> result = new ArrayList<>();
        result.add("Ilyes");

        assertEquals(list,result);



    }

    @Test
    public void findAllLogins() {
        List<String> result= new ArrayList<>();

        result.add("Ilyes");
        result.add("Max");

        List<String> list = this.listLogin.findAllLogins();
        assertEquals(list,result);


    }



}