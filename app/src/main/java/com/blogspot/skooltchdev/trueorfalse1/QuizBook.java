package com.blogspot.skooltchdev.trueorfalse1;


public class QuizBook {

    public static String[] questions = new String [] {
            "Magnets have two poles.",
            "Magnets have an East pole and a West pole.",
            "The Earth is not magnetic.",
            "Magnetic fields can clearly be seen with your eyes.",
            "The above diagram represents attraction between two magnets.",
            "An iron nail is attracted to a magnet.",
            "An electromagnet uses alternating current from the mains.",
            "An electromagnet is a temporary magnet.",
            "The above magnet is a disc magnet.",
    };

    public static int[] images = new int [] {
            R.drawable.img_0512, R.drawable.img_0516, R.drawable.img_0521, R.drawable.img_0522,
            R.drawable.img_0523, R.drawable.img_0525, R.drawable.img_0526, R.drawable.img_0527,
            R.drawable.img_0528
    };

    public static boolean[] answers = new boolean[]{
            true, false, false, false, true, true, false, true, true
    };
}
