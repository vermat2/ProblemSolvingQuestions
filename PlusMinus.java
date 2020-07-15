    static void plusMinus(int[] arr) {
        float plus=0, minus=0, zero=0;
        for(int i: arr){
            if(i > 0)
                plus++;
            else if(i < 0)
                minus++;
            else
                zero++;
        }
        float size = arr.length;
        System.out.format("%.6f\n", plus/size);
        System.out.printf("%.6f\n", minus/size);
        System.out.printf("%1$.6f\n", (float) zero/size);
    }
