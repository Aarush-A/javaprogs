package jan3programmes;
import java.util.Scanner;

public class Jan3Programmes{
    int hr,mm,ss;
    public void settime(int h, int m, int s) {
        this.hr=h;
        this.mm=m;
        this.ss=s;
    }

    public static void addtime(Jan3Programmes a, Jan3Programmes b) {
        int hour=a.hr+b.hr;
        int min=a.mm+b.mm;
        int sec=a.ss+b.ss;
        if (sec>=60) {
            min+=sec/60;
            sec%=60;
        }
        if(min>=60) {
            hour+=min/60;
            min%=60;
        }
        System.out.print(hour + ":" + min + ":" + sec);
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Jan3Programmes t1=new Jan3Programmes();
        Jan3Programmes t2=new Jan3Programmes();
        System.out.print("Enter HR for time 1: ");
        int hr=s.nextInt();
        System.out.print("Enter MM for time 1: ");
        int mm=s.nextInt();
        System.out.print("Enter SS for time 1: ");
        int ss=s.nextInt();
        t1.settime(hr, mm, ss);
        System.out.print("Enter HR for time 2: ");
        int hr2=s.nextInt();
        System.out.print("Enter MM for time 2: ");
        int mm2=s.nextInt();
        System.out.print("Enter SS for time 2: ");
        int ss2=s.nextInt();
        t2.settime(hr2, mm2, ss2);
        addtime(t1, t2);
    }
}
