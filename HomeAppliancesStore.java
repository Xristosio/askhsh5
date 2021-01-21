interface DeviceBasic
{
    void Setmhkos(int mhkos);
    void Setupsos(int upsos);
    void Setvathos(int vathos);
    void Setonomakataskeuasth(String onomakataskeuasth);
    void Setonomasuskeuhs(String onomasuskeuhs);
    void Settupos(String tupos);
    void Setkatanalwsh(int katanalwsh);
    void Setxrwma(String xrwma);
    void Settimh(int timh);
    int Getmhkos();
    int Getupsos();
    int Getvathos();
    String Getonomakataskeuasth();
    String Getonomasuskeuhs();
    String Gettupos();
    int Getkatanalwsh();
    String Getxrwma();
    int Gettimh();
    void Display();
    void PowerOn ();
    void PowerOff ();
    int PeriodicMantainance();
    boolean Status();

}
abstract class Device implements DeviceBasic
{
    public int mhkos;
    public int upsos;
    public int vathos;
    public String onomakataskeuasth;
    public String onomasuskeuhs;
    public String tupos;
    public int katanalwsh;
    public String xrwma;
    public int timh;
    public abstract void Setmhkos(int mhkos);
    public abstract void Setupsos(int upsos);
    public abstract void Setvathos(int vathos);
    public abstract void Setonomakataskeuasth(String onomakataskeuasth);
    public abstract void Setonomasuskeuhs(String onomasuskeuhs);
    public abstract void Settupos(String tupos);
    public abstract void Setkatanalwsh(int katanalwsh);
    public abstract void Setxrwma(String xrwma);
    public abstract void Settimh(int timh);
    public abstract int Getmhkos();
    public abstract int Getupsos();
    public abstract int Getvathos();
    public abstract String Getonomakataskeuasth();
    public abstract String Getonomasuskeuhs();
    public abstract String Gettupos();
    public abstract int Getkatanalwsh();
    public abstract String Getxrwma();
    public abstract int Gettimh();
    public static boolean status;
    public abstract void Display();
}
class HomeAppliancesStore
{
    public static void main(String[] args){DeviceStatus();}
    public static void DeviceStatus()
    {
        Device device = new Oven(59, 84, 60,200, 539, "Space Grey", "Oven","AEG","CCB6442ABM");
        if (device instanceof Oven)
        {
            Oven oven = (Oven) device;
            System.out.printf("Device Status: ");
            if (oven.Status() == true)
                System.out.printf("On\n");
            else
                System.out.printf("Off\n");
        }
    }
}
