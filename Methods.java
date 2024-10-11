import java.time.LocalDateTime;
import java.util.Scanner;
public class Methods{

Scanner sc=new Scanner(System.in);
Message m[]=new Message[120];
int objcount=0;
int mgcount[]=new int[200];
int idcount[]=new int[200];

                                               // sender()
public void sender(){
System.out.println("\n\n\t\tWelcome to messaging app\n");
System.out.print("Enter sender name please: ");
String sender=sc.nextLine();
Message mm=new Message();
mm.setsender(sender);
}


                                                  //addcontact()

public void addcontact(){
int checker=0;
System.out.print("Enter the new number : ");
String receiver=sc.nextLine();
      if(objcount!=0){
          for(int i=0 ; i<objcount ; i++){
                 if(m[i].getreceiver().equals(receiver))
                      System.out.println("\t\tThis number is already added\n");
else 
   checker=1;
}//for
}//if
if(objcount==0)
    checker=1;
if(checker==1){
Message ms=new Message();
ms.setreceiver(receiver);
m[objcount++]=ms;
System.out.println("\t\tContact added successfully\n");
}
}


                                                     //display()
         
public void display(){//d

int checker=0;
System.out.print("Enter the number or name from your contacts : ");
String receivers=sc.nextLine();
    for(int i=0 ; i<objcount ; i++){  //for
           
            if(m[i].getreceiver().equals(receivers)==true){    
                checker=1;
                System.out.println("\n\t\tContact found.\n ");
                String messages[]=m[i].getmgContent();
                LocalDateTime time[]=m[i].getdt();
                int ID[]=m[i].getmgID();
                System.out.println("sender: "+m[i].getsender());
                System.out.println("receiver: "+m[i].getreceiver());      
                m[i].setstatus(true);             
                System.out.println("status: "+m[i].getstatus());
                System.out.println();
                    
                    for (int j=0 ; j<mgcount[i] ; j++){
                         System.out.print(String.format("ID:%-4d",ID[j]));                     
                         System.out.print(String.format("%-40s",messages[j]));
                          System.out.println("Time: "+time[j]);
             }
}

if(checker==0)
System.out.println("Not found");
}//1
}//d




                                                 //send()
public void send(){ //main

int checker=0;
int choicce;
System.out.print("Enter the number or name from your contacts:");
String receivers=sc.nextLine();
    for(int i=0 ; i<objcount ; i++){  //for
           
            if(m[i].getreceiver().equals(receivers)){    
                checker=1;
                System.out.print("\n\t\tContact found.\n ");
                 mgcount[i]=0;
                 idcount[i]=0;
                do{
                    System.out.print("Enter message : ");
                    String mgContent=sc.nextLine();
                    m[i].setdt(mgcount[i]);
                    m[i].setmgID(idcount[i]++ , mgcount[i]);
                    m[i].setmgContent(mgContent,mgcount[i]++);

                    System.out.print("\nEnter 2 to send message again:");
                    choicce=sc.nextInt();
                    sc.nextLine();
                  
                   }while(choicce==2);
             
             
              
             
            
} //if
} //for


if(checker==0)
System.out.println("\t\tContact not found");
}


 

                                               //deletemessage()
public void deletemessage(){

int checker=0;
int checker2=0;
System.out.print("Enter the number or name from your contacts:");
String receivers=sc.nextLine();
    for(int i=0 ; i<objcount ; i++){                                     //for1
           
            if(m[i].getreceiver().equals(receivers)){                    //if1 
                checker=1;
                System.out.print("Contact found. ");
                System.out.print("Enter message ID: ");
                int id=sc.nextInt();
                int ID[]=m[i].getmgID();
                    for (int j=0 ; j<mgcount[i] ; j++){                      //for2
                        if(ID[j]==id){                                  //if 2 
                              checker2=1;
                              m[i].setmgContent("This message was deleted",j);

}//if2
 if(checker2==0)
      System.out.println("\t\tMessage not found");
}//for2
}//if1
 if(checker==0)
     System.out.println("\t\tContact not found");  
}//for1
}//delete()


                                            //deletecontact()

public void deletecontact(){
int checker=0;
System.out.print("Enter the number or name from your contacts:");
String receivers=sc.nextLine();
    for(int i=0 ; i<objcount ; i++){                                     //for
           
            if(m[i].getreceiver().equals(receivers)){                    //if
                checker=1;
                System.out.print("Contact deleted");
                String delete=m[i].getreceiver();
                String del=" is deleted";
                String d=delete+del;
                m[i].setreceiver(d); 

}//if
}//for
}//deletecontact()
}//methods