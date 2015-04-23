package com.sun.util;

/**
 * Created by SDL on 2015/4/17.
 *
 * 线程调度
 */
public class BuildDataOneThread extends GetTime{

    @Override
    public void runcode() {
        File file = new File("F:\\ideaTestspace\\UDPClientSim\\src\\main\\resources\\shipInfo.txt");
        FileInputStream fis = null;
        try {
            ReadFile readFile = new ReadFile();
            fis = new FileInputStream(file);
            int available = fis.available();
            System.out.println("文件大小："+available);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            OneThreadReadFile thread = new OneThreadReadFile(br);
            thread.start();
            thread.join();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new BuildDataOneThread().getTime();//建立对象调用getTime();
    }
}
