class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second){
        if(Valid(hour, minute, second)){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else
        {
            System.out.println("Wrong input format!");
            System.exit(0);
        }
    }

    boolean Valid(int hour, int minute, int second){
        if(hour >=0 && hour < 24 && minute >=0 && minute < 60 && second >=0 && second < 60){
            return true;
        }
        return false;
    }

    public String toStandard()
    {
        String s="";

        if(this.hour>=12 && this.minute>0 && this.hour<=23)
        {

            s+=Integer.toString(this.hour-12)+":";
            if(this.minute<10)
            {
                s+="0"+Integer.toString(this.minute)+":";
            }
            else
            {
                s+=Integer.toString(this.minute)+":";
            }
            if(this.second<10)
            {
                s+="0"+Integer.toString(this.second)+" PM";
            }
            else
            {
                s+=Integer.toString(this.second)+" PM";
            }
        }
        else
        {
            if(this.hour==24)
            {
                s+="00:";
            }
            else
            {
                s+=Integer.toString(this.hour)+":";
            }


            if(this.minute<10)
            {
                s+="0"+Integer.toString(this.minute)+":";
            }
            else
            {
                s+=Integer.toString(this.minute)+":";
            }
            if(this.second<10)
            {
                s+="0"+Integer.toString(this.second)+" AM";
            }
            else
            {
                s+=Integer.toString(this.second)+" AM";
            }

        }
        return s;


    }

    public String toUniversal()
    {
        String s="";
        if(this.hour<10)
        {
            s+="0"+Integer.toString(this.hour)+":";
        }
        else
        {
            s+=Integer.toString(this.hour)+":";
        }
        if(this.minute<10)
        {
            s+="0"+Integer.toString(this.minute)+":";
        }
        else
        {
            s+=Integer.toString(this.minute)+":";
        }
        if(this.second<10)
        {
            s+="0"+Integer.toString(this.second);
        }
        return s;
    }

    public void add(Time x)
    {
        this.hour += x.hour;
        this.minute += x.minute;
        this.second += x.second;

        this.hour %= 24;
        this.minute %= 60;
        this.second %= 60;
    }


}


public class TimeCheck{
    public static void main(String[] args){
        Time t = new Time(10, 5, 0);
        System.out.println(t.toStandard());
        System.out.println(t.toUniversal());
        Time t2 = new Time(20, 5, 4);
        t.add(t2);
        System.out.println(t.toStandard());
        System.out.println(t.toUniversal());
    }
}