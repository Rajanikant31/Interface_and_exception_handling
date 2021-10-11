package com.company;
interface A{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
    public void c()
    {
        //System.out.println("I am C");
    }
}
class M extends B{
    public void a(){System.out.println("I am a");}
public void b(){System.out.println("I am b");}
public void d(){System.out.println("I am d");}

        }
        public class Main {

            public static void main(String[] args) {
                System.out.println("I am C");
               A obj=new M();
                obj.a();
                obj.b();
                obj.c();
                obj.d();
String str="null";
System.out.println(str.length());
;
            }
        }
