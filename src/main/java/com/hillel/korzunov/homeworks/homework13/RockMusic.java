package com.hillel.korzunov.homeworks.homework13;

public class RockMusic extends MusicStyles {
    public RockMusic(String groupName, String trackName) {
        super(groupName, trackName);
    }

    @Override
    public void playMusic() {
        System.out.println('\u0022' + getGroupName() + '\u0022' + " is playing now, the track is " + '\u0022' +
                getTrackName() + '\u0022');
    }
}
