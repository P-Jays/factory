public class App {
    public static void main(String[] args) throws Exception {
       OS myphone = new Android();
       myphone.specs();
        // we don't want the user can see the os that we write
        // so we create the factory

        OSFactory factory = new OSFactory(); // with factory we can hide the class
        OS myRealPhone = factory.getSpecs("Close");
        myRealPhone.specs();

    }
}
