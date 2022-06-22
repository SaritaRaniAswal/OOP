public class OverloadingDemo {
    void show(){
        System.out.println("Within show :: zero args");    }
    void show(int num){
        System.out.println("Within show :: one int arg");    }
    void show(String name){
        System.out.println("Within show :: one string arg");    }
    void show(int num, String name){
        System.out.println("Within show :: 2 args int & string");    }
    void show(String name,int num){
        System.out.println("Within show :: 2 args string & int");    }
    public static void main(String[] args) {
        OverloadingDemo app=new OverloadingDemo();
        /* write code to call different methods
         *see the magic of polymorphism
         */
    }
}

