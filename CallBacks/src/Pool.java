import javax.swing.*;

public class Pool {

    public interface Interview{
        void pooling();
    }

    Interview pool;

    public void registerPool (Pool pool){
        this.pool = (Interview) pool;
    }

    public void findFalsch () {
        JOptionPane.showMessageDialog(null, "Программа начала выполняться");

        pool.pooling();
    }

}
