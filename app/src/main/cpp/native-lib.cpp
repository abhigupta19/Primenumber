#include <jni.h>
#include <string>
#include "primenumber.h"


extern "C"
JNIEXPORT jboolean JNICALL
Java_com_sar_user_ndk_MainActivity_isprime(JNIEnv *env, jobject instance, jint ab) {

    primenumber primenumber(ab);
    return (primenumber.isprime());

}