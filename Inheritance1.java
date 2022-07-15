//A, B and C are classes A is a super class. B is a sub class of A. C is a sub class of B. Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
//Create a class with main method. Create an object for each class A, B and C in main
//method and call every method of each class using its own object/instance.
//Call an overridden method with super class reference to B and C class’s objects
//Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members//

class A {
        int n = 10;
    
        void methodA1() {
            System.out.println("This is Class A Method 1");
        }
    
        void methodA2() {
            System.out.println("This is Class A Method 2");
        }
    
        void method3() {
            System.out.println("This is override method - Class A");
        }
    }
    
    
    class B extends A {
        int n = 20;
    
        void methodB1() {
            System.out.println("This is Class B Method 1");
        }
    
        void methodB2() {
            System.out.println("This is Class B Method 2");
        }
    
       
        void method3() {
            System.out.println("This is override method - Class B");
        }
    }
    

    class C extends B {
        int n = 30;
    
        void methodC1() {
            System.out.println("This is Class C Method 1");
        }
    
        void methodC2() {
            System.out.println("This is Class C Method 2");
        }
    
   
        void method3() {
            System.out.println("This is override method - Class C");
        }
    }
    

public class Inheritance1 
{
        public static void main(String[] args) 
        {
               
                A aa = new A();
                aa.methodA1();
                aa.methodA2();
                aa.method3();
              
                B bb = new B();
                bb.methodB1();
                bb.methodB2();
                bb.method3();
              
                C cc = new C();
                cc.methodC1();
                cc.methodC2();
                cc.method3();
        
               
                A obj;
               
                obj = new B();
                obj.method3();
                
                obj = new C();
                obj.method3();
        
               
                A rtp;
                rtp = new A();
                System.out.println(rtp.n);
                rtp = new B();
                System.out.println(rtp.n);
                rtp = new C();
                System.out.println(rtp.n);
        
                
        }
}
