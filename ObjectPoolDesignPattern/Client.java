package ObjectPoolDesignPattern;

public class Client {

    public static void main(String[] args) {
         DBConnectionPoolManager poolManager = DBConnectionPoolManager.getInstance();   

         DBConnectionDemo dbConnection1 = poolManager.getDBConnection();
         DBConnectionDemo dbConnection2 = poolManager.getDBConnection();
         DBConnectionDemo dbConnection3 = poolManager.getDBConnection();
         DBConnectionDemo dbConnection4 = poolManager.getDBConnection();
         DBConnectionDemo dbConnection5 = poolManager.getDBConnection();
        //  poolManager.getDBConnection();
         poolManager.releaseDBConnection(dbConnection5);
    }
}
