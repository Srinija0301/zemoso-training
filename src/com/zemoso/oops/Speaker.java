package com.zemoso.oops;

//polymorphism
public class Speaker extends Earphones implements SoundDevice {
    public void playSound() {
        System.out.println("com.zemoso.oops.Speaker is playing sound");
    }

    public void maxSound() {
        System.out.println("50db");
    }

    public void alterSound(int volume) {
        System.out.println("Increased volume by " + volume);
    }

    public void alterSound(int volume, int bass) {
        System.out.println("Increased volume by " + volume + "and bass by" + bass);
    }
}
