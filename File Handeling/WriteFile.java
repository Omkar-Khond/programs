import java.io.*;

class WriteFile
{
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fobj = new FileOutputStream("Marvellous.txt");

        String Data = "Marvellous Infosystems  Pune";

        byte bdata[] = Data.getBytes();

        fobj.write(bdata);
        fobj.close();
    }
}