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
    static double p;
    static double l;
  public static String n;
  
    public static void main(String[] args) {
        
  
       Addition a = new Addition();
       Subtraction s = new Subtraction();
       Multiplication m = new Multiplication();
       Division d = new Division();
       Quadra q = new Quadra();
       
       System.out.println("Выберите кол-во переменных от 2 до 4");
        int number = new Scanner(System.in).nextInt();
        
       System.out.println("Выберите тип операции +-*/");
       
   Scanner name = new Scanner(System.in);
        n = name.nextLine();
        
   
        switch (number) {
            case 2:
                System.out.println("ВВедите значение переменной x"+" ");
                x = new Scanner(System.in).nextInt();
                System.out.print("Введите значение переменной у"+" ");
                y = new Scanner(System.in).nextInt();
                switch (n) {
                    case "Quadra":
                        q.calc(x);
                        System.out.println("x*x="+q.calc(x));
                        break;
                    case "Summ":
                        a.calc(x,y);
                        System.out.println("x+y="+a.calc(x,y));
                        break;
                    case "Minus":
                        s.calc(x,y);
                        System.out.println("x-y="+s.calc(x,y));
                        break;
                    case "Multiplication":
                        m.calc(x,y);
                        System.out.println("x*y="+m.calc(x, y));
                        break;
                    case "Division":
                        d.calc(x,y);
                        System.out.println("x/y="+d.calc(x,y));
                        break;
                    default:
                        break;
                }       break;
            case 3:
                System.out.print("Введите значение переменной x");
                x = new Scanner(System.in).nextInt();
                System.out.print("Введите значение переменной y");
                y = new Scanner(System.in).nextInt();
                System.out.print("Введите значение переменной a");
                p = new Scanner(System.in).nextInt();
                switch (n) {
                    case "Summ":
                        a.calc(x,y,p);
                        System.out.print("x+y+p=" + a.calc(x,y,p));
                        break;
                }       break;
            case 4:
                System.out.print("Введите значение переменной x");
                x = new Scanner(System.in).nextInt();
                System.out.print("Введите значение переменной y");
                y = new Scanner(System.in).nextInt();
                System.out.print("Введите значение переменной a");
                p = new Scanner(System.in).nextInt();
                System.out.println("Введите значение переменной l");
                l = new Scanner(System.in).nextInt();
                switch (n){
                    case "Summ":
                        a.calc(x,y,p,l);
                        System.out.println("x+y+p+l="+a.calc(x, y, p, l));
                        break;
                }         break;
            default:
                break;
        }
    }
    //Главный абстрактный класс 
    abstract class Arithmetic {

       double x;
       double y;
       double p;
       double l;
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
            super.p = p;
            super.l = l;
        }

        

        

    @Override
    public String toString() {return "сложение";}
    
    double calc(double x, double y){
        return (x+y);
    }
    double calc(double x, double y, double p){
        return (x+y+p);
    }
    double calc(double x, double y, double p, double l){
        return (x+y+p+l);
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
    public static class Quadra extends Arithmetic {
        
      private  Quadra() {
            super.x = x;
            
        }
      @Override
      public String toString(){return "Возведение в степень";}
      
      double calc(double x) {
          return (x*x);
      }

        @Override
        double calc() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    }
    
   
   
    
   
}
