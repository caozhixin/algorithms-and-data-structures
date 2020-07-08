package data_structures.bitmap;

import org.roaringbitmap.BitSetUtil;
import org.roaringbitmap.RoaringBitmap;

import java.util.BitSet;

/**
 * java 中自带了bitmap的实现：BitSet
 */
public class BitSetTest {

    public static void main(String[] args) {
        BitSet bs = new BitSet();

        bs.set(2);
        bs.set(22);
        bs.set(222);
        bs.set(2222);
        bs.set(22222);
        bs.set(222222);
        bs.set(2222222);
        bs.set(22222222);
        bs.set(222222222);
        // 由于jdk自带的BitSet索引依赖与int，所以最大索引位受int限制
        bs.set(Integer.MAX_VALUE);

        System.out.println("bs = " + bs); //bs = {2, 22, 222, 2222, 22222, 222222, 2222222, 22222222, 222222222, 2147483647}

        System.out.println("bs.get(222) = " + bs.get(222)); // bs.get(222) = true
        System.out.println("bs.get(1) = " + bs.get(1)); // bs.get(1) = false


        // RoaringBitmap 可以处理16^8 的数据量, 数据可以扩大一倍，近43亿数据
//        <!-- https://mvnrepository.com/artifact/org.roaringbitmap/RoaringBitmap -->
//        <dependency>
//            <groupId>org.roaringbitmap</groupId>
//            <artifactId>RoaringBitmap</artifactId>
//            <version>0.6.51</version>
//        </dependency>

        RoaringBitmap rbm = new RoaringBitmap();
        RoaringBitmap bitmap = BitSetUtil.bitmapOf(bs);
//        bitmap.add(222222222222L,222222222223L);
        bitmap.add(4294967292L, 4294967296L);
//        rangeStart=222222222222 should be in [0, 0xffffffff]
//        0xffffffff = 4294967296

        System.out.println("bitmap = " + bitmap);
    }

}
