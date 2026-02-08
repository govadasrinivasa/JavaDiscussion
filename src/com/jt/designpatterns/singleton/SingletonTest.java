package com.jt.designpatterns.singleton;

public class SingletonTest {

	static DatabaseConnectionPool db = null;
	
	public static void main(String[] args) {
		
		try {
			db = DatabaseConnectionPool.getInstance();
			db.logConnectionStatus();
			db = DatabaseConnectionPool.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
/*
 * Class
 */
final class DatabaseConnectionPool {
    // volatile ensures visibility of changes across threads
    private static volatile DatabaseConnectionPool instance; 
    private String connectionStatus;

    // Private constructor prevents external instantiation
    private DatabaseConnectionPool() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance.");
        }
        this.connectionStatus = "Connected to Database";
    }

    // Public static method provides global access
    public static DatabaseConnectionPool getInstance() {
        // Double-checked locking for thread safety and performance
        if (instance == null) {
            synchronized (DatabaseConnectionPool.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionPool();
                }
            }
        }
        return instance;
    }

    public void logConnectionStatus() {
        System.out.println(connectionStatus);
    }
}