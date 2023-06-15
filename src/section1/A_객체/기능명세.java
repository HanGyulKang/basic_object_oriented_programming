package section1.A_객체;

public class 기능명세 {

    public VolumeController getVolumeController() {
        return new VolumeController();
    }

    public Member getMember() {
        return new Member();
    }

    public class VolumeController {
        public void increase(int count) {
            // ...
        }

        public void decrease(int count) {
            // ...
        }

        public int volume() {
            int volume = 0;

            // ...

            return volume;
        }
    }

    public class Member {
        public void changePassword(String currentPassword, String newPassword) {
            // ...
        }
    }
}
