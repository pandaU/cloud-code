package com.xxribd.nest.nestmath.data;

import com.xxribd.nest.nestmath.NestMathApplicationTests;
import org.junit.jupiter.api.Test;


public class SegmentTest extends NestMathApplicationTests {

    @Test
    public void SegmentTest(){

        Segment s = new Segment(123.456576 , 432.432432);
        System.out.println(s.getX() +","+ s.getY());

    }

}
