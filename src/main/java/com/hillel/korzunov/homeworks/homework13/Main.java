package com.hillel.korzunov.homeworks.homework13;

public class Main {
    public static void main(String[] args) {

        MusicStyles[] musicStyles = {
                new ClassicMusic("Mozart", "Requiem"),
                new ClassicMusic("Beethoven", "Symphony #13"),
                new RockMusic("Metallica", "Nothing else matters"),
                new RockMusic("SOAD", "Toxicity"),
                new PopMusic("Ketty Perry", "I kissed a girl"),
                new PopMusic("Roxette", "Listen to your heart")
        };

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }

    }
}
