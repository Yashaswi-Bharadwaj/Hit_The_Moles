/* This code is built by "Yashaswi.P.Bharadwaj" for implementing the Hit the moles game in the java code */


import java.util.*;


class hitmoles
{
 public static void main(String v[])throws InterruptedException
 {
        final long inival=System.currentTimeMillis();   //fetching the time at the begining of execution of program

        Scanner k=new Scanner(System.in);
        int expectval,unexpectval=9;                    //expectval and unexpectval are used to locate the positions
        int score=0;
        int a[][]=new int[3][3];

        Random r=new Random();
        int r1,c1,r2=4,c2=4,key=1;                      //r1,r2,c1,c2 are the variables used as indices
        for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                        a[i][j]=0;
        for(int p=3;p>0;p--)
        {
                System.out.println(" The Game begins in : "+p);
                Thread.sleep(1000);
        }


        while(key!=unexpectval)
        {

                System.out.print("\033[2J");            // These 2 lines of code are used for clearing the screen
                System.out.println("\033[0;0f");

                final long finval=System.currentTimeMillis();

                if(((finval-inival)/1000)>=60)          //Condition to check the time has been elapsed or not
                {
                        System.out.println(" TIME OVER....\n Your SCORE is :"+score);
                        System.exit(0);
                }
                System.out.println("============================================================================= ");
                System.out.println("\t\t\t HIT THE MOLES");
                System.out.println("============================================================================= ");

                System.out.println("SCORE : "+score+"\t\t\t\tTIME : "+((finval-inival)/1000)+"secs");

                r1=r.nextInt(3);
                c1=r.nextInt(3);
                a[r1][c1]=1;

                r2=r.nextInt(3);
                c2=r.nextInt(3);
                a[r2][c2]=2;

                if(r1==r2 && c1==c2)
                        continue;

                if(r1==0)               else if(r1==1)
                        expectval=c1+4;
                else
                        expectval=c1+7;

                if(r2==0)
                        unexpectval=c2+1;
                else if(r2==1)
                        unexpectval=c2+4;
                else
                        unexpectval=c2+7;

                for(int i=0;i<3;i++)
                {
                 System.out.print("\t\t\t");
                 for(int j=0;j<3;j++)
                        if(a[i][j]==0)
                                System.out.print("_ \t");
                        else if(a[i][j]==1)
                                System.out.print("0 \t");
                        else
                                System.out.print("o \t");
                        System.out.println();
                }

                System.out.println("============================================================================= ");

                key=Integer.parseInt(k.nextLine());
                if(key==expectval)
                {
                        for(int i=0;i<3;i++)
                                for(int j=0;j<3;j++)
                                        a[i][j]=0;
                        score++;
                }
                else if(key!=unexpectval)
                {
                        System.out.println(" WRONG KEY. Press the Correct one");
                        Thread.sleep(3000);
                        a[r1][c1]=0;
                        continue;
                }
                System.out.println("============================================================================= ");

        }
                if(key==unexpectval)
                        System.out.println("\t OOPS!!!!! You clicked BOMB.... Sorry, Game over\n \t Your SCORE is "+score);
 }
}

                        expectval=c1+1;
               else if(r1==1)
                        expectval=c1+4;
                else
                        expectval=c1+7;

                if(r2==0)
                        unexpectval=c2+1;
                else if(r2==1)
                        unexpectval=c2+4;
                else
                        unexpectval=c2+7;

                for(int i=0;i<3;i++)
                {
                 System.out.print("\t\t\t");
                 for(int j=0;j<3;j++)
                        if(a[i][j]==0)
                                System.out.print("_ \t");
                        else if(a[i][j]==1)
                                System.out.print("0 \t");
                        else
                                System.out.print("o \t");
                        System.out.println();
                }

                System.out.println("============================================================================= ");

                key=Integer.parseInt(k.nextLine());
                if(key==expectval)
                {
                        for(int i=0;i<3;i++)
                                for(int j=0;j<3;j++)
                                        a[i][j]=0;
                        score++;
                }
                else if(key!=unexpectval)
                {
                        System.out.println(" WRONG KEY. Press the Correct one");
                        Thread.sleep(3000);
                        a[r1][c1]=0;
                        continue;
                }
                System.out.println("============================================================================= ");

        }
                if(key==unexpectval)
                        System.out.println("\t OOPS!!!!! You clicked BOMB.... Sorry, Game over\n \t Your SCORE is "+score);
 }
}
