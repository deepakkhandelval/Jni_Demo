public class jnidemo {
    static {

        System.loadLibrary("jni");
    }

    public static void main(String[] args) {
        new jnidemo().sayHello();
    }

    // Declare a native method sayHello() that receives no arguments and returns void
    private native void sayHello();

}
