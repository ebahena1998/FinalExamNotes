package ObjectSerialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectSerializationCustomDemo {

    public static void main(String[] args) throws IOException{

        ArrayList<Customer> myQueue = new ArrayList<Customer>();

        myQueue.add(new Customer("Henry","LName1","SSN1"));
        myQueue.add(new Customer("Ford","LName2","SSN2"));
        myQueue.add(new Customer("Ben","LName3","SSN3"));
        myQueue.add(new Customer("John","LName4","SSN4"));


        File outFile=new File("/DEMOS/object_store2.dat");

        if(outFile.exists()) {
            System.out.println("File already exists!");
            System.exit(0);
        }

        outFile.createNewFile();

        FileOutputStream fout=new FileOutputStream(outFile);
        ObjectOutputStream oout=new ObjectOutputStream(fout);

        oout.writeObject(myQueue);

        oout.flush();
        oout.close();

        while(!myQueue.isEmpty()) {
            System.out.println(myQueue.remove(0));
        }



    }
}