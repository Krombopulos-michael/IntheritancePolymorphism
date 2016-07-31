/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepolymorphism;


import java.util.Scanner;


public class InheritancePolymorphism {

    static double x;
    static double y;
  public static String n;
    
    public static void main(String[] args) {
  
        
       
   Scanner name = new Scanner(System.in);
        n = name.nextLine();
        
        Addition a = new Addition();
       Subtraction s = new Subtraction();
       Multiplication m = new Multiplication();
       Division d = new Division();
       
       System.out.print("ВВедите значение переменной x"+" ");
         x = new Scanner(System.in).nextInt();
       System.out.print("Введите значение переменной у"+" ");
              y = new Scanner(System.in).nextInt();
               
           if ("Summ".equals(n)){
            a.calc(x,y);
            System.out.println("x+y="+a.calc(x,y));
               
           }
           else if("Minus".equals(n)){
               s.calc(x,y);
               System.out.println("x-y="+s.calc(x,y));
           }
           else if ("Multiplication".equals(n)){
               m.calc(x,y);
               System.out.println("x*y="+m.calc(x, y));
           }
           else if ("Division".equals(n)){
               d.calc(x,y);
               System.out.println("x/y="+d.calc(x,y));
           }
        
    }
    //Главный абстрактный класс 
    abstract class Arithmetic {

       double x;
       double y;
       abstract double calc();//Абстрактный метод
    }
    /*Класс потомок с реализацией абстрактного метода calc, 
    выполняет сложение переменных x and y. То же самое выполняют последующие 
    дочерние классы Substraction, Multiplication, Division 
    класса Arithmetic.*/
 public static  class Addition extends Arithmetic{

    
        
    

        private Addition() {
            super.x = x;
            super.y = y;
        }

        

        

    @Override
    public String toString() {return "сложение";}
    
    
    double calc(double x, double y){
        return (x+y);
    }      

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        
    }
     
    public static class Subtraction extends Arithmetic {
       
        
        

        private  Subtraction() {
         super.x = x;
         super.y = y;
        }
        @Override
        public String toString(){return "вычитание";}
        
       
        double calc(double x , double y){
            return (x-y);
        }

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
  public static class Multiplication extends Arithmetic {
        
        
         

        private Multiplication() {
            super.x = x;
            super.y = y;
        }
         @Override
         public String toString(){return "Умножение";}
         
         
         double calc(double x , double y){
             return(x*y);
         }

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
   public static class Division extends Arithmetic{
    
        
       

        private Division() {
           super.y = y;
           super.x = x;
        }

        
        @Override
        public String toString(){return "Деление";}
        
       
        double calc(double y , double x){
            return (x/y);
        }

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
}
