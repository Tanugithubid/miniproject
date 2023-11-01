
import java.util.Scanner;

//gcd function is defined to find gcd of two numbers

class gcd
{
   
    int divisor(int first , int second)
 {
       int gcd_result=1;
       for(int i=1;i<=first && i<=second;i++)
      {
        if(first%i==0 && second%i==0)
        gcd_result=i;
      } 
         return gcd_result;
 }
}

//first function binary is defined to convert gcd of respective teams to binary

 class binary
 {
    int rem2;
    int i=1;
   int binary_result=0;
  int convertToBinary(int n)
  {
    
    while( n!=0)
    {
      rem2=n%2;
      n=n/2;
      binary_result+=rem2*i;
      i=i*10;
    }
    
    return binary_result;
  }
}



//a function is defined to find no of ones in respective binary of team1 and team2

class countNumberOfOnes
{
  int rem1;
  int sumones=0;
  int count(int n)
  {
    while(n!=0){
      rem1=n%10;
      if(rem1==1)
      {
        sumones+=1;
      }
      
      
      n=n/10;
    }
    return sumones;
    
  }
}

//a function is defined to find no of zeroes in respective gcds of team1 and team2

class countNumberOfZeroes
{
  int rem3;
  int sumZeroes=0;
  int count1(int n)
  {
    while(n!=0){
      rem3=n%10;
      if(rem3!=1)
      {
        sumZeroes+=1;
      }
      
      n=n/10;
    }
    return sumZeroes;
  }
  }


//a function is defined to make imaginary matrix of order num1 and num2 

class matrix
{
  int attempt=0;
 
  int reach(int rows,int columns,int horiz, int vert)
  {

    for(int i=0;i<rows;i=i+horiz)
    {
      for(int j=0;j<columns;j=j+vert)
      {
       attempt+=1;
      }

    }
    return attempt;
  }
}


  //main function

class main{
    public static void main(String args[])
  {
        Scanner sc=new Scanner(System.in);

        //two numbers of first team

        System.out.println("first team:");
        System.out.println("enter first number");
        int num1=sc.nextInt();
        System.out.println("enter second number");
        int num2=sc.nextInt();

        //two numbers of second team
        System.out.println("second team:");
        System.out.println("enter first number");
        int num3=sc.nextInt();
        System.out.println("enter second number");
        int num4=sc.nextInt();

        //object of gcd class to find gcd of first team numbers
        gcd obj1=new gcd();

        //object of gcd class to find gcd of second team numbers
        gcd obj2=new gcd();
       
        //storing values from divisor method to gcd_result1
        int gcd_result1=obj1.divisor(num1,num2);
        //storing values from divisor method to gcd_result2
        int gcd_result2=obj2.divisor(num3,num4);

        System.out.print("The gcd of num1 and num2 for first team is :");
        System.out.println(gcd_result1);
        System.out.print("The gcd of num1 and num2 for second team is :");
        System.out.println(gcd_result2);

        //creating object of binary class
        binary obj3=new binary();
        //obj3.convertToBinary(result1);
        binary obj4=new binary();
       // obj4.convertToBinary(result2);

       //Storing values int
        int binaryresult1=obj3.convertToBinary(gcd_result1);
        int binaryresult2=obj4.convertToBinary(gcd_result2);

        System.out.println("binary of result1/first team is :");
        System.out.println(binaryresult1);

        System.out.println("binary of result2/second team is :");
        System.out.println(binaryresult2);

        //making object of countNumberOfOnes class to count no of ones

        countNumberOfOnes obj5=new countNumberOfOnes();
         int ones1=obj5.count(binaryresult1);

         countNumberOfOnes obj6=new countNumberOfOnes();
         int ones2=obj6.count(binaryresult2);

         //making object of countNumberOfZeroes class to count no of zeroes

         countNumberOfZeroes obj7=new countNumberOfZeroes();
         int Zeroes1=obj7.count1(binaryresult1);

         countNumberOfZeroes obj8=new countNumberOfZeroes();
         int Zeroes2=obj8.count1(binaryresult2);


          System.out.println("ones of result1/first team is :");
        System.out.println(ones1);
        System.out.println("zeroes of result1/first team is :");
        System.out.println(Zeroes1);


//System.out.println("tannu");

        System.out.println("ones of result2/second team is :");
        System.out.println(ones2);
        System.out.println("zeroes of result2/second team is :");
        System.out.println(Zeroes2);
        
        System.out.println("are you ready to see the results?");
        String ready=sc.next();

// making object of matrix class 

        matrix obj9=new matrix();
          int attempt1=obj9.reach(num1,num3,ones1,Zeroes1);

           matrix obj10=new matrix();
          int attempt2=obj10.reach(num1,num3,ones2,Zeroes2);
      
          System.out.println("attempts of result1/first team is :");
        System.out.println(attempt1);
        System.out.println("attempts of result2/second team is :");
        System.out.println(attempt2);

        if(attempt1>attempt2)
        {
          System.out.println("winner is second team");
        }
        else if (attempt1<attempt2)
        {
            System.out.println("winner is first team");
        }
        else{
          System.out.println("both are winners");
        }



  }
}