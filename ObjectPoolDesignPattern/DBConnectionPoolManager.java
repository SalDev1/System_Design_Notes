package ObjectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    private List<DBConnectionDemo> freeConnectionsList = new ArrayList<>();
    private List<DBConnectionDemo> connectionsCurrentlyInUse = new ArrayList<>();

    private static final int INITAL_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 6;

    private static DBConnectionPoolManager dbConnectionPoolManagerInstance = null;

    private DBConnectionPoolManager() {
        for(int i = 0 ; i < INITAL_POOL_SIZE ; i++) {
            freeConnectionsList.add(new DBConnectionDemo());
        }
    }

    public static DBConnectionPoolManager getInstance() {
        if(dbConnectionPoolManagerInstance == null) {
            synchronized (DBConnectionPoolManager.class) {
                if(dbConnectionPoolManagerInstance == null) {
                    dbConnectionPoolManagerInstance = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManagerInstance;
    }

    public synchronized DBConnectionDemo getDBConnection() {
        if(freeConnectionsList.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE) {
            freeConnectionsList.add(new DBConnectionDemo());
            System.out.println("creating new connection and putting into the pool , free pool size : " + freeConnectionsList.size());
        } else if(freeConnectionsList.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("creating new connection and putting into the pool , as max limit reached");
            return null;
        }
        DBConnectionDemo dbConnection = freeConnectionsList.remove(freeConnectionsList.size() - 1);
        connectionsCurrentlyInUse.add(dbConnection);

        System.out.println("Adding db connection into the use pool , size : " + connectionsCurrentlyInUse.size());
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnectionDemo dbConnection) {
        if(dbConnection != null) {
            connectionsCurrentlyInUse.remove(dbConnection);
            System.out.println("Removing db connection from use pool , size : " + connectionsCurrentlyInUse.size());
            freeConnectionsList.add(dbConnection);
            System.out.println("Adding db connection into free pool , size : " + freeConnectionsList.size());
        }
    }
}
