import java.time.LocalDateTime;

public class Message{

private static String sender;
private int mgID[]=new int[200];
private String mgContent[]=new String[200];
private boolean status;
private LocalDateTime dt[]=new LocalDateTime[200];  
private String receiver;


                                       //contructor

public Message(){
}
public Message(String sender , String receiver , boolean status){
this.sender=sender;
this.receiver=receiver;
this.status=status;
}

                                          //setter methods()

public void setsender(String sender){
this.sender=sender;
}
public void setmgContent(String mgContent , int count){
this.mgContent[count]=mgContent;
}
public void setdt(int count){
this.dt[count]=LocalDateTime.now();
}
public void setmgID(int mgID , int count){
this.mgID[count]=mgID;
}
public void setreceiver(String receiver ){
this.receiver=receiver;
}
public void setstatus(boolean status){
this.status=status;
}


                                        //getter methods()

public String getsender(){
return sender ;
}
public int[] getmgID(){
return mgID ;
}
 public String[] getmgContent() {
        
return mgContent;
    
}
public boolean getstatus(){
return status;
}
public LocalDateTime[] getdt(){
return dt;
}
public String getreceiver(){
return receiver;
}
}