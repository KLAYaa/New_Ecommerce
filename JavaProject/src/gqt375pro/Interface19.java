package gqt375pro;
interface Playable19 {
    void play();
}
interface Recordable19 {
    void record();
}
class MusicPlayer19 implements Playable19 {
    public void play() {
        System.out.println("Music is playing");
    }
}
class Recorder19 implements Recordable19 {
    public void record() {
        System.out.println("Audio is recording");
    }
}
public class Interface19 {
    public static void main(String[] args) {
        new MusicPlayer19().play();
        new Recorder19().record();
    }
}