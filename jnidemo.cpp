#include "jnidemo.h"
#include <jni.h>
#include <iostream>
using namespace std;
JNIEXPORT void JNICALL Java_jnidemo_sayHello
  (JNIEnv *, jobject) {
        cout << "Hello World!";
}