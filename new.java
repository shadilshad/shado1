class day {
public static void main(String[] args){
String name= "Shadil";
int age=2000;
double accuracy=99.99;
boolean passed=true;
int a=6;
int b=3;
int c=a+b;
int marks=75;
if(marks<=90){
System.out.println("GRADE A");
}else if(marks<=75){
System.out.println("GRADE B");
}else if(marks<=60){
System.out.println("GRADE C");
}else{
System.out.println("FAILED");}
char grade = 'B';
switch(grade) {
    case 'A':
    case 'B':
        System.out.println("Excellent");
        break;
    case 'C':
    case 'D':
        System.out.println("Good");
        break;
    default:
        System.out.println("Needs Improvement");
}
System.out.println(c);
System.out.println("A = 6 & B = 3");
System.out.println("A + B is = " + (a+b));
System.out.println("A - B is = " + (a-b));
System.out.println("A * B is = " + (a*b));
System.out.println("A / B is = " + (a/b));
System.out.println("A % B is = " + (a%b));
System.out.println("A = B = " + (a==b));
System.out.println("A is not equal to B = " + (a!=b));
System.out.println("A > B is = " + (a>b));
System.out.println("A < B is = " + (a<b));
System.out.println("A >= B is = " + (a>=b));
System.out.println("A <= B is = " + (a<=b));
System.out.println("A and B is = " + (a<3 && b<7));
System.out.println("A is not B = " + !(a<7) );
System.out.println("My name is: "+name);
System.out.println("I am " + age + "years old!");
System.out.println("my accuracy level is "+accuracy);
System.out.println("Mission passed: " + passed);
}
}