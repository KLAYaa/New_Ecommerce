package gqt375pro;
interface Play20 {
    void play();
}

interface Record20 {
    void record();
}

class MusicSystem20 implements Play20 {
    public void play() {
        System.out.println("Song playing");
    }
}

class VoiceRecorder20 implements Record20 {
    public void record() {
        System.out.println("Voice recording");
    }
}

public class Interface20 {
    public static void main(String[] args) {
        new MusicSystem20().play();
        new VoiceRecorder20().record();
    }
}