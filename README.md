# bootstrap

基于Macaca-Java版的UI自动化实现demo

### 安装Macaca环境

参考链接：[https://macacajs.github.io/macaca/getting-started.html](https://macacajs.github.io/macaca/getting-started.html)

### 下载源码

```
$ git clone https://github.com/Yinxl/autoui.git
```

### 更新依赖

```
$ cd bootstrap
$ mvn -s settings.xml clean install
```

如果下载依赖过程中报错，可能是由于mvn -s命令没有生效导致的，建议将根目录下settings.xml中的依赖配置到本地Maven目录下的settings.xml中。

### 如何修改目标平台 ios/android?

```
//package com.javademo.common;
// Config.java
 // 目标平台- ios android 
   public static final String PLATFORM = "ios"; 
```
注意：执行iOS用例时需要将XCode升级到最新的8.1，执行用例前请先启动目标模拟器。

### 启动server

```
$ macaca server --verbose
```

注意启动server时不能加代理，因为server在本机启动需要连接localhost,加代理会导致无法建立连接。
### 执行测试用例

```
$ mvn test 
```