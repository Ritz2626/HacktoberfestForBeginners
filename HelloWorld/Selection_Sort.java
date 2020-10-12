/*Sorting Done by Selection Sorting technique*/
import java.io.*;
class Selection_Sort
{
    public static void main(String[]args)throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Input a word having not less than three characters");
        String word=br.readLine().toUpperCase();
        int len=word.length();
        if(len<3)
            System.out.println("Invalid Input");
        else
        {
            char a[]=new char[len];
            
            for(int x=0;x<len;x++)
            {
                a[x]=word.charAt(x);
            }
            for(int y=0;y<len-1;y++)
            {
                char ch=a[y];int pos=y;
                for(int z=y+1;z<len;z++)
                {
                    if((int)a[y]-(int)a[z]>0)
                    {
                        ch=a[z];
                        pos=z;
                    }
                }
                a[pos]=a[y];
                a[y]=ch;

            }
            for(int i=0;i<len;i++)
            {
                System.out.print(a[i]);
            }
        }
    }
}
