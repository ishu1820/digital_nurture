class Logger {
    
    private static Logger instance;

    private Logger(){
        System.out.println("Logger initialized");
    }

    public static Logger getInstance(){
       if(instance==null){
        instance = new Logger();
       }
       return instance;
    }
    public void log(String msg){
        System.out.println("log: "+ msg);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Logger person1 = Logger.getInstance();
        Logger person2 = Logger.getInstance();

         person1.log("This is the first message");
         person2.log("This is the second message");

         //condition check 
         if(person1==person2){
            System.out.println("Both the loggers refer to the same instance");
         }
         else{
            System.out.println("Both the loggers refer to the different instances.");
         }

    }
}
