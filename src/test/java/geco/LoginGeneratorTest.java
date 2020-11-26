package geco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    @Before
    public void setUp() throws Exception {
        LoginService loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateLoginForNomAndPrenom() {
        LoginService loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
       String login =  loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(login.equals("PDUR"));
    }
}