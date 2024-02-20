package OOPS.CommonPatterns.Singletons;

public abstract class PlatfromService {
    public static PlatfromService instance;

    private PlatfromService(){}

    public static PlatfromService getSingleton1(){
        return instance;
    }

    public abstract PlatfromService getInstance();

    static{
        if (System.getProperty("os.name").contains("Windows")) {
            System.out.println("Windows OS");
            instance = new Windows();
        } else if (System.getProperty("os.name").contains("Mac")) {
            System.out.println("Mac OS");
            instance = new Mac();
        } else {
            instance = new Linux();
            System.out.println("Linux OS");
        }
    }

    static class Mac extends PlatfromService {
        @Override
        public PlatfromService getInstance() {
            System.out.println("Mac Singleton");
            return null;
        }
    }
    
    static class Windows extends PlatfromService {
        @Override
        public PlatfromService getInstance() {
            System.out.println("Windows Singleton");
            return null;
        }
    }

    static class Linux extends PlatfromService {
        @Override
        public PlatfromService getInstance() {
            System.out.println("Linux Singleton");
            return null;
        }
    }
}
