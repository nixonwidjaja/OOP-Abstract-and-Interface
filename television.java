import java.util.*;
public class television 
{
    public static void main(String args[])
    {
        int x = 0;
        Scanner s = new Scanner(System.in);
        TVApple apple = null;
        TVLG lg = null;
        TVSamsung samsung = null;
        Channel channel1 = null;
        Remote remote1 = null;
        while (x!=8)
        {
            System.out.println("Menu Television");
            System.out.println("1. Create TV");
            System.out.println("2. Add channel");
            System.out.println("3. Add universal remote");
            System.out.println("4. View TV");
            System.out.println("5. Switch Channel");
            System.out.println("6. Set Volume Up");
            System.out.println("7. Set Volume Down");
            System.out.println("8. Exit");
            System.out.print("Choose : ");
            x = s.nextInt();
            if (x==1)
            {
                System.out.println("1. LG");
                System.out.println("2. Samsung");
                System.out.println("3. Apple");
                System.out.print("Masukkan TV yang akan dicreate = ");
                int pilih = s.nextInt();
                if (pilih==1)
                lg = new TVLG();
                else if (pilih==2)
                samsung = new TVSamsung();
                else
                apple = new TVApple();
            }
            else if (x==2)
            {
                System.out.print("Name = ");
                String temp = s.nextLine();
                String name = s.nextLine();
                System.out.print("Freq = ");
                int freq = s.nextInt();
                System.out.print("Volume = ");
                int volume = s.nextInt();
                channel1 = new Channel(name, freq, volume);
                System.out.println("1. LG");
                System.out.println("2. Samsung");
                System.out.println("3. Apple");
                System.out.print("Channel diregister ke TV = ");
                int pilih = s.nextInt();
                if (pilih==1)
                {
                    if (lg == null)
                    System.out.println("TV LG does not exist");
                    else
                    {
                        lg.addChannel(channel1);
                    }
                }
                else if (pilih==2)
                {
                    if (samsung == null)
                    System.out.println("TV Samsung does not exist");
                    else
                    {
                        samsung.addChannel(channel1);
                    }
                }
                else
                {
                    if (apple == null)
                    System.out.println("TV Apple does not exist");
                    else
                    {
                        apple.addChannel(channel1);
                    }
                }
            }
            else if (x==3)
            {
                if (remote1==null)
                {
                    remote1 = new Remote();
                    System.out.println("Remote added");
                }
                else
                System.out.println("Remote already exists");
            }
            else if (x==4)
            {
                System.out.println("1. LG");
                System.out.println("2. Samsung");
                System.out.println("3. Apple");
                System.out.print("Masukkan TV yang akan diview = ");
                int pilih = s.nextInt();
                if (pilih==1)
                lg.viewtv();
                else if (pilih==2)
                samsung.viewtv();
                else
                apple.viewtv();
            }
            else if (x==5)
            {
                if (remote1==null)
                {
                    System.out.println("Remote does not exist");
                    continue;
                }
                System.out.println("1. LG");
                System.out.println("2. Samsung");
                System.out.println("3. Apple");
                System.out.print("Masukkan TV yang diinginkan = ");
                int pilih = s.nextInt();
                System.out.print("Ganti ke channel = ");
                int tujuan = s.nextInt();
                if (pilih==1)
                {
                    remote1.Action(1, lg, tujuan);
                    lg.viewtv();
                }
                else if (pilih==2)
                {
                    remote1.Action(1, samsung, tujuan);
                    samsung.viewtv();
                }
                else
                {
                    remote1.Action(1, apple, tujuan);
                    apple.viewtv();
                }
            }
            else if (x==6)
            {
                if (remote1==null)
                {
                    System.out.println("Remote does not exist");
                    continue;
                }
                System.out.println("1. LG");
                System.out.println("2. Samsung");
                System.out.println("3. Apple");
                System.out.print("Masukkan TV yang diinginkan = ");
                int pilih = s.nextInt();
                System.out.print("Perbesar volume sebanyak = ");
                int tujuan = s.nextInt();
                if (pilih==1)
                {
                    remote1.Action(2, lg, tujuan);
                    lg.viewtv();
                }
                else if (pilih==2)
                {
                    remote1.Action(2, samsung, tujuan);
                    samsung.viewtv();
                }
                else
                {
                    remote1.Action(2, apple, tujuan);
                    apple.viewtv();
                }
            }
            else if (x==7)
            {
                if (remote1==null)
                {
                    System.out.println("Remote does not exist");
                    continue;
                }
                System.out.println("1. LG");
                System.out.println("2. Samsung");
                System.out.println("3. Apple");
                System.out.print("Masukkan TV yang diinginkan = ");
                int pilih = s.nextInt();
                System.out.print("Perkecil volume sebanyak = ");
                int tujuan = s.nextInt();
                if (pilih==1)
                {
                    remote1.Action(3, lg, tujuan);
                    lg.viewtv();
                }
                else if (pilih==2)
                {
                    remote1.Action(3, samsung, tujuan);
                    samsung.viewtv();
                }
                else
                {
                    remote1.Action(3, apple, tujuan);
                    apple.viewtv();
                }
            }
            else
            break;
        }
        s.close();
    }
}
