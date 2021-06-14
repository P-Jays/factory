public class OSFactory {
    public OS getSpecs(String os) {
        if (os == "Open") {
            return new Android();
        } else if (os == "Close") {
            return new Ios();
        } else {
            return new Nokia();
        }
    }
}
