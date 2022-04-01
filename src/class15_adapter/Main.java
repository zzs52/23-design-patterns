package class15_adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Desc:适配器模式
 * @author zzs
 * @date 2022/4/1 19:31
 */
public class Main {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("c:/test.text");
        // 中间加了这一层进行转化
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();
    }
}
