class Stude{
String n;
int rollno;
int a;}
class MarkSheet{
int DClD;
int java;
int res;
double per;}
class result
{
Stude s;
MarkShe m;
result(Stude s1,MarkShe m1)
{
s=s1;
m=m1;
}
public void createStudentResult()
{
System.out.println("Name  : " + s.n);
System.out.println("roll no : " +  s.roll);
System.out.println("Age : "  + s.a);
System.out.println("Marks in DCLD = " + m.DCLD);
System.out.println("Marks in Java = " + m.Java);
System.out.println("Total Marks :  "  +(m.DCLD+m.Java);
System.out.println("Percentage : " +(m.DCLD.java)*100.0/200.0);
}
}
class StudMark{
public static void main(String args[]){
Stude s=new Stude();
Markshe m=new Markshe();
s.n="shiza";
s.roll=16;
s.a=18;
m.DCLD=90;
m.Java=80;
result r=new result(s,m);
r.createsStudentResult();
}
}

