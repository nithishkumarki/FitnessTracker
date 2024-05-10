import java.util.*;
class fitnessTracker
{
    static int totalUser=0;
    static ArrayList<User>Userobj=new ArrayList<>();
static class User
{
    public String name;
    public String password;
    public int age;
    public int weight;
    public int height;
    public String goals;
    public int walk;
    public int swim;
    public int run;
    public int cal;
    
    User(String n,String pass,int a,int w,int h,String aim,int wa,int sw,int ru,int ca)
    {
        name=n;
        password=pass;
        age=a;
        weight=w;
        height=h;
        goals=aim;
        walk=wa;
        swim=sw;
        run=ru;
        cal=ca;
    }
    public String getUserName()
    {
        return name;
    }
    public String getUserPassword()
    {
        return password;
    }
    public void displayDetails(Scanner obj)
    {
        System.out.println("PROFILE:");
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("weight: "+weight);
        System.out.println("height: "+height);
        System.out.println("goals: "+goals);
        
       System.out.println("Enter 1 for activity tracking:\n");
       System.out.println("Enter 2 for WorkoutPlans:\n");
       System.out.println("Enter 3 to return to lobby:\n");
       int dum=obj.nextInt();
       if(dum==1)
       {
          System.out.println("Activity Tracking:");
          System.out.println("routine walking distance in Km:"+walk);
          System.out.println("routine running distance in Km:"+run);
          System.out.println("routine swiming distance in Km:"+swim);
          System.out.println("routine calories Burns:"+cal);
       }
       if(dum==2)
       {
           System.out.println("press 1:Beginner\npress 2:Intermetiate\npress 3:Survival");
           int mod=obj.nextInt();
           if(mod==1)
           {
               System.out.println("Workout Schedule");
               System.out.println("jogging: 5min");
               System.out.println("running: 5min");
               System.out.println("pushUps: 5");
               System.out.println("plank: 30s");
           }
           else if(mod==2)
           {
               System.out.println("Workout Schedule");
               System.out.println("jogging: 10min");
               System.out.println("running: 10min");
               System.out.println("pushUps: 15");
               System.out.println("plank: 60s");
           }
           else if(mod==3)
           {
               System.out.println("Workout Schedule");
               System.out.println("jogging: 20min");
               System.out.println("running: 20min");
               System.out.println("pushUps: 20");
               System.out.println("plank: 120s");
           }
           else{
               System.out.println("your out by your custom plan mate");
               return;
           }
       }
       else{
           
           return;
       }
    }
   
}
    
  
    static void signUp(Scanner obj)
    {
        String name,password,goal,AT;
        int age,height,weight,walk,run,swim,cal;
        
        System.out.println("enter name");
        name=obj.nextLine();
        System.out.println("enter password");
        password=obj.nextLine();
        System.out.println("enter age");
        age=obj.nextInt();
        System.out.println("enter height");
        height=obj.nextInt();
        System.out.println("enter weight");
        weight=obj.nextInt();
        System.out.println("enter goals");
        goal=obj.nextLine();
        goal=obj.nextLine();
        System.out.println("enter ActivityTracking");
        System.out.println("enter your routine walking distance: ");
        walk=obj.nextInt();
        System.out.println("enter your routine running distance: ");
        run=obj.nextInt();
        
        System.out.println("enter your routine swiming distance: ");
        swim=obj.nextInt();
        
        System.out.println("enter your routine calories burn!!: ");
        cal=obj.nextInt();
        
        
         
        User newUser=new User(name,password,age,height,weight,goal,walk,run,swim,cal);
        Userobj.add(newUser);
        totalUser++;
        System.out.println("SignedUp Scussefully");
     
    }
    
   static void login(Scanner obj)
   {
    System.out.print("enter username: ");
       String username = obj.nextLine();
      System.out.print("enter password: ");
    String password = obj.nextLine();

    for (int i = 0; i < totalUser; i++)
    {
        User user = Userobj.get(i);
        String dumName=user.getUserName();
        String dumPassWord=user.getUserPassword();
        if (dumName.equals(username) && dumPassWord.equals(password))
        {
          user.displayDetails(obj);
          return;
        }

    }
    
    System.out.println("password and name not found!!\n");
    

}
    public static void main(String arg[])
    {
        Scanner obj=new Scanner(System.in);
        int choice;
        
        while(true)
        {
            System.out.println("Enter 1 to login:\nEnter 2 to signUp:\nEnter 3 to exit:");
            choice=obj.nextInt();
            obj.nextLine();
            switch(choice)
            {
                case 1:
                    login(obj);
                    break;
                case 2:
                    signUp(obj);
                    break;
                case 3:
                    System.out.println("thanks for coming");
                    break;
                default:
                   System.out.println("invalid choice");
                   break;
                   
            }
            
            
        }
    }
}