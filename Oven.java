public class Oven extends Device
{
    public Oven(int mhkos,int upsos,int vathos,int katanalwsh,int timh,String xrwma,String tupos,String onomakataskeuasth,String onomasuskeuhs)
    {
        try
        {
            Setmhkos(mhkos);
            Setupsos(upsos);
            Setvathos(vathos);
            Setkatanalwsh(katanalwsh);
            Settimh(timh);
            Settupos(tupos);
            Setxrwma(xrwma);
            Setonomakataskeuasth(onomakataskeuasth);
            Setonomasuskeuhs(onomasuskeuhs);
        }
        catch (Exception e)
        {
            System.out.println("error");
            return;
        }
        Display();
    }
    public boolean Status(){return status;}
    public void PowerOn(){status = true;}
    public void PowerOff(){status = false;}
    /** me th xrhsh set thetoume tis parapanw times */
    public void Setmhkos(int mhkos){this.mhkos = mhkos;}
    public void Setupsos(int upsos){this.upsos = upsos;}
    public void Setvathos(int vathos){this.vathos = vathos;}
    public void Setonomakataskeuasth(String onomakataskeuasth){this.onomakataskeuasth = onomakataskeuasth;}
    public void Setonomasuskeuhs(String onomasuskeuhs){this.onomasuskeuhs = onomasuskeuhs;}
    public void Settupos(String tupos){this.tupos = tupos;}
    public void Setkatanalwsh(int katanalwsh){this.katanalwsh = katanalwsh;}
    public void Setxrwma(String xrwma){this.xrwma = xrwma;}
    public void Settimh(int timh){this.timh = timh;}
    /** me to get tha epistrefoume autes tis times */
    public int Getmhkos(){return mhkos;}
    public int Getupsos(){return upsos;}
    public int Getvathos(){return vathos;}
    public String Getonomakataskeuasth(){return onomakataskeuasth;}
    public String Getonomasuskeuhs(){return onomasuskeuhs;}
    public String Gettupos(){return tupos;}
    public int Getkatanalwsh(){return katanalwsh;}
    public String Getxrwma(){return xrwma;}
    public int Gettimh(){return timh;}
    public void Display()
    {
        System.out.printf("\nTupos: %s\n",Gettupos());
        System.out.printf("Kataskeuasths: %s\n" , Getonomakataskeuasth());
        System.out.printf("%s - upsos:%dcm, mhkos:%dcm, vathos:%dcm\nKatanalwsh(ethsia): %dkW/h Timh: %d€\n",Getonomasuskeuhs(),Getupsos(),Getmhkos(),Getvathos(),Getkatanalwsh(),Gettimh());
        System.out.printf("Xrwma: %s\n",Getxrwma());
    }
    public int PeriodicMantainance(){return 0;}
}