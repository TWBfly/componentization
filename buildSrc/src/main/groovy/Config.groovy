class Config {

    static gradleType = "" //识别gradle,赋值applicationId

    static isRelease = true  //true是集成化  false是组件化

    static appId = [
            app    : "win.tang.mycomponentizationt",
            library: "win.tang.library",
            order  : "win.tang.order",
    ]

    static appName = 'MyComponentizationt'

    static compileSdkVersion = 29
    static buildToolsVersion = "29.0.2"
    static minSdkVersion = 19
    static targetSdkVersion = 29
    static versionCode = 1
    static versionName = "1.0"// E.g. 1.9.72 => 1,009,072

    static kotlin_version = '1.3.50'

    static depConfig = [
            plugin : [
                    gradle: new DepConfig('com.android.tools.build:gradle:3.5.1'),
                    kotlin: new DepConfig("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"),
            ],
            support: [
                    kotlin          : new DepConfig("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlin_version"),
                    appcompat       : new DepConfig('androidx.appcompat:appcompat:1.1.0'),
                    core_ktx        : new DepConfig('androidx.core:core-ktx:1.1.0'),
                    constraintlayout: new DepConfig('androidx.constraintlayout:constraintlayout:1.1.3'),
            ],
    ]
}