package com.example.uniteonelessontwo

import junit.framework.TestCase.assertTrue
import org.junit.Test


class ExampleUnitTest {

    /*
       * annotation lets the compiler know that it is test
       * and it change the way the code
    */
    @Test
    fun generates_number() {
        val dice = Dice(6)
        val rollResult = dice.roll()

        // check if number rolled in range 1 to 6
        assertTrue("The value of rollResult was not between 1 and 6",rollResult in 1..6)

    }
}