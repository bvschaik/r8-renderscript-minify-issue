package com.example.renderscriptminifytest.library

import androidx.annotation.Keep

@Keep
class ClassThatUsesBitCode {
    fun test() {
        TestBitCode.getBitCode32()
        TestBitCode.getBitCode64()
    }
}
