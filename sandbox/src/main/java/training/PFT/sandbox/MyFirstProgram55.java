package training.PFT.sandbox;public class MyFirstProgram55 {  public static void main(String[] args) {    hello("world");    hello("Sveta");    hello("Ula");    hello("Slava");    double l = 5;    System.out.println("Площадь квадрата со стороной " + l + " равна " + area(l) );    double a = 7;    double b = 9;    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area(a,b) );  }  public static void hello(String somebody) {        System.out.println("Hello, " + somebody + "!");  }  public static double area (double len){    return len * len;  }public static double area (double a, double b) {  return a*b;}}