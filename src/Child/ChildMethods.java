package Child;

import  java.util.Random;
import  java.util.Scanner;

public class ChildMethods
{
    Random  rand=new  Random();
    String  name;
    int  y,m,d;    //year,month,day
    public  ChildMethods()
    {
        System.out.print("\nConstructor");
        this.name=null;
        this.y=0;
        this.m=0;
        this.d=0;
    }
    void  setName(String  nme)
    {
        name=nme;
    }
    void  setdate(int  yr,int  mt,int  dy)
    {
        y=yr;
        m=mt;
        d=dy;
    }
    public  String  myname()
    {
        return  "My  name  is  "+name;
    }
    /*public  int  age()
    {
            return  y;
    }*/
    public  void  age()
    {
        if(m<=4)
        {
            if(d<=4)
                System.out.print("\nI  am  "+(2020-y)+"  years  "+(4-m)+"  months  and  "+(4-d)+"  days  old  ");
            else
                System.out.print("\nI  am  "+(2020-y)+"  years  "+(4-m)+"  months  and  "+(30-d)+"  days  old  ");  //assume  that  30  a  month  has  in  general  30  days
        }
        else
        {
            if(d<=4)
                System.out.print("\nI  am  "+(2021-y)+"  years  "+(12-m)+"  months  and  "+(4-d)+"  days  old  ");
            else
                System.out.print("\nI  am  "+(2021-y)+"  years  "+(12-m)+"  months  and  "+(30-d)+"  days  old  ");
        }

    }
    public  void  quickmath()
    {
        System.out.print("\nI  can  add  two  numbers  smaller  than  10,  for  example:  ");
        int  x=rand.nextInt(10),y=rand.nextInt(10);    //randomly  generated  2  numbers
        System.out.print(x+"+"+y+"="+(x+y));
    }
    public  void  chess()
    {
        //int  tab[][]=new  int[8][8];
        System.out.print("\nI  can  color  a  chess  table,look!:  \n");
        for(int  i=0;i<8;i++)
        {
            for(int  j=0;j<8;j++)    //the  chess  table  has  8  rows  and  columns
            {
                if(i%2==0)
                {
                    if(j%2==0)
                        System.out.print("  Black  ");
                    else
                        System.out.print("  White  ");
                }
                else
                if(j%2==0)
                    System.out.print("  White  ");
                else
                    System.out.print("  Black  ");

            }
            System.out.print("\n");
        }
    }
    public  void  X0()
    {
        System.out.print("\nI  can  play  X-0,  look!:  \n");
        Scanner  scan=new  Scanner(System.in);
        Random  rand=new  Random();
        int[][]a=new  int[3][3];
        int  r,c,rr=0,rc=0,nr=0,nrx=0;
        for(int  i=0;i<3;i++)
            for(int  j=0;j<3;j++)
                a[i][j]=0;  //firstly,  the  array  is  full  of  '*'-s
        for(int  i=0;i<3;i++)
        {
            for(int  j=0;j<3;j++)
            {
                if(a[i][j]==0)
                    System.out.print("*  ");
            }
            System.out.print("\n");
        }
        for(int  p=0;p<3;p++)
        {

            System.out.print("\nEnter  the  position  of  X(row  and  column):  \n");
            r=scan.nextInt();
            c=scan.nextInt();
            if(r<0  ||  r>2  ||  c<0  ||  c>2)
            {
                System.out.print("\nInvalid  value(s)");
                p--;
            }
            else
            {
                for(int  i=0;i<3;i++)
                {
                    for(int  j=0;j<3;j++)
                    {
                        if(i==r  &&  j==c)
                            a[i][j]=1;
                        while(rr!=r  &&  rc!=c  &&  a[rr][rc]!=1)  //pe  pozitia  lui  X  nu  poate  fi  0  sau  invers
                        {
                            rr=rand.nextInt(2);
                            rc=rand.nextInt(2);
                        }
                        a[rr][rc]=2;
                    }
                }
                for(int  i=0;i<3;i++)
                {
                    for(int  j=0;j<3;j++)
                    {
                        if(a[i][j]==0)
                            System.out.print("*  ");
                        else
                        if(a[i][j]==1)
                            System.out.print("X  ");
                        else
                            System.out.print("0  ");
                    }
                    System.out.print("\n");
                }
                if(p==2)
                    System.out.print("\nGame  over!");
            }
        }
    }
}
