package randomTests;


import jdk.nashorn.tools.Shell;
import org.apache.commons.exec.CommandLine;

import java.io.*;

public class testClasss {

    public static void main(String[] args) throws IOException, InterruptedException {
//
//		public String RandomYear(int randomNum1) {
//
//		int randomNum1 = ThreadLocalRandom.current().nextInt(1950, 2021);
//
//		String randomNum2 = Integer.toString(randomNum1);
//
//		System.out.println(randomNum2);
//
//			return randomNum2;

//		Process process = Runtime.getRuntime().exec("cd /Users/imranmoqbel/Documents/WaseetAndroidAutomation/src");
//
        Process macEmulator = new ProcessBuilder("emulator", "-avd", "PixelXL").start();
//        Process pcEmulator = pbEmulator.start();
//        pcEmulator.waitFor();
//
//        ProcessBuilder pbADB = new ProcessBuilder("adb", "devices");
//        Process pcADB = pbADB.start();
//        pcADB.waitFor();
//
//        InputStream is = pcADB.getInputStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
//        String line;
//        String adb = new String();
//
//        while ((line = br.readLine()) != null) {
//            if (line.length() > 0)
//                line += br.readLine();
//            System.out.println(line);
//        }
//
//        if (adb.contains("emulator-5556") && (!adb.contains("offline"))) {
//            System.out.println("Device is connected");
//        }
    }
}