package com.hillel.korzunov.homeworks.homework13;

public abstract class MusicStyles {
    private String groupName;
    private String trackName;

    public MusicStyles(String groupName, String trackName) {
        this.groupName = groupName;
        this.trackName = trackName;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getTrackName() {
        return trackName;
    }

    abstract void playMusic();
}
