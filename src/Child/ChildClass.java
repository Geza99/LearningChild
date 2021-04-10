package Child;
/*  An  application  which  defines  a  class  named  Child.  Define  the  methods  and  member  variables  for  this  class
which  enble  a  Child  object  to  store/do  the  following:
-  the  name  of  the  child
-  the  child's  birthday
-  the  child  can  introduce  him/herself  by  ?saying":  Hello  my  name  is  ...
-  the  child  can  tell  his/her  age
-  the  child  can  add  two  numbers  smaller  than  10  and  return  the  result  like  so:  The  sum  of  X  and  Y  is  equal  to  Z
-  the  child  knows  how  to  say  Goodbye!
-  the  child  can  speak  the  alphabet  both  in  direct  and  inverse  order
-  the  child  can  color  a  chess  board  given  its  dimensions  by  using  alternative  colors  (for  the  colors  use  the
symbols  1  and  0)
-  the  child  can  play  dots  and  crosses  (X-0)  by  him/herself  ??  (use  the  application  developed  in  the  previous
homework)
Remarks:  the  child's  name  and  birthday  cannot  be  accessed  from  outside  the  class.
All  the  information  about  a  Child  will  be  filled-in  using  a  Child  object  and  its  associated  methods  and  variables.
The  interaction  with  teh  child  will  be  done  through  an  object  which  is  instantiated  in  the  main  method.
*/

import  java.util.Scanner;

public class ChildClass
{
    static  Scanner  scan=new  Scanner(System.in);
    static int  year,month,day;
    public  static  void  main(String[]  args)
    {
        String  nam;
        System.out.print("\nName  of  the  child:  ");
        nam=scan.nextLine();
        boolean  b=false;
        while(!b)
        {
            System.out.print("\nDate  of  birth  of  the  child(Year,month,day):  ");
            year=scan.nextInt();
            month=scan.nextInt();
            day=scan.nextInt();
            if(year<0  ||year>2020)
                System.out.print("\nInvalid  year!");
            else
            if(month<0  ||  month>12)
                System.out.print("\nInvalid  month!");
            else
            if(day<0  ||  day>12)
                System.out.print("\nInvalid  day!");
            else
                b=true;
        }
        ChildMethods  kid=new  ChildMethods();
        kid.setName(nam);
        kid.setdate(year,  month,  day);
        System.out.print("\n"+kid.myname());
        kid.age();
        kid.quickmath();
        kid.chess();
        kid.X0();
    }

}
