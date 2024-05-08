package com.codely.demo

import com.codely.demo.testing.App
import com.codely.demo.testing.Clock
import com.codely.demo.testing.Reader
import com.codely.demo.testing.Writer

fun main() {
    App(Reader(), Writer(), Clock()).execute()
}
