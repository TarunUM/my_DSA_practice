package OOPS.singleton;

// constructor is not allowed outside of this class
// And only one object is created and returning the same reference to all the instance called outside of this class
public class SingletonClass {
    int num = 10;

    private SingletonClass(){

    }

    public SingletonClass(int num) {
        this.num = num;
    }

    private static SingletonClass instance;

    public static SingletonClass getInstance(int n){
        // check whether an obj is created or not
        // if not create one
        if(instance == null){
            instance = new SingletonClass(n);
        }
        return instance;
    }
}
