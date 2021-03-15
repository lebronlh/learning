package JUC;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        // 获取cpu的核数
        // CPU 密集型，IO密集型
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}

