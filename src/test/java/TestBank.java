import com.company.BankAccount;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestBank {
//    deposit newDeposit = new deposit();
BankAccount add = new BankAccount();

    @Test
    public void depositTest () {
        //int testBalance;
        //testBalance = add.deposit(100);
        assertEquals(100, add.deposit(0,100));
    }
    @Test
    public void depositTestFail(){
        assertNotEquals(0, add.deposit(5,-100));
    }

    @Test
    public void withdrawTest(){
        assertEquals(40,add.withdraw(40,50));
    }

    @Test
      public void withdrawTestFail() {
        assertNotEquals(60,add.withdraw(80,40));
    }
}




