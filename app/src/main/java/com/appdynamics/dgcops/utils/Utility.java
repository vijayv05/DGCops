package com.appdynamics.dgcops.utils;

import com.appdynamics.dgcops.ECDetails;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Utility {

    public static void writeObj (String fileName, ECDetails ec) throws IOException {
        FileOutputStream fileOut =
                new FileOutputStream(fileName);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(ec);
        out.close();
        fileOut.close();
    }

    public static ECDetails readObject(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream(fileName);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        ECDetails e = (ECDetails) in.readObject();
        in.close();
        fileIn.close();

        return e;

    }
}
