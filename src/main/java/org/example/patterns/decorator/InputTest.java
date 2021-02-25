package org.example.patterns.decorator;

import com.sun.tools.javac.util.ArrayUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class InputTest {

    public static void main(String[] args) {
        int c;
        List<Byte> byteList = new ArrayList<>();
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/Users/stas/Documents/file1.txt")));
            while((c = in.read()) >= 0) {
                byteList.add((byte) c);
            }
            Byte[] bytesObj = Arrays.copyOf(byteList.toArray(), byteList.size(), Byte[].class);
            byte[] bytes = new byte[bytesObj.length];
            int i = 0;
            for(Byte b : bytesObj) {
                bytes[i++] = b;
            }
            String s = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(s);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY;
        public static int count;
    }
}
