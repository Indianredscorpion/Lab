public class Print_armstrongnum{
public static void main (String[] args){
    int length , number,temp, digit,sum=0;
       for(int j=1;j<=1000;j++) {
    	  
    	   temp =j;
    	   number = temp;
    	   length=0;
    	   // length of  the number of digits
    	   while(number!=0) {    		   
    		   number =number/10;
    		   length++;
    	   }
    	// calculate sum of nth power of each digit
    	   while(temp!=0) {
    		  digit = temp % 10;
    		  sum=sum + (int)Math.pow(digit, length);
    		  temp =temp/10;
    	   }
    	// check if the number is Armstrong
    	   if (sum==j) {
    		   System.out.println("This is armstrong number: "+j);
    	   }
    	// reset variables for the next iteration
    	   sum=0;
    	   number=0;
    	   
       }

}



}
