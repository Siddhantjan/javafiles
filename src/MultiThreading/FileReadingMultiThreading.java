package MultiThreading;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class FileReadingMultiThreading {
   static long startTime = System.nanoTime();
    public static void main(String[] args) {
        File filepath = new File("/home/siddhant/Downloads/files");
        File filesList[] = filepath.listFiles();
        int noOfThreads=10;
        Thread[] threads= new Thread[noOfThreads];
        final int filesPerThread = filesList.length/noOfThreads;
        final int remainingFiles = filesList.length%noOfThreads;

        for(int k = 0;k<noOfThreads;k++){
            final int thread =k;
            threads[k]=new Thread(){
                @Override
                public void run() {
                    try {
                        runThread(filesList,noOfThreads,thread,filesPerThread,remainingFiles);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            };
        }
        for(Thread t1: threads){
            t1.start();
        }
        for(Thread t2 : threads){
            try{
                t2.join();
            }
            catch (InterruptedException e){}
        }
    }

    private static void runThread(File[] filesList, int noOfThreads,
                                  int thread, int filesPerThread, int remainingFiles) throws IOException {
        List<File> inFiles = new ArrayList<>();
        long sum = 0;
        for(int i=thread*filesPerThread;i<(thread+1)*filesPerThread;i++){
            inFiles.add(filesList[i]);
            if(thread==noOfThreads -1 || remainingFiles >0){
                for(int j =filesList.length-remainingFiles;j<filesList.length;j++){
                    inFiles.add(filesList[j]);
                }
            }

            for(File file : inFiles){
//                BufferedReader br
//                        = new BufferedReader(new FileReader(file));
//                String st;
//                while ((st = br.readLine()) != null)
//                    System.out.println(st);

                long perFileTime = System.nanoTime() - startTime;
                sum+=perFileTime;
                System.out.println("process "+file.getName()+" in Thread "+Thread.currentThread().getName() + "in time "+perFileTime/1000000+" ms");
            }
        }
        System.out.println("Total Time to execute all files : "+(sum/1000000)+" ms");
    }
}
