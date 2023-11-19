import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//    Adding Owner
        Owner owner =new Owner("Owner","1","london","12-2-1960",0);


//      Adding  employees

        Employee employee1=new Employee("John","Davis","247 london Street london","12-10-1987"," Lion caretaker",10000,100000,"john@gmail.com");
        Employee employee2=new Employee("Chris","Havens","5331 Rex ford court London","15-11-1990","Panda caretaker",7000,100000,"chris@gmail.com");
        Employee employee3=new Employee("Dave","Stark","8642 Yule Street Arvada london","19-1-1985","Tortoise caretaker",15000,100000,"dave@gmail.com");
        Employee employee4=new Employee("Smith","Rogers","1695 Terrylane goldenstreet london","1-2-1977","Camel caretaker",20000,100000,"smith@gmail.com");


//      Adding environment

        Tropical tropical =new Tropical(0,25,"Warm");
        Forest forest =new Forest(0,15,"Warm");
        Aquatic aquatic =new Aquatic(0,30,"Cold");
        Desert desert=new Desert(0,35,"Hot");


        System.out.println("-----------Welcome to Zoo Management System----------------");

//      Creating array of objects

        Adult[] adults = new Adult[10000];
        Child[] children = new Child[1000];
        Employee[] employee =new Employee[1000];
        Lion[] lions=new Lion[1000];
        Panda [] pandas=new Panda[1000];
        Camel[] camels=new Camel[1000];
        Tortoise[] tortoises=new Tortoise[1000];

//     Adding animals

        lions[0]=new Lion("Mia",10);
        pandas[0]=new Panda("Tony",3);
        camels[0]=new Camel("Julie",5);
        tortoises[0]=new Tortoise("Jackie",50);


//      Menu Driven

        int choice =1;
        int user_input = 0;


         while(choice==1){
             System.out.println("Enter the required Choice");

             System.out.println("1.Visitor Entry");
             System.out.println("2.Display Tickets sold");
             System.out.println("3.To display the amount collected");
             System.out.println("4.Display employee details");
             System.out.println("5.Display the number of employee:");
             System.out.println("6.Display the different environment");
             System.out.println("7.To display the visitor details");
             System.out.println("8.To Add employees");
             System.out.println("9.To Add animals");
             System.out.println("10.To Display animals details");
             System.out.println("11.To Display the environment Details");
             System.out.println("12.To display Animal Actions");

             boolean flag=true;
             while (flag)
             {
                 try
                 {
                     user_input=Integer.parseInt(in.next());
                     flag=false;
                 }
                 catch(Exception e)
                 {
                     System.out.println("Enter a valid input");
                     flag=true;
                 }
             }

             int i=0;
             int j=0;

             if(user_input==1){
                 System.out.println("1.For Child");
                 System.out.println("2.For Adult");

                 int a_or_c;
                 a_or_c =in.nextInt();
                 if (a_or_c==1){
                     System.out.println("Enter the first name ,last name , address ,date of birth,age");
                      children[i]=new Child(in.next(), in.next(), in.next(), in.next(), in.nextInt());
                      i+=1;
                      Owner.IncreaseMoney(30);
                 }
                 if (a_or_c==2){
                     System.out.println("Enter the first name ,last name , address ,date of birth,age");
                     adults[j]=new Adult(in.next(), in.next(), in.next(), in.next(), in.nextInt());
                     j+=1;
                     Owner.IncreaseMoney(50);
                 }

             }


             if(user_input==2){
                 System.out.println("Number of Adult ticket sold = "+Adult.no_of_ticket_sold );
                 System.out.println("Number of Child ticket sold = "+Child.no_of_ticket_sold );
                 System.out.println("Total amount = "+((Adult.no_of_ticket_sold* Adult.ticket_amount)+(Child.no_of_ticket_sold* Child.ticket_amt)));

             }
             if (user_input==3){
                 System.out.println("Total amount = "+((Adult.no_of_ticket_sold* Adult.ticket_amount)+(Child.no_of_ticket_sold* Child.ticket_amt)));

             }

             if (user_input==4){
                 System.out.println("Employee Details :");
                 System.out.println("Number of Employees : " + Employee.number_of_employee);
                 System.out.println(employee1.toString());
                 System.out.println(employee2.toString());
                 System.out.println(employee3.toString());
                 System.out.println(employee4.toString());
                 for (int k = 0; k < Employee.number_of_employee-4; k++) {
                     System.out.println(employee[k].toString());
                 }

             }
             if (user_input==5){
                 System.out.println("Number of Employees : " + Employee.number_of_employee);
             }
             if (user_input==6){
                 System.out.println("1.Tropical");
                 System.out.println("2.Forest");
                 System.out.println("3.Desert");
                 System.out.println("4.Aquatic");
             }
             if (user_input==7){
                 for (int k = 0; k < Adult.no_of_ticket_sold; k++) {
                     System.out.println(adults[k].toString());
                 }
                 for (int k = 0; k < Child.no_of_ticket_sold; k++) {
                     System.out.println(children[k].toString());
                 }
             }
             int e=0;
             if(user_input==8){
                 System.out.println("Enter the first name ,last name , address, DOB, Work type,salary ,security,email");
                 employee[e]=new Employee(in.next(), in.next(),in.next(),in.next(),in.next(),in.nextFloat(),in.nextLong(), in.next());
                 e+=1;
             }

             if (user_input==9){
                 System.out.println("1.To add lion");
                 System.out.println("2.To add Camel");
                 System.out.println("3.To add Tortoise");
                 System.out.println("4.To add Panda");
                 int l_c_t_p =in.nextInt();
                 int l=1;
                 int p=1;
                 int t=1;
                 int c=1;
                 if(l_c_t_p==1){
                     System.out.println("Enter name , age");
                     lions[l]=new Lion(in.next(),in.nextInt());
                     l+=1;
                     forest.increment();
                 }
                 if(l_c_t_p==2){
                     System.out.println("Enter name , age");
                     camels[c]=new Camel(in.next(),in.nextInt());
                     c+=1;
                     desert.increment();
                 }
                 if(l_c_t_p==3){
                     System.out.println("Enter name , age");
                     tortoises[t]=new Tortoise(in.next(),in.nextInt());
                     t+=1;
                     aquatic.increment();
                 }
                 if(l_c_t_p==4){
                     System.out.println("Enter name , age");
                     pandas[p]=new Panda(in.next(),in.nextInt());
                     p+=1;
                     tropical.increment();
                 }
             }
             if (user_input==10){
                 System.out.println("Animals details");
                 for (int k = 0; k < Lion.number_of_animals; k++) {
                     System.out.println(lions[k].toString());


                 }
                 for (int k = 0; k < Panda.number_of_animals; k++) {
                     System.out.println(pandas[k].toString());

                 }
                 for (int k = 0; k < Tortoise.number_of_animals; k++) {
                     System.out.println(tortoises[k].toString());

                 }
                 for (int k = 0; k < Camel.number_of_animals; k++) {
                     System.out.println(camels[k].toString());

                 }
             }
             if(user_input==11){
                 System.out.println(forest.toString());
                 System.out.println(tropical.toString());
                 System.out.println(aquatic.toString());
                 System.out.println(desert.toString());
             }
             if (user_input==12){

                 lions[0].details();
                 System.out.println();
                 pandas[0].details();
                 System.out.println();
                 tortoises[0].details();
                 System.out.println();
                 camels[0].details();
                 System.out.println();
             }

             System.out.println("Do you want to continue Yes->1,No->0");
             choice=in.nextInt();

         }
    }
}