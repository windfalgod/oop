package nguyenxuannghia_20001954.lab11.iterator.exercise2;

public class SocialSpammer {

    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Send " + message + " to " + profile.getEmail());
        }
    }
}
