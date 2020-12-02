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
       String CT1 =  loginGenerator.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(CT1.equals("PDUR"));
        String CT2 = loginGenerator.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(CT2.equals("JRAL2"));
        String CT3 = loginGenerator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(CT3.equals("JROL1"));
        String CT4 = loginGenerator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertTrue(CT4.equals("PDU"));
    }

    @Test
    public void generateLoginForNomAndPrenomInf3(){
        LoginService loginService = new LoginService(new String[] {"JROL",
                "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
        LoginGenerator loginGenerator = new LoginGenerator(loginService);
        String CT1 =  loginGenerator.generateLoginForNomAndPrenom("Du","Paul");
        assertTrue(CT1.equals("PDU"));
    }
}