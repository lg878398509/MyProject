#include<stdio.h>
#include<jni.h>
#include<stdlib.h>
#include"cn_itcast_monitor_DemoActivity.h"
#include"cn_itcast_lame_LameActivity.h"


int getpressure(){
  // c语言中的随机数
    return rand();
}




JNIEXPORT jint JNICALL Java_cn_itcast_monitor_DemoActivity_getPressure
  (JNIEnv * env, jobject obj){

	return getpressure();


}
