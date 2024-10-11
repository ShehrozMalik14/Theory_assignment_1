
import java.util.Scanner;
public class Test{
public static void main(String arr[]){

Methods met=new Methods();
int choice=1;
met.sender();
while(choice!=0)
{
System.out.println();
System.out.println("\t\tEnter your choice:\n\n0 to exit program\n1 to add number\n2 to send message\n3 to display messages\n4 to delete messages\n5 to delete contact");
System.out.print("Choice : ");
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();

switch (choice){
case 1:
System.out.println("\n\t\tIn add contacts");
met.addcontact();
break;

case 2:
System.out.println("\n\t\tIn send message");
met.send();
break;

case 3:
System.out.println("\n\t\tIn display messages");
met.display();
break;

case 4:
System.out.println("\n\t\tIn delete message");
met.deletemessage();
break;

case 0:
System.out.println("\n\t\t\t Thank you for using our program\n\n");
choice=0;
break;

case 5:
System.out.println("\n\t\tIn delete contact");
met.deletecontact();
break;
}
}
}
}