package cn.xbmchina;

import java.util.Arrays;
import java.util.List;

public class Java8Test {
    public static void main(String[] args) {

//        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println(e));

//        Arrays.asList( "a", "b", "d" ).forEach( e -> {
//            String m = "9420 " +e;
//            System.out.print( m );
//        });

        Arrays.asList( "a", "b", "d" ).sort( (e1, e2 ) -> e1.compareTo( e2 ) );




    }
}
