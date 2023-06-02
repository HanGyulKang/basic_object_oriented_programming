package section1.객체;

public class 기능사용 {
    public static void main(String[] args) {
        기능명세 기능명세 = new 기능명세();
        기능명세.VolumeController volumeController = 기능명세.getVolumeController();
        기능명세.Member member = 기능명세.getMember();

        volumeController.increase(4);
        volumeController.decrease(3);

        int currentVolume = volumeController.volume();
        System.out.println(currentVolume);

        member.changePassword("123", "456");
    }
}
