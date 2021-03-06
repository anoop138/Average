import java.util.Scanner;

class Average {
    // we will not create Scanner class object in class
    int a, b, c;
    Average() {
        // delcare locally here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        this.a = sc.nextInt();
        System.out.println("Enter the number 2: ");
        this.b = sc.nextInt();
        System.out.println("Enter the number 3: ");
        this.c = sc.nextInt();
    }

    public void average_method() {
        int result = (a + b + c) / 3;
        System.out.println("The average of three number is: " + result);
    }
}

class  MyException extends Exception {
    MyException(String s)
    {
        super(s);
    }
//  public String getMessage() {
//    return "Invalid Input-Please enter the integer only";
//  }
}

class method{
    public static void main(String[] args) {
        try {

            Average obj = new Average();
            obj.average_method();
            // Exception Raised
            throw new MyException("this is my custom exception ");
        }
        // Exception handled
        catch(MyException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("end of the program");
    }
}
