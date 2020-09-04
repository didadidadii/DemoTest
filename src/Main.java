import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import jdk.nashorn.internal.ir.CatchNode;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.LongAdder;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InterruptedException, FileNotFoundException {
        /*
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zhangsan",18);
        for (test value : test.values()) {
            System.out.println(value);
        }
        System.out.println("code:"+test.ERROR.getCode());
        System.out.println("msg:"+test.ERROR.getMsg());
        System.out.println(test.ERROR);
        System.out.println(test.ERROR.ordinal());//获取枚举下表
         */
        /*
        StringBuffer buffer = new StringBuffer("123");
        System.out.println(buffer);
        buffer.append("xulihao").append("徐拉拉");
        System.out.println(buffer);
        System.out.println(buffer.toString());
        test1 test1 = new test1();
        Class aClass= test1.getClass();
        Method s1 = aClass.getMethod("s1", test1.getClass());
        Object invoke = s1.invoke(test1);
        System.out.println(invoke);*/
        /*
        ArrayList<String> strings = new ArrayList<>();
        for (String s : strings) {
            System.out.println(s);
        }*/
        /*String user="zhangsan";

        String s = user.replace("x", "xu");
        System.out.println(s);
        List<String> s1 = new ArrayList<>();
        s1.add("xu");
        s1.add("li");
        s1.add("hao");
        s1.add("li");
        Iterator<String> iterator = s1.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if("li".equals(next)){
                iterator.remove();
            }
        }
        System.out.println(s1.toString());
        String msg1 = test1.test3.msg1;
        System.out.println(msg1);*/
      /*  LongAdder adder = new LongAdder();
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i <1000 ; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    adder.add(1);
                }
            });
        }
        Thread.sleep(1000);
        long l = adder.sum();
        System.out.println(l);*/
        //File file = new File("d:",);
        String s = UUID.randomUUID().toString();
        System.out.println(s);
        System.out.println("---------------------");
        String replace = s.replace("-", "");
        System.out.println(replace);
        String test=null;
        InputStream inputStream = new FileInputStream("d");
        try {
            int read = inputStream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
