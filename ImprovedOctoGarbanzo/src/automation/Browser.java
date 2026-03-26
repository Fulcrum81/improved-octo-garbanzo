package automation;

public enum Browser {
    chrome("my/chrome/path/chrome.exe"),
    firefox("my/path/to/firefox.exe"),
    safari(""),
    opera(""),
    yandex(""),
    edge("");

    private  String path;

    Browser(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
