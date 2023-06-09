package nguyenxuannghia_20001954.lab11.bridge.exercise1;

public class PC extends Computer {

    public PC(OperatingSystem os) {
        super(os);
    }

    @Override
    public void startup() {
        os.startup();
        System.out.println(" PC");
    }

    @Override
    public void browseInternet(String url) {
        os.loadUrl(url);
    }

    @Override
    public boolean canMoveComputer() {
        return false;
    }
}
