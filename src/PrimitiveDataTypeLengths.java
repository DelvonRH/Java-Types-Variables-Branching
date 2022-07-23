
public class PrimitiveDataTypeLengths 
{

	public static void main(String[] args) 
	{
		int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        
        //This is the minimum value that can be stored
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        //This is the maximum value that can be stored.
        System.out.println("Integer Maximum Value = " + myMaxIntValue + "\n");
        
        // By adding one more to the max amount that an integer holds we get a negative number because it is an Overflow
        System.out.println("Busted Integer MAX value = " + (myMaxIntValue + 1));
        
        // By subtracting one from the minimum amount that an integer hold we get a positive number because this is an Underflow
        System.out.println("Busted Integer MIN value = " + (myMinIntValue - 1) + "\n");

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        
        //This is the minimum value that can be stored
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        //This is the maximum value that can be stored.
        System.out.println("Byte Maximum Value = " + myMaxByteValue + "\n");

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        
        //This is the minimum value that can be stored
        System.out.println("Short Minimum Value = " + myMinShortValue);
        //This is the maximum value that can be stored.
        System.out.println("Short Maximum Value = " + myMaxShortValue + "\n");
        
        long myLongValue = 100;
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        
        //This is the minimum value that can be stored
        System.out.println("Long Minimum Value = " + myMinLongValue);
        //This is the maximum value that can be stored.
        System.out.println("Long Maximum Value = " + myMaxLongValue + "\n");
        
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
	}

}
