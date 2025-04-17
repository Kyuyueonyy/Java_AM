package test;

public class TVUse {
    public static void main(String[] args) {
        //TV 2대 필요
        TV tv1 = new TV();
        tv1.ch = 1;
        tv1.vol = 10;
        tv1.onOff = true;
        tv1.watchYoutube();

        TV tv2 = new TV();
        tv2.ch = 2;
        tv2.vol = 20;
        tv2.onOff = false;
        tv2.watchYoutube();
    }
}
