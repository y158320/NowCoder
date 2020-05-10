import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class TestWindowsCmd {

    public static void main(String[] args) {
        // Java调用 dos命令
        String cmd = "you-get https://www.bilibili.com/video/BV1Ei4y1t7wf?p=6";
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is,"GBK");
            BufferedReader br = new BufferedReader(isr);
            String content = br.readLine();
            while (content != null) {
                System.out.println(content);
                content = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void say()
    {
        for (int i=7;i<106;i++)
        {
            String cmd = "you-get https://www.bilibili.com/video/BV1Ei4y1t7wf?p=";
            System.out.println(cmd+i);
        }
    }

}