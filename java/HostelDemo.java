import java.util.Scanner;

class HostelRoom{
 private int roomNo;
 private int noOfCots;
 private int noOfFans;
 private int noOfLights;
 private int alloted;
 public void get() throws AllotmentLimitExceedsException{
	System.out.println("Enter the room number, number of cots, number of fans, number of lights, alloted");
	Scanner s=new Scanner(System.in);
	roomNo=s.nextInt();
	noOfCots=s.nextInt();
	noOfFans=s.nextInt();
	noOfLights=s.nextInt();
	alloted=s.nextInt();
	if(alloted>noOfCots){
	    throw new AllotmentLimitExceedsException();
	}
	}
public void display(){
	System.out.println("Room no\t No of cots\t No of Fans\t No of Lights\t Alloted");
	System.out.println(roomNo+"\t"+noOfCots+"\t"+noOfFans+"\t"+noOfLights+"\t"+alloted);
}
}

class AllotmentLimitExceedsException extends Exception{   
	AllotmentLimitExceedsException(){
       super("Allotment limit is exceeded");
	}
}
public class HostelDemo{
 public static void main(String args[]){
     try{
         HostelRoom h[]=new HostelRoom[2];
         System.out.println("Enter room details: ");
  for(int i=0;i<2;i++){
    h[i]=new HostelRoom();
    h[i].get();
  }
    for(int i=0;i<2;i++){
    h[i].display();
  }
     }catch(AllotmentLimitExceedsException e){
         System.out.println("Exception occurred")
         System.out.println(e);
     }
  }
  
 }
